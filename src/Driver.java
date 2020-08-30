public class Driver {

	public static void main(String[] args) {
		
		ArrayQ arrayQ = new ArrayQ();
		
		arrayQ.enqueue(1);
		arrayQ.enqueue(7);
		arrayQ.enqueue(3);
		arrayQ.enqueue(4);
		arrayQ.enqueue(9);
		arrayQ.enqueue(2);
		
		// Dequeue elements in the array
		while (arrayQ.size() > 0) {
			System.out.println(arrayQ.dequeue());
		}
		System.out.println("Queue is empty.");

		LinkedQueue linkedQ = new LinkedQueue();
		
		linkedQ.enqueue(1);
		linkedQ.enqueue(7);
		linkedQ.enqueue(3);
		linkedQ.enqueue(4);
		linkedQ.enqueue(9);
		linkedQ.enqueue(2);
		
		// Dequeue
		while (linkedQ.size() > 0) {
			System.out.println(linkedQ.dequeue());
		}
		System.out.println("Queue is empty.");
		
		// Extra LinkedQueue for exercise 2
		
		linkedQ.enqueue(3);
		linkedQ.enqueue(7);
		linkedQ.enqueue(2);
		linkedQ.enqueue(4);
		linkedQ.enqueue(5);
		
		linkedQ.removeMiddle();
	}

}
