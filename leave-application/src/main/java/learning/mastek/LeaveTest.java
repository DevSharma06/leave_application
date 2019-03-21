package learning.mastek;

import java.util.Scanner;

public class LeaveTest {
	
	static Scanner sc;
	static int empno;
	static int opt;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Login:");
		empno = sc.nextInt();
		System.out.println("1. View Applied Leaves\r\n" + 
				"			  2. Apply For Leave\r\n" + 
				"			  3. Cancel Leave\r\n" + 
				"			  4. View Leave Summary");
		opt = sc.nextInt();
		switch(opt)
		{
		case 1: viewAppliedLeaves();
			break;
		case 2: applyLeave();
			break;
		case 3: cancelLeave();
			break;
		case 4: viewLeaveSummary();
			break;
		default:
				System.out.println("Enter valid option");
		}
		
	}
	
	static void viewAppliedLeaves()
	{
		
	}
	
	static void applyLeave()
	{
		
	}
	
	static void cancelLeave()
	{
		
	}
	
	static void viewLeaveSummary()
	{
		
	}
	
}
