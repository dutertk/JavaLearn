package hdfs;

import io.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.BufferedFSInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.tools.DFSAdmin;
import org.junit.*;

public class HdfsClientDemo {
	public static void main(String[] args) throws Exception {
		// new Configuration()会从项目的classpath中加载core-default.xml，hdfs—default.xml等文件
		Configuration conf = new Configuration();
		// 指定本客户端上传文件到hdfs时需要保存的副本数
		conf.set("dfs.replication", "2");
		// 指定本客户端上传文件到hdfs时切块的规格大小：64M
		conf.set("dfs.blocksize", "64M");
		/**
		 * 以上配置的信息都可以从官方文档中查到
		 */

		// 构造一个访问指定HDFS系统的客户端对象
		FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.141.4:9000/"), conf, "root");

		// 上传一个文件到HDF
		Path srcPath = new Path("/users/tangkai/downloads/jdk.rpm");
		Path dstPath = new Path("/filereceived/");
		fileSystem.copyFromLocalFile(srcPath, dstPath);
		fileSystem.close();

	}

	FileSystem fileSystem = null;

	@Before
	public void init() throws Exception {
		Configuration conf = new Configuration();
		conf.set("dfs.replication", "2");
		conf.set("dfs.size", "64M");
		fileSystem = FileSystem.get(new URI("hdfs://192.168.141.4:9000/"), conf, "root");
	}
	
	@Test
	public void getTest() throws Exception {
		fileSystem.copyToLocalFile(new Path("/filereceived/jdk.rpm"), new Path("/users/tangkai/desktop"));
		
		
	}
	
	/**
	 * 
	 * 在hdfs内部拷贝文件
	 * 通过输入输出流来进行文件的读和写
	 */
	@Test
	public void copyInHdfs() throws Exception{
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileSystem.open(new Path("/filereceived/jdk.rpm")));
		byte[] bytes = new byte[bufferedInputStream.read()];
		bufferedInputStream.read(bytes);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileSystem.create(new Path("/aa/jdk.rpm.bak")));
		bufferedOutputStream.write(bytes);
		
		bufferedInputStream.close();
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
		
	}
	
	/**
	 * 读取hdfs中的文件
	 */
	

}
