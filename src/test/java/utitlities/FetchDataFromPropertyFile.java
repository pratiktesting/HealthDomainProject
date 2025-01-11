package utitlities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.Constant;

public class FetchDataFromPropertyFile {

	
	public static Properties getDataFromProperty() throws IOException
	
	{
		
		FileReader reader = new FileReader(Constant.propetyFilePath);
		
		Properties prop = new Properties();
		
		prop.load(reader);
		
		return prop;
	}
	
	
	
	
	
	
	
	
	
	
}
