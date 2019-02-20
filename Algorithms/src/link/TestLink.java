package link;

public class TestLink {
	public static void main(String[] args) {
		Link link1 = new Link(8);
		Link link2 = new Link(45);
		Link link3 = new Link(12);
		Link link4 = new Link(33);
		link1.setNext(link2);
		link2.setNext(link3);
		link3.setNext(link4);
		
		System.out.println(link1.getData());
		System.out.println(link2.getNext().getData());
		
	}

}
