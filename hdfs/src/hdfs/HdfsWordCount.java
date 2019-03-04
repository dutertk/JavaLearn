package hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class HdfsWordCount {
	public static void main(String[] args) throws Exception {
		FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.141.4:9000/"), new Configuration(), "root");

		// 通过配置文件获取mapper接口的实现类
		Properties properties = new Properties();
		properties.load(HdfsWordCount.class.getClassLoader().getResourceAsStream("job.properties"));
		
		//必须是包名加类名，否则会找不到类
		Class<?> mapper_class = Class.forName(properties.getProperty("Mapper_Class"));
		
		//java9以后不再推荐使用mapper_class.newInstance();
		Mapper mapperInstance = (Mapper) mapper_class.getDeclaredConstructor().newInstance();
		
		//实例化context类
		Context context = new Context();
		
		// 获取hdfs所要读取文件目录下的所有文件
		RemoteIterator<LocatedFileStatus> listFiles = fileSystem.listFiles(new Path("/wordcount/input/"), false);
		// 遍历获得的文件
		while (listFiles.hasNext()) {
			LocatedFileStatus file = listFiles.next();
			// 字符串缓冲流
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileSystem.open(file.getPath())));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				mapperInstance.Mapper(line, context);
			}
			bufferedReader.close();
		}
		
		//输出hashmap
		 HashMap<Object, Object> finalResult = context.getContextHashMap();
		 FSDataOutputStream fsDataOutputStream = fileSystem.create(new Path("/wordcount/output/res/dat"));
		 
		Set<Entry<Object, Object>> resultEntrySet = finalResult.entrySet();
		for(Entry<Object,Object> entry : resultEntrySet) {
			fsDataOutputStream.write((entry.getKey() +"\t" + entry.getValue() +"\n").getBytes());
		}
		fsDataOutputStream.flush();
		fsDataOutputStream.close();
		
	}

}
