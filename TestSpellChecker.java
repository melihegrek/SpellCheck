import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.TreeSet;

public class TestSpellChecker {

	public static void main (String[] args) throws FileNotFoundException {
		
		TreeSet<String> Dictionary = ReadFile("C:\\Users\\melih\\eclipse-workspace\\Homework2\\src\\dictionary.txt");
		
		SpellCheck Spell = new SpellCheck(Dictionary);
		
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter a string that will check from dictionary:");
			
			String userString = kb.nextLine();
			
			System.out.println(Spell.checker(userString));	
		}
		
		
		
		
		
	}
	private static TreeSet<String> ReadFile(String fname) throws FileNotFoundException{
		
		TreeSet<String> emptyArray = new TreeSet<>();
		
		Scanner infile = new Scanner (new File(fname));
		
		while (infile.hasNextLine()) {
			
			String line = infile.nextLine();
			
			emptyArray.add(line);
			
		}
		
		infile.close();
		
		return emptyArray;
		
	}
}
