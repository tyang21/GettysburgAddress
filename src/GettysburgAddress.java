import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class GettysburgAddress 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("Gettysburg Address.txt"));
		ArrayList<String> words = new ArrayList<String>();
		while(file.hasNext())
		{
			words.add(file.next());
		}
		
		String longest = "random";
		int Average = 0;
		for(String a: words)
		{
			if (a.length() > longest.length())
			{
				longest = a;
			}
		}
		System.out.println(longest);
		int sum = 0;
		int counter = 0;
		for(String a: words)
		{
			sum += a.length();
			counter++;
		}
		System.out.println(sum / counter);
		
		
	}
}
