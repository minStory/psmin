package day41;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {8,1,2,5,4,3,6,7};
//		for(int k=0 ; k<arr.length ; k++) {
//			System.out.print(arr[k]+" ");
//		}  
//		System.out.println();
		for(int i=1 ; i<arr.length ; i++) {
			int idx=i;
			for(int j=i-1 ; j>=0 ; j--) {
				if(arr[j]>arr[idx]) {
					int temp=arr[j];
					arr[j]=arr[idx];
					arr[idx]=temp;
					idx=j;
//					for(int k=0 ; k<arr.length ; k++) {
//						System.out.print(arr[k]+" ");
//					}
//					System.out.println();
				}
				else {
					break;
				}
			}
		}
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
