package in.sts.sts_project.services;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import in.sts.sts_project.input.FileInput;
import in.sts.sts_project.reader.MultipleFileReader;
import in.sts.sts_project.serviceMethod.OperationMethod;


public class FileOperation {                                                                       //Operation class for performing the business logic
	int count=0;                   
	final Logger log=Logger.getLogger(MultipleFileReader.class);                               //Creating a logger class for for print
	HashMap<String, String> hashMap=new HashMap<String, String>();      
	public HashMap<String, String> fileOpertion(String input) {

		OperationMethod operation =new OperationMethod();                       //I have  been segregate functionaltily of wordcount and wordDisplay in OperationMethod class in serviceMethod pacakge
		HashMap<String , String> hashMap=new HashMap<String, String>(); 

		switch(input) {                                                          //Use Switch case for giving the two option to user for wordcount And wordDisplay
		case "1":                                                                //Case 1 for wordCount
			HashMap<String, Integer> wordCountFiles=operation.getWordCount(FileInput.getWordCountUInput());
			for(Map.Entry<String, Integer>file:wordCountFiles.entrySet()) {
				String word=file.getKey();
				String count=Integer.toString(file.getValue());
				hashMap.put(word, count);
			}
			return hashMap;

		case "2":                                                             //Case 2 for wordDisplay
			HashMap <String,String>	wordDisplayFiles = operation.getWordDisplay(FileInput.getWordDisplayInput());
			return wordDisplayFiles;



		default:
			log.info("Wrong input given");                                                      //if user give the other input than given then it will be comes in the default case
		}
		return null;

	}
}

