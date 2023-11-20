package day41;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {8,1,2,5,4,3,6,7};
//		for(int k=0 ; k<arr.length ; k++) {
//			System.out.print(arr[k]+" ");
//		}
//		System.out.println();
		for(int i=arr.length-1 ; i>=0 ; i-- ) {
			for(int j=0; j<i ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
//					for(int k=0 ; k<arr.length ; k++) {
//						System.out.print(arr[k]+" ");
//					}
//					System.out.println();
				}
			}
		}
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
