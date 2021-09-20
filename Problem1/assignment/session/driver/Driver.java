package assignment.session.driver;

import assignment.session.service.*;

import java.util.Scanner;

public class Driver {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of transaction array");
	int array_length = sc.nextInt();
	
	int[] array = new int[array_length];
	System.out.println("Enter the values of array");
	
	for(int i=0; i<array_length; i++) {
		array[i] = sc.nextInt();
	}
	
	System.out.println("Enter the total no of targets that needs to be achieved");
	int flag = sc.nextInt();
	
	Services obj = new Services();
	obj.checkTarget(array, flag);
	
}
}
