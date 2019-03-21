package learning.mastek;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class Manager {

	static ClassLoader classLoader = new Manager().getClass().getClassLoader();
	
	static File file = new File(classLoader.getResource("database.csv").getFile());
    
    static CSVReader csvReader;
    
    public static boolean validateEmp(int empNo) throws IOException
    {
    	csvReader = new CSVReaderBuilder(new FileReader(file)).withSkipLines(1).build();
    	
    	List<String[]> allData = csvReader.readAll(); 
    	
    	for (String[] row : allData) { 
            for (String cell : row) { 
                if(cell.contains(String.valueOf(empNo)))
                	return true;
                else 
                	return false;
            } 
            System.out.println(); 
        } 
    	
    	return false;
    }
	
	public static String checkLeaves(int empNo) throws FileNotFoundException
	{
    	csvReader = new CSVReader(new FileReader(file)); 
    	
		return "";
	}
	
	
	public static void update() throws IOException
	{
		csvReader = new CSVReader(new FileReader(file)); 
        
        String[] nextRecord; 
  
        // we are going to read data line by line 
        while ((nextRecord = csvReader.readNext()) != null) { 
            for (String cell : nextRecord) { 
                System.out.print(cell + "\t"); 
            } 
            System.out.println(); 
        } 
	}
}
