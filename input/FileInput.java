package in.sts.sts_project.input;

import java.util.Scanner;
import org.apache.log4j.Logger;


public class FileInput {
	final Logger log=Logger.getLogger(FileInput.class);

	static Scanner  scanner=new Scanner(System.in); 
	public  String getInput() {                                     //getInput method for giving two option for user wordCount And WordDisplay

		System.out.println("Enter 1 for WordCount from  the file  and 2 for display the words from the file");
		System.out.println("Enter the operation you want to perform");
		String operation=scanner.nextLine();

		return operation;
	}

	public static String getWordCountUInput() {                     //getWordCountInput method for giving two option for user singleFile wordCount And MultiFile WordCount
		System.out.println("Enter 1 for singleFile WordCount");
		System.out.println("Enter 2 for MultipleFile WordCount");
		String operation=scanner.nextLine();
		return operation;

	}
	public static String getWordDisplayInput() {                       //getWordDisplayInput method for giving two option for user singleFile wordDisplay And MultiFile WordDisplay
		
		System.out.println("Enter 1 for display word from single File");
		System.out.println("Enter 2 for display word from all the files from  drive");
		String operation=scanner.nextLine();
		return operation;

	}



	public static String getSingleFileInput() {
		String path=null;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the drive name");
		String Drive=scanner.nextLine();
		System.out.println("Enter the file name");
		String file=scanner.nextLine();
		path=""+Drive+":\\"+file+".txt";
		scanner.close();
		return path;
	} 

	public static String getMultipleFileInput() {

		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the drive name ");
		String Drive=scanner.nextLine();
		String path=""+Drive+":\\";
		scanner.close();
		return path;


	}
}

