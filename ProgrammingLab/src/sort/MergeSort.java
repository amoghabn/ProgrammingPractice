package sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = {3,5,2,7,9,8,4,1,11,6,10};
		
		System.out.println("Before");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+", ");
		}
		mergeSort(array);
		System.out.println();
		System.out.println("After");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+", ");
		}

	}
	
	public static int[] mergeSort(int[] inputArray) {
		int length = inputArray.length;
		if(length<2) {
			return inputArray;
		}
		int midindex=length/2;
		int[] lefthalf= new int[midindex];
		int[] righthalf= new int[length-midindex];
		for(int i=0; i<midindex; i++) {
			lefthalf[i]=inputArray[i];
		}
		for(int i=midindex; i<length; i++) {
			righthalf[i-midindex] = inputArray[i];
		}
		mergeSort(lefthalf);
		mergeSort(righthalf);
		merge(inputArray, lefthalf, righthalf);
		return inputArray;
	}
	
	public static void merge(int[] inputArray, int[] lefthalf, int[] righthalf) {
		int i=0, j=0, k=0;
		while(i<lefthalf.length && j<righthalf.length) {
			if(lefthalf[i]<righthalf[j]) {
				inputArray[k]=lefthalf[i];
				i++;
			}
			else {
				inputArray[k]=righthalf[j];
				j++;
			}
			k++;
		}
		while(i<lefthalf.length) {
			inputArray[k]=lefthalf[i];
			i++;
			k++;
		}
		while(j<righthalf.length) {
			inputArray[k]=righthalf[j];
			j++;
			k++;
		}
		
	}
}
