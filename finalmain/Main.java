package in.sts.sts_project.finalmain;
import java.io.FileNotFoundException;
import org.apache.log4j.BasicConfigurator;

import in.sts.sts_project.input.FileInput;
import in.sts.sts_project.output.FileOutput;
import in.sts.sts_project.services.FileOperation;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BasicConfigurator.configure();
		
		FileInput fileInput=new FileInput();         //Create FileInput class 
		
		FileOperation fileOperation=new FileOperation();       //Create fileOperation class
		
		FileOutput fileOutput=new FileOutput();                 //create FileOutput Class
		
		fileOutput.getFileOutput(fileOperation.fileOpertion(fileInput.getInput()));   
		

		


	}

}
