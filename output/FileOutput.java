package in.sts.sts_project.output;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;

import in.sts.sts_project.input.FileInput;




public class FileOutput {
	public  void  getWordCountOutput(HashMap<String , Integer> outputMap) {
		//call the fileOpration object for output
		for(Map.Entry<String,Integer>filemap:outputMap.entrySet()) {                           //iterating each file into ky and value pair
			String filename=filemap.getKey();                                                  //store the key into file
			int count=filemap.getValue();                                                      //store the wordcount into count variable; 
			System.out.println(filename);
			System.out.println("count = "+count);
		}

	}


	public void getWordDisplayOutput(HashMap<String,ArrayList<String>> outputMap) {
		String fileName=null;
		ArrayList<String>allWords=new ArrayList<String>();
		for(Map.Entry<String, ArrayList<String>> files:outputMap.entrySet()) {

			 fileName=files.getKey();
			System.out.println(fileName );
		
			ArrayList<String> words=files.getValue();
		
			allWords.addAll(words);
			Collections.sort(allWords);
			


		}
		FileInput.txtFileDisplay(allWords);

	}
	

}






