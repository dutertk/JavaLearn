package mapreducedemo;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * KEYIN : 是map task 读取到的数据的key类型，是一行的起始偏移量 VALUEIN: 是map task
 * 读取到的数据的value类型，是一行的内容 KEYOUT: 用户的自定义map方法要返回的结果kv数据的key的类型，此处为String
 * VALUEOUT:用户的自定义map方法要返回的结果kv数据的value类型，此处为Interger
 * 
 * 
 * mapreduce中map产生的数据需要传输给reduce，需要进行序列化和反序列化，而jdk中的原生序列化机制产生
 * 的数据量比较冗余，就会导致传输效率低下，因此hadoop专门设计了自己的序列化机制，所以，mapreduce中传输
 * 的数据类型必须实现hadoop自己的序列化接口
 * 
 * hadoop为jdk中的常用基本类型封装了自己的实现了hadoop序列化接口的类型： LongWritable,Text,IntWritable
 * 
 * @author tangkai
 *
 */

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	
	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
	    //切单词
		String line = value.toString();
		String[] strings = line.split(" ");
		for (String str : strings) {
			context.write(new Text(str), new IntWritable(1));
		}
		
	}
	

}
