package operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFiles {

	
	public static Properties loadProerptiesFile(){
		Properties prop = new Properties();
		File file = new File("G://AUTOMATIONWORKSPCAEJG//JRWorkTest//PropertiesFiles//objproperties.properties");
		FileInputStream fileInput = null;
		
		try{
			fileInput = new FileInputStream(file);			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		//Load properties file
		
		try{
			prop.load(fileInput);
		}catch(IOException e){
			e.printStackTrace();
		}
		return prop;
		
	}

}
