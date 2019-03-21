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
		while(opt != 5)
		{
			System.out.println("1. View Applied Leaves\r\n" + 
					"2. Apply For Leave\r\n" + 
					"3. Cancel Leave\r\n" + 
					"4. View Leave Summary"+
					"5. Exit\n");
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
			case 5: System.out.println("Thank you");
				break;
			default:
					System.out.println("Enter valid option");
			}
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
