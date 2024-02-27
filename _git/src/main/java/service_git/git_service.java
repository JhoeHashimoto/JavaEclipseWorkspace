package service_git;

import model_git.Info;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;


import com.google.gson.Gson;

public class git_service {
	
		   
	    public Info getInfo(String login) throws ClientProtocolException, IOException {
	       
	        Info info = null;
	       
	        HttpGet request = new HttpGet("https://api.github.com/users/"+login);
	       
	        try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
	               
	                CloseableHttpResponse response = httpClient.execute(request)) {
	           
	            HttpEntity entity = response.getEntity();
	           
	            if(entity != null) {
	               
	                String result = EntityUtils.toString(entity);
	               
	                Gson gson = new Gson();
	               
	                info = gson.fromJson(result, Info.class);
	            }
	        }
	       
	        return info;
	    
		}

	
	}

