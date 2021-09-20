package assignment.session.service;
import java.util.Scanner;

public class Services {

	public void checkTarget(int[] arr, int flag) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of target");
		
		int target = sc.nextInt();
		
		int counter = 0;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum = sum + arr[i];
			counter += 1;
			
			if (counter <= flag && sum >= target) {
				System.out.println("Target achieved after "+counter+" transactions");
				break;
			}			
		}
		
		if (sum < target) {
			System.out.println("Given target is not achieved");
		}
		
	}
}
