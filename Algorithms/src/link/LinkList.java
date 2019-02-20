package link;

public class LinkList {
	private Link first;
	
	//插入
	public void insert(int value) {
		Link lnk = new Link(value);
		if(first == null) {
			first = lnk;
		}else {
			lnk.setNext(first);
			first = lnk;
		}
	}
	
	//显示链表中所有的数据
	public void displayAll() {
		Link current = first;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}

}
