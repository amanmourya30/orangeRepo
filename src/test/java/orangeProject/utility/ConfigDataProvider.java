package orangeProject.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		File src = new File(System.getProperty("user.dir") + "\\configuration\\config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (IOException e) {
			System.out.println("Not able to load config file" + e.getMessage());
		}

	}

	public String getBrowser() {
		return pro.getProperty("browser");
	}

	public String getTestUrl() {
		return pro.getProperty("testurl");
	}
}
