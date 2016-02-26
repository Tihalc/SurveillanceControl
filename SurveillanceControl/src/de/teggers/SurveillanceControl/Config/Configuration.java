package de.teggers.SurveillanceControl.Config;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Configuration {
	private List<Account> accounts;
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void loadConfigurationFile() throws IOException{
		File configFile = new File("./config.properties");
		Properties props = new Properties();
		
		if(configFile.exists()) {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(configFile));
			props.load(bis);
			bis.close();
			loadConfigurationSettings(props);
		} else {
			throw new IOException("Propertiefile does not exists");
			
		}
				
		
	}
	
	private void loadConfigurationSettings(Properties props) {
		// TODO Auto-generated method stub
		String[] username = props.getProperty("icloud_user").split(";");
		String[] password = props.getProperty("icloud_password").split(";");
		
		for(int i=0; i < username.length; i++) {
			Account account = new Account(username[i], password[i]);
			accounts.add(account);
		}
	}

	
	
	

}
