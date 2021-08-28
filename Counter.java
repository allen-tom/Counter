import java.io.*;
import java.util.*;

public class Counter
{
	public static void main (String[] args) throws IOException
	{	Scanner scan = new Scanner (new File("file1.txt"));
	
		int LIMIT;
		int count = 0;
		
		//Scanner scan = new Scanner(System.in);
	
		LIMIT = scan.nextInt();
		
		while (count <= LIMIT)
		{
			for(int m=0; m<=count; m++) //{
			     System.out.print ("*");
			//System.out.println (i);
			//System.out.println (count);
			//}
			count = count + 1;
			
			//System.out.println ("cc: " + count);
			System.out.println ( );
		}
		
		System.out.println ("Done");
	}
}
