package mapreduceflow;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class FlowJobSubmitter {
	public static void main(String[] args) throws Exception {
		
		Configuration conf = new Configuration();

		Job job = Job.getInstance(conf);
		
		job.setJarByClass(FlowJobSubmitter.class);
		
		job.setMapperClass(FlowCountMapper.class);
		job.setReducerClass(FlowCountReducer.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(FlowBean.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(FlowBean.class);
		
		
		FileInputFormat.setInputPaths(job, new Path("/Users/tangkai/FlowMapReduce/Input"));
		FileOutputFormat.setOutputPath(job, new Path("/Users/tangkai/FlowMapReduce/Output"));
		
		job.waitForCompletion(true);
		
	}
}
