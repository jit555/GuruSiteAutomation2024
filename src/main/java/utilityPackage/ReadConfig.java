
package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() throws IOException
	{
		File src = new File("./Configiration/config.properties");
		FileInputStream fis= new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}

}
