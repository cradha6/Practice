
public class MLinkedList {

	private int size;
	private Node head;
	
	public void add(Object data){
		
		Node node = new Node(data);
		if(head == null){
			head = node;
		}else{
			node.next = head;
			head = node;
		}
		size++;
	}
	
	public void addWithIndex(int index,Object data){
		
		Node node = new Node(data);
		if( head == null){
			head = node;
		}else{
			Node temp = head;
			if(index < size){
				for(int i=0;i<index;i++)
					temp = temp.next;
				node.next = temp.next;
				temp.next = node;
			}
		}size++;
		
		
	}
	
	public void remove(int index){
//		Node returnNode = null;
		if(index > 0 && index < size){
			Node temp = head;
			for(int i = 0;i< index-1;i++){
				temp = temp.next;
			}
			
			
//			returnNode = temp.next;
//			returnNode.next = null;
//			
			temp.next = temp.next.next;
			size--;
				
		}
//		return returnNode;
	}
	
	public void addLast(Object data){
		Node node = new Node(data);
		if(head == null){
			head = node;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = node;
//				head = temp;
			node = null;
		}
		size++;
	}
	@Override
	public String toString() {
		
		Node temp = head;
		String result =" ";
		
		if(temp != null){
			while(temp != null){
				result += "[ "+temp.data.toString()+" ]";
				temp = temp.next;
			}
		}
		else{
			result = null;
		}
		return result;
	}
	
	private static class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		
		MLinkedList list = new MLinkedList();
		list.addLast("20");
		list.addLast("30");
		list.addLast("40");
		list.addLast("50");
		list.addLast("60");
		
		MLinkedList  list1 = new MLinkedList();
		System.out.println();
		list1.add("20");
		list1.add("30");
		list1.add("40");
		list1.add("50");
		list1.add("60");
		System.out.println(list.size);
		
		list1.addWithIndex(2, "35");
		list1.addWithIndex(1, "45");
		
		System.out.println("list:: "+list);
		System.out.println("list:: "+list1);
		
		list1.remove(3);
//		System.out.println("Removing node "+ list1.remove(3));
		
		System.out.println("list:: "+list1);
		
		
		
	}
	
	
}
