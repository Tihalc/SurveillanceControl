package de.teggers.SurveillanceControl;

import java.io.IOException;
import java.util.List;

import de.teggers.SurveillanceControl.Config.*;

public class SurveillanceControl {

	public static void main(String[] args) {
		List<Account> accounts;
		Configuration config = new Configuration();
		
		try {
			config.loadConfigurationFile();
			accounts = config.getAccounts();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
