package datastructuresPackage;



//Dynamic Array , for example ArrayList
public class Arays {
	private int items[];
	private int count=0;
	
	 public Arays(int size) {
		items = new int[size];
	 }
	 
	 public void print() {
		 for(int i=0; i<count; i++) {
			 System.out.println(items[i]);
		 }
	 }
	 
	 public void insert(int num) {
		 if(items.length==count) {
			 int[] newItems = new int[2*count];
			 for(int j=0; j<count; j++) {
				 newItems[j]=items[j];	 
			 }
			 items= newItems;
		 }
	     items[count++]=num;
	 }
	 
	 public void removeAt(int index) {
		 if(index<0 || index>=count) {
			 throw new IllegalArgumentException();
		 }
		 for(int i=index; i<count-1; i++) {
			 items[i]=items[i+1];
		 }	
		 count--;
			 
	 }
	 
	 public int indexOf(int num) {
		 for(int i=0; i<count; i++) {
			 if (items[i]==num)
				 return i;
		 }
		 return -1;
	 }
	
	
	
	

	public static void main(String[] args) {
		Arays a = new Arays(4);
		
		a.insert(1);
		a.insert(2);
		a.insert(3);
		a.insert(4);
		a.insert(5);
		a.insert(6);
		a.insert(7);
		a.insert(8);
		System.out.println(a.indexOf(6));
		

	}

}