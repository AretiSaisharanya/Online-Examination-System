package service;
import result.*;
import java.io.*;
import java.util.*;

import javax.swing.JFrame;

public class Year4 
{
	
 	String ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
	char choice;
	int marks=10;
	Scanner sc = new Scanner(System.in);
	public boolean Questions123( ) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n1. Number of primitive data type in Java?");
 		System.out.println("\nA. 6 \nB. 7 \nC. 8 \nD. 9"); 
 		System.out.print("\nAns: ");
 		ans1 = br.readLine();
		System.out.println(ans1);
 		if(ans1.equalsIgnoreCase("C")) 
 			System.out.println("Correct Answer!");
 		else
		 {
 			System.out.println("Incorrect Answer!");
			marks--;
 		}
 
 		System.out.println("\n2. What's the size of float and double in Java?");
 		System.out.println("\nA. 32 and 64 \nB. 32 and 32 \nC. 64 and 64 \nD. 64 and 32");
 		System.out.print("\nAns: ");
		 ans2 = br.readLine();
 		if(ans2 .equalsIgnoreCase("A"))
			System.out.println("Correct Answer!");
		 else
 		{
 			System.out.println("Incorrect Answer!");
			 marks--;
 		}
 
		System.out.println("\n3. Select the valid Statement...");
 		System.out.println("\nA. char[] ch = new char(5) \nB. char[] ch = new char[5] \nC. char[] ch = new char() \nD. char[] ch = new char[]");
 		System.out.print("\nAns: ");
 		ans3 = br.readLine();
 		if(ans3.equalsIgnoreCase("B"))
			System.out.println("Correct Answer!");
 		else
 		{
			System.out.println("Incorrect Answer!");
			marks--;
		 }
 
		System.out.println("\n4. Array in Java are-");
 		System.out.println("\nA. Objects \nB. Object Refrences \nC. Primitive Datatypes \nD. None");
 		System.out.print("\nAns: ");
 		ans4 = br.readLine();
		if(ans4.equalsIgnoreCase("A"))
			System.out.println("Correct Answer!");
		else
 		{
			System.out.println("Incorrect Answer!");
			marks--;
 		}
 
		System.out.println("\n5. What is the object created with new keyword?");
		System.out.println("\nA. At run time \nB. At compile time \nC. Depends on code \nD. None");
 		System.out.print("\nAns: ");
		ans5 = br.readLine();
		if(ans5.equalsIgnoreCase("A"))
			System.out.println("Correct Answer!");
 		else
 		{
			System.out.println("Incorrect Answer!");
			marks--;
 		}
 
		System.out.println("\n6. In which of the following is toString() method defined?");
		System.out.println("\nA. java.lang.object \nB. java.lang.String \nC. java.lang.util \nD. None");
 		System.out.print("\nAns: ");
 		ans6 = br.readLine();
		if(ans6.equalsIgnoreCase("A"))
		System.out.println("Correct Answer!");
		else
 		{
			System.out.println("Incorrect Answer!");
			marks--;
 		}
 
		System.out.println("\n7. compareTo() returns-");
 		System.out.println("\nA. True Value \nB. False Value \nC. An int Value \nD. No Value return");
 		System.out.print("\nAns: ");
 		ans7 = br.readLine();
 		if(ans7.equalsIgnoreCase("C"))
			System.out.println("Correct Answer!");
 		else
 		{
			System.out.println("Incorrect Answer!");
			marks--;
 		}
 
		System.out.println("\n8. To which of the following does the class string belong to...?");
 		System.out.println("\nA. java.lang \nB. java.awt \nC. java.applet \nD. java.String");
		System.out.print("\nAns: ");
		ans8 = br.readLine();
 		if(ans8.equalsIgnoreCase("A"))
			System.out.println("Correct Answer!");
 		else
 		{
			System.out.println("Incorrect Answer!");
			marks--;
 		}
 
 		System.out.println("\n9. Total constructor string class have?");
 		System.out.println("\nA. 3 \nB. 7 \nC. 13 \nD. 20");
 		System.out.print("\nAns: ");
 		ans9 = br.readLine();
		if(ans9.equalsIgnoreCase("C"))
			System.out.println("Correct Answer!");
 		else
 		{
 			System.out.println("Incorrect Answer!");
			 marks--;
 		}
 
		System.out.println("\n10. Output of Math.floor(3.6)?");
		System.out.println("\nA. 3 \nB. 3.0 \nC. 4 \nD. 4.0");
 		System.out.print("\nAns: ");
 		ans10 = br.readLine();
 		if(ans10.equalsIgnoreCase("B"))
			System.out.println("Correct Answer!");
 		else
 		{
 			System.out.println("Incorrect Answer!");
			 marks--;
 		}
		try
		{
			new PrintResult(marks);
			Thread.sleep(2000);
			new PrintResult("show result");
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
		return true;
	}
}