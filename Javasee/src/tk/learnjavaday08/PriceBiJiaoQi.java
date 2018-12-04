package tk.learnjavaday08;

public class PriceBiJiaoQi implements BiJiaoQi<Product> {

	@Override
	public boolean BiJiao(Product t1, Product t2) {
		if(t1.getPrice() < t2.getPrice()) {
			return true;
			
		}
		return false;
	}
	

}
