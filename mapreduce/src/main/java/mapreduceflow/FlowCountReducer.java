package mapreduceflow;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class FlowCountReducer extends Reducer<Text, FlowBean, Text, FlowBean> {

	@Override
	protected void reduce(Text key, Iterable<FlowBean> values, Context context)
			throws IOException, InterruptedException {

		int upflowSum = 0;// 上行总流量
		int downflowSum = 0;// 下行总流量

		for (FlowBean value : values) {
			upflowSum += value.getUpFlow();
			downflowSum += value.getDownFlow();
		}
		
		context.write(key, new FlowBean(key.toString(), upflowSum, downflowSum));

	}

}
