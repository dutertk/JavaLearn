package mapreducedemo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class JobSubmitterOnLinux {
	
	public static void main(String[] args) throws Exception {
		
		Configuration conf = new Configuration();
		
		//设置job提交到哪里运行
//		conf.set("mapreduce.framework.name", "yarn");
//		conf.set("yarn.resourcemanager.hostname", "Master");
//		conf.set("mapreduce.app-submission.cross-platform", "true");
		
		Job job = Job.getInstance(conf);
		
		//jar包的位置根据正在运行的类，判断jar包的位置
		job.setJarByClass(JobSubmitterOnLinux.class);
		//也可以写到具体位置
		//job.setJar("jar包地址");
		
		//本次job所要调用的Mapper实现类、Reducer实现类
		job.setMapperClass(WordCountMapper.class);
		job.setReducerClass(WordCountReducer.class);
		
		//本次job的Mapper、Reducer实现类产生的结果数据的key、value类型
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		//本次job要处理的输入数据集所在路径、最终结果输出路径
		FileInputFormat.setInputPaths(job, new Path("/wordcount/input"));
		FileOutputFormat.setOutputPath(job, new Path("/mrwordcount/output"));//注：输出路径必须不存在
		
		//想要启动的reduce task的数量（默认为1）
		
		job.setNumReduceTasks(2);
		
		boolean res = job.waitForCompletion(true);
		System.exit(res?0:1);
		
	}
}
