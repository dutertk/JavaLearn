package mapreduceflow;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class FlowCountMapper extends Mapper<LongWritable, Text, Text, FlowBean> {

	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		String line = value.toString();
		String[] dataStrings = line.split("\t");
		
		String phoneNumber = dataStrings[1];
		int upFlow = Integer.parseInt(dataStrings[dataStrings.length - 3]);
		int downFlow = Integer.parseInt(dataStrings[dataStrings.length - 2]); 
		
		context.write(new Text(phoneNumber), new FlowBean(phoneNumber,upFlow, downFlow));
	}
	
	
	
	
	

}
