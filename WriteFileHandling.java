package file_handling;

	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	
	public class WriteFileHandling {

	    public static void main(String[] args) {
	      
	        String text = "Welcome to Edubridge Learning Portal \nHappy Learning!";

	     
	        Path fileName = Path.of("C://Users//Monika//Downloads//30LEDbulb_invoice.docx/");

	        try {
	            
	            Files.writeString(fileName, text);

	           
	            String fileContent = Files.readString(fileName);


	            System.out.println(fileContent);
	        } catch (IOException e) {
	         
	            System.err.println("An error occurred: " + e.getMessage());
	        }
	    }
	}