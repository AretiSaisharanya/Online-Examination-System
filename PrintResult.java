package result;
import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class PrintResult
{
	public PrintResult(int m)
	{
		JFrame f=new JFrame("RESULT");
		try
		{
			JTextArea t=new JTextArea();
           		 String marks="Marks Obtained : "+String.valueOf(m);
            		t.setText(marks);
            		f.setLayout(new FlowLayout(FlowLayout.CENTER)); 
            		t.setForeground(Color.BLACK);
            		t.setFont(new Font("Muli", Font.BOLD, 20));
            		t.setEditable(false); 
            		t.setOpaque(false);
            		f.add(t); 
            		f.setSize(300,300); 
            		f.setVisible(true); 
           		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        		}
        		catch(Exception e)
        		{
            		System.out.print(e);
       		 }
    	}  
    	public PrintResult(String s)
    	{
       		JFrame f =new JFrame("Result");
        		try
        		{
            			JTextArea t=new JTextArea();
            			FileReader readTextFile=new FileReader("Answers1.txt");
            			Scanner fileReaderScan=new Scanner(readTextFile);
            			String filecontent="";
            			while(fileReaderScan.hasNextLine())
            			{
                				String temp=fileReaderScan.nextLine()+"\n";
                				filecontent=filecontent+temp;
            			}
            			t.setText(filecontent);
            			fileReaderScan.close();
            			f.setVisible(true); 
            			t.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
            			f.setLayout(new FlowLayout(FlowLayout.CENTER)); 
            			t.setForeground(Color.BLACK);
            			t.setOpaque(false);
            			t.setFont(new Font("Muli", Font.BOLD, 20));
            			t.setEditable(false); 
            			f.add(t); 
            			f.setSize(600,600);
            			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            			fileReaderScan.close();
        		}
        		catch(Exception e)
        		{
            			System.out.print(e);
        		}	
	}
	
}		
