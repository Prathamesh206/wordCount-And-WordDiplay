package in.sts.sts_project.output;
import java.util.HashMap;
import java.util.Map;


public class FileOutput {
	public  void  getFileOutput(HashMap<String , String> files) {
		  
		for(Map.Entry<String,String>file:files.entrySet()) {                           //iterating each file into ky and value pair
			String filename=file.getKey();                                                  //store the key into file
			String value=file.getValue();                                                      //store the wordcount into count variable; 
		    System.out.println(filename);
			System.out.println("count = "+value);
		}

	}

		
	}

		
	




