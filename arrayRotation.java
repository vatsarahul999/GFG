import java.util.*;
public class arrayRotation{
	
	public static int gcd(int a, int b) {
 		 return a == 0 ? b : gcd(b % a, a);
	}
	
	public static void rotateArray(int [] arr,int d){
		if (d >= arr.length )
			return;
		int t =  gcd(d,arr.length);
		System.out.println("gcd : "+t);
		for(int i = 0 ; i < t; i++){
			System.out.println("In loop ");
			int temp = arr[i];
			int sIdx = i,cIdx=0;
			while(true){
				cIdx = (sIdx + d) % arr.length;
				if(cIdx == i)
					break;
				arr[sIdx] = arr[cIdx];
				sIdx = cIdx; 
			}
			arr[sIdx] = temp;


		}


	}

		
	public static void main(String [] args){
		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		for(int i:arr)
			System.out.print(i+"\t");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want rotated:");
		int d = sc.nextInt();
		rotateArray(arr,d);
		System.out.println("The array is now:");
		for(int i:arr)
                        System.out.print(i+"\t");
                System.out.println();


	}

}
