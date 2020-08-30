// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;
	
	LinkedQueue() {
		front = rear = null;
		count = 0;
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode;
		else 
			front = newNode;
		rear = newNode;
		count++;
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x;
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}
	
	public String toString() {
		String str = "";
		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		return str;
	}
	
	public void removeMiddle() {
		
		int half = size() / 2;
		
		if (count % 2 == 0) {
			half = half-1;
		}
		int count = 0;
		LinkedNode cur = front;
		LinkedNode prev = null;
		
		while (cur != null) {
			if (count == half) {
				prev.next = cur.next;
				break;
			}
			prev = cur;
			cur = cur.next;
			count++;
		}
		System.out.println(toString());
	}
}