package array;

public class Single_Dimensional_Array {

	public static void main(String[] args) {
		/*In Array there is a homogeneous array
		 * homogenous means single type of data 
*/
		int arr[] = new int[6];
		//in array we declare a size
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}

}
