package arrays;


//rearrange a given array of integers such that the result array will have
//largest,smallest,second largest,second smallest,third largest .......go on
public class Rearrange {

//    public static void rearrange(long arr[], int n, int count){
//        if(count>(n-2))
//        	return;
//    	int k=count,m=count;
//        long l=arr[count], s=arr[count];
//        for(int i=count; i<n; i++){
//            if(arr[i]>l){
//                l=arr[i];
//                k=i;
//            }
//            if(arr[i]<s){
//                s=arr[i];
//                m=i;
//            }
//        }
//        arr[k]=arr[count];
//        arr[m]=arr[count+1];
//        arr[count]=l;
//        arr[count+1]=s;
//        count+=2;
//        rearrange(arr, n, count);
//
//        
//        
//    }
    
    public static void rearrange(long arr[], int n){
    	int count = arr.length-n;
    	if(count>(arr.length-2)){
            return;
        }
        
        int k=count,m=count;
        long l=arr[count], s=arr[count];
        for(int i=count; i<arr.length; i++){
            if(arr[i]>l){
                l=arr[i];
                k=i;
            }
            if(arr[i]<s){
                s=arr[i];
                m=i;
            }
        }
        long temp1= arr[count];
        long temp2= arr[count+1];
        arr[count]=l;
        arr[count+1]=s;

        if(temp1==s && temp2!=l){
            arr[k]=temp2;
        }
        else if(temp2==l && temp1!=s) {
        	arr[m]=temp1;
        }
        else {
            arr[k]=temp1;
            arr[m]=temp2;
        }
            
        
        n-=2;
        rearrange(arr,n);

        
        
    }
	
	public static void main(String[] args) {
		long[] a = {2,3,5,4,1,7,10,8,9,6,11,12,13,14,15,16,17,18,19};
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		rearrange(a,19);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
