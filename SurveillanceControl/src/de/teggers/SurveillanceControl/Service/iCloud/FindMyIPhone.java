package de.teggers.SurveillanceControl.Service.iCloud;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class FindMyIPhone {
	
	private String authorize(String username, String password) throws IOException {
		String dsid = "";
		
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost("https://setup.icloud.com/setup/ws/1/login?clientBuildNumber=14e45&clientId=77baf405-c3f8-4668-88b6-f31d875c82e6");
		httpPost.addHeader("Origin", "https://www.icloud.com");
		httpPost.addHeader("Content-Type", "application/json");
		
		List<NameValuePair> params = new ArrayList<NameValuePair>();
	    params.add(new BasicNameValuePair("apple_id", username ));
	    params.add(new BasicNameValuePair("password", password));
	    params.add(new BasicNameValuePair("extended_login", "false"));
	
	    httpPost.setEntity(new UrlEncodedFormEntity(params));
	    
	    HttpResponse httpResponse = httpClient.execute(httpPost);
	    
	    
		
		
		
		
		
		
		return dsid;
	}
	

}
