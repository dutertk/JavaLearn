package mapreduceflow;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
/**
 * 这个demo的功能：演示自定义数据类型如何实现hadoop的序列化接口
 * 1、这个类必须保留空参构造方法
 * 2、write方法中输出二进制数据的顺序必须与readFields方法读取数据的顺序一致
 * @author tangkai
 */
import org.apache.hadoop.io.Writable;

public class FlowBean implements Writable {
	private int upFlow;// 上行流量
	private int downFlow;// 下行流量
	private int totalFlow;
	private String phoneNumber;

	public FlowBean() {};

	public FlowBean(String phoneNumber, int upFlow, int downFlow) {
		this.phoneNumber = phoneNumber;
		this.upFlow = upFlow;
		this.downFlow = downFlow;
		this.totalFlow = upFlow + downFlow;
	}

	public int getUpFlow() {
		return upFlow;
	}

	public void setUpFlow(int upFlow) {
		this.upFlow = upFlow;
	}

	public int getDownFlow() {
		return downFlow;
	}

	public void setDownFlow(int downFlow) {
		this.downFlow = downFlow;
	}

	public int getTotalFlow() {
		return totalFlow;
	}

	public void setTotalFlow(int totalFlow) {
		this.totalFlow = totalFlow;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "流量统计：[上行流量：" + upFlow + ", 下行流量：" + downFlow + ", 总流量：" + totalFlow + "]";
	}

	/**
	 * hadoop 在序列化该类的对象时要调用的方法
	 */
	@Override
	public void write(DataOutput out) throws IOException {
		out.writeInt(upFlow);
		out.writeUTF(phoneNumber);
		out.writeInt(downFlow);
		out.writeInt(upFlow + downFlow);
	}

	/**
	 * hadoop 在反序列化该类的对象时要调用的方法
	 */
	@Override
	public void readFields(DataInput in) throws IOException {
		this.upFlow = in.readInt();
		this.phoneNumber = in.readUTF();
		this.downFlow = in.readInt();
		this.totalFlow = in.readInt();

	}

}
