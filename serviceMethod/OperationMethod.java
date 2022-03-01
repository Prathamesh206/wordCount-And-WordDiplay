package in.sts.sts_project.serviceMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import in.sts.sts_project.input.FileInput;
import in.sts.sts_project.reader.MultipleFileReader;
import in.sts.sts_project.reader.SingleFileReader;
import in.sts.sts_project.util.DisplayWord;
import in.sts.sts_project.util.FileWordsCount;

public class OperationMethod {
	final Logger log=Logger.getLogger(OperationMethod.class);                //Creating Opeartion Method
	SingleFileReader singleFileReadr=new SingleFileReader();                 //Single File reader object create for for read the file 
	MultipleFileReader multipleFileReadr=new MultipleFileReader();           //for read the multiple file read create the multiple object


	public  HashMap<String, Integer> getWordCount(String operation){               //Creating getWordCount method for wordcount

		FileWordsCount wordCount=new FileWordsCount();                            //Creating FileWordCount Object


		HashMap<String, Integer> hashMap=new HashMap<String, Integer>();         //Creating HahMap Object For Storing the values

		switch(operation) {                                                     //Use switch case for giving  the two  option to user for singleFile Count And MultpleFile Count  
		case "1":
			int	count=wordCount.wordsCount(singleFileReadr.singleFileRead (FileInput.getSingleFileInput()));
			hashMap.put("file", count);                                                           

			return hashMap;

		case "2":
			HashMap<String, Integer> multipleFileCount =wordCount.wordsCount(multipleFileReadr.multiFileRead(FileInput.getMultipleFileInput()));               
			for (Map.Entry<String, Integer> set : multipleFileCount.entrySet()) {

				hashMap.put(set.getKey(), set.getValue());
			}
			return hashMap;
		default:
			System.out.println("Wrong input given");

		}
		return null;	


	}

	public HashMap<String, String> getWordDisplay(String operation){

		DisplayWord displayWord=new DisplayWord();                         // Creating  DisplayWord class object for wordDisplay
		HashMap<String, String> hashMap=new HashMap<String, String>();      //Creating  HashMap Object for storing the value in HashMap          


		switch(operation) {                                               //Use switch case for giving  the two  option to user for singleFile  wordDisplay And MultpleFile WordDisplay     
		case "1":                                                          //for Single File

			ArrayList<String>  words= displayWord.wordsDisplay((singleFileReadr.singleFileRead (FileInput.getSingleFileInput())));
			for(String singleWord:words) {
				hashMap.put(singleWord, "");
			}

			return hashMap;
		case "2":                                                        //for multiFile
			HashMap<String, ArrayList<String>> s=displayWord.wordsDisplay(multipleFileReadr.multiFileRead(FileInput.getMultipleFileInput()));
			for(Map.Entry<String, ArrayList<String>> b:s.entrySet()) {
				String fileName=b.getKey();
				System.out.println(fileName);
				ArrayList<String> wordList=b.getValue();
				for(String word:wordList) {
					System.out.println(word);
					hashMap.put(fileName, word);
				}
				System.out.println(" ");
			}
			return hashMap;

		default:
			System.out.println("Wrong input given");                                                   //if user give the other input than given then it will be comes in the default case
		}
		return null;

	}

}
