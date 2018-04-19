import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InClassCoding {

	public static void main(String[] args) throws FileNotFoundException {
		//call the method
		compare();
	}	
	
	public static void compare() throws FileNotFoundException {
		//program greeting
		System.out.println("This program compares the vocabulary of two \n"
				+ "text files, reporting the number of words \n"
				+ "in common and the percent of overlap.");
		
		System.out.println();
		
		//get text files
		Scanner console1 = new Scanner(new File("mobydick.txt"));
		Scanner console2 = new Scanner(new File("hamlet.txt"));
		
		System.out.println("file #1 name = mobydick.txt");
		System.out.println("file #2 name = hamlet.txt");
		System.out.println();
		
		Set<String> words1 = new HashSet<String>();
		while (console1.hasNext()) {
            String word1 = console1.next();
            word1 = word1.toLowerCase();
            words1.add(word1);
        }
        System.out.println("file #1 words = " + words1.size());
		
        
        Set<String> words2 = new HashSet<String>();
        while (console2.hasNext()) {
            String word2 = console2.next();
            word2 = word2.toLowerCase();
            words2.add(word2);
        }
        System.out.println("file #2 words = " + words2.size());
        
        
        Scanner console3 = new Scanner(new File("mobydick.txt"));
        Scanner console4 = new Scanner(new File("hamlet.txt"));
        Set<String> words3 = new HashSet<String>();      
        	while(console4.hasNext()) {
        		String word2 = console4.next();
            word2 = word2.toLowerCase();
        		if(words1.contains(word2)) {
        			words3.add(word2);
        		}
        }
        
        System.out.println("common words = " + words3.size());
        
        double overlap1 = words3.size() * 100.00 / words1.size();
        double overlap2 = words3.size() * 100.00 / words2.size();
        System.out.println("% of file 1 in overlap = " + overlap1);
        System.out.println("% of file 2 in overlap = " + overlap2);
        
	}
}
