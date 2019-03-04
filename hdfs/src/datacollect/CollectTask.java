package datacollect;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.UUID;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import com.sun.jersey.server.impl.uri.PathTemplate;

import io.netty.util.TimerTask;

public class CollectTask extends java.util.TimerTask {

	@Override
	public void run() {
		// 获取采集日期
		SimpleDateFormat logdate = new SimpleDateFormat("yyyy-MM-dd-HH");

		/**
		 * 定时探测日志源目录 获取需要采集的文件 移动这些文件到待上传的临时目录 遍历临时目录，逐一上传到hdfs的目标路径
		 */
		File sourceDirectory = new File("/users/tangkai/datacollect/");
		File[] fileList = sourceDirectory.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.startsWith("access.log."))
					return true;
				return false;
			}
		});
		// 将要采集的文件移动到待上传的目录
		File toUploadDirctory = new File("/users/tangkai/datatoupload");
		for (File file : fileList) {
			file.renameTo(toUploadDirctory);
		}
		Configuration conf = new Configuration();

		try {
			FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.141.4:9000/"), conf, "root");
			
			File[] filesToUpload = toUploadDirctory.listFiles();
			
			for (File file : filesToUpload) {
				fileSystem.copyFromLocalFile(new Path(file.getAbsolutePath()),
						new Path("/log/" + logdate + "/access_log_" + UUID.randomUUID() + ".log"));
				file.renameTo(new File("/users/tangkai/databackup/" + logdate));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
