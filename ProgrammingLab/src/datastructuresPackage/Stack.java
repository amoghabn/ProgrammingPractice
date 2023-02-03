package datastructuresPackage;

public class Stack {

	private int[] a;
	private int capacity;
	private int top;
	
	Stack(int size){
		a = new int[size];
		capacity = size;
		top =-1;
	}
	
	public void push(int i) {
		if(isfull()) {
			System.out.println("Sack is overflowing");
			System.exit(1);
		}
		System.out.println("Inserting "+i);
		a[++top]=i;
		
	}
	
	public int pop(int i) {
		if(isempty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}	
		return a[top--];
	}
	
	
	public int size() {
		return top+1;
	}
	
	public boolean isfull() {
		return top == capacity - 1;
	}
	
	public boolean isempty() {
		return top == -1;
	}
	
	public void printStack() {
		for(int i=0; i<capacity; i++) 
			System.out.println(a[i]);
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(6);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.printStack();
	}
}
