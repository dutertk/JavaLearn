package tk.learnjavaday04.list;

import java.util.ArrayList;

public class Order {

	// 订单
	String orderId;

	// 订单包含商品
	ArrayList<Product> arrayListproduct;

	// 订单所属用户
	User user;

	// 总费用
	float totalfees;

	// 应付费用
	float feestoPay;

	// 计算总费用并给对象的属性赋值
	public void fees() {
		float totalfees = 0.0f;
		for (int i = 0; i < this.arrayListproduct.size(); i++) {

			totalfees += (this.arrayListproduct.get(i).price * this.arrayListproduct.get(i).number);

		}
		this.totalfees = totalfees;
	}

	// 计算应付费用
	public void feestoPay() {
		// 根据总金额打折
		float temp = this.totalfees;
		if (this.totalfees >= 1000 && this.totalfees < 2000) {
			temp = totalfees * 0.98f;
		} else if (this.totalfees >= 2000 && this.totalfees < 3000) {
			temp = totalfees * 0.95f;
		} else if (this.totalfees > 3000) {
			temp = totalfees * 0.90f;
		}

		// 根据用户VIP等级进行打折
		if (this.user.vipLevel.equals("黄金vip")) {
			temp = temp * 0.96f;
		} else if (this.user.vipLevel.equals("至尊vip")) {
			temp = temp * 0.92f;
		}
		this.feestoPay = temp;
	}

}
