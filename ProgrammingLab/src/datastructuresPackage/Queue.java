package datastructuresPackage;

public class Queue {
	int size =5;
	int[] a = new int[size];
	int front, rear;

	Queue(){
		rear = -1;
		front = -1;
		
	}
	
	public boolean isFull() {
		if(front == 0 && rear == size -1 )
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(front == -1)
			return true;
		return false;
	}
	
	public void enQueue(int i) {
		if(isFull())
			System.out.println("Queue Full");
		else {
			if(front == -1) 
				front = 0;
			a[++rear] = i;
		}
	}
	
	public int deQueue() {
		int element;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
		element = a[front];
			if(front>=rear) {
				rear =-1;
				front =-1;
			}
			else
				front++;
			return element;
		}	
		
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			System.out.print("\nFront Index-> " + front);
			System.out.print("Items -> ");
			for(int i=front; i<=rear; i++)
				System.out.print(a[i]+ " ");
			System.out.print("\nRear Index-> " + rear);
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();

	    // deQueue is not possible on empty queue
	    q.deQueue();

	    // enQueue 5 elements
	    q.enQueue(1);
	    q.enQueue(2);
	    q.enQueue(3);
	    q.enQueue(4);
	    q.enQueue(5);

	    // 6th element can't be added to because the queue is full
	    q.enQueue(6);

	    q.display();

	    // deQueue removes element entered first i.e. 1
	    q.deQueue();

	    // Now we have just 4 elements
	    q.display();


	}

}
