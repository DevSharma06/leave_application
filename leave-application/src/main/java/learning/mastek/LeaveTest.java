package learning.mastek;

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
	
	static void viewAppliedLeaves(int empNo)
	{
		Manager.checkLeaves(empNo);
	}
	
	static void applyLeave()
	{
		System.out.println("Leave applying for:");
		String reason = sc.next();
		leaveRequest.setReason(reason);
		Manager.update();
	}
	
	static void cancelLeave()
	{
		
	}
	
	static void viewLeaveSummary()
	{
		
	}
	
}
