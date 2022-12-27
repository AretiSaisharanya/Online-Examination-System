import service.*;
import result.*;
import java.io.*;
import java.util.*; 
import javax.swing.*;

public class ExaminationSystem
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		boolean wantToContinue = true;
		Console con =System.console();
		while(wantToContinue)
		{
			try
			{
				Thread.sleep(100);
				System.out.println("\nWELCOME TO PORTAL\n");
				System.out.println("Login as,");
				System.out.println("---------");
				Thread.sleep(100);
				System.out.println("1) User");
				Thread.sleep(100);
				System.out.println("2) Exit");
				System.out.println("");
				Thread.sleep(100);
				System.out.println("Enter your choice :");
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:	System.out.println("Enter username");
							String uname = con.readLine();
							System.out.println("Enter password");
							String password = con.readLine();
							if(uname.equals("sai") && password.equals("123"))
							{
								service.Year4 obj=new service.Year4(); 
								wantToContinue=obj.Questions123();
								break;
							}
							else
							{
								System.out.println("\nEnter valid Username or Password ");
								System.out.println("Do you want to Re-enter [y/n] : ");
								break;
							}
					case 2:	 wantToContinue=false;
							break;
					default :	System.out.println("Invalid Choice!!! - choose numbers from 1-2");		
				}
			}
			catch(InputMismatchException ie)
			{
				System.out.println("\n!!!Enter Positive number!!!");
				sc.next();
			}
			catch(InterruptedException i)
			{
				i.printStackTrace();
			}
		}
	}
}