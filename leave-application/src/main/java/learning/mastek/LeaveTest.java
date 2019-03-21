package learning.mastek;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LeaveTest {
	
	static Scanner sc;
	static int empno;
	static int opt;
	
	static LeaveRequest leaveRequest;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		leaveRequest = new LeaveRequest();
		
		System.out.println("Login:");
		empno = sc.nextInt();
		
		boolean validPin = false;
		try {
			validPin = Manager.validateEmp(empno);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(validPin)
		{
			while(opt != 5)
			{
				System.out.println("1. View Applied Leaves\r\n" + 
						"2. Apply For Leave\r\n" + 
						"3. Cancel Leave\r\n" + 
						"4. View Leave Summary\n"+
						"5. Exit\n");
				opt = sc.nextInt();
				switch(opt)
				{
				case 1: viewAppliedLeaves(empno);
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
		else
			System.out.println("Invalid pin");
		
		
	}
	
	static void viewAppliedLeaves(int empNo)
	{
		try {
			Manager.checkLeaves(empNo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void applyLeave()
	{
		System.out.println("Leave applying for:");
		String reason = sc.next();
		leaveRequest.setReason(reason);
		try {
			Manager.update();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void cancelLeave()
	{
		
	}
	
	static void viewLeaveSummary()
	{
		
	}
	
}
