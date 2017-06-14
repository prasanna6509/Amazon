package com.seleniumTests;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class RestfulServiceTest {

	public static void main(String args[]){

		try{

			HttpClient  client =  HttpClientBuilder.create().build();
			HttpGet httpGet = new HttpGet("http://jsonplaceholder.typicode.com/posts/1");

			httpGet.addHeader("Content-type", "application/json");
			HttpResponse response = client.execute(httpGet);

			System.out.println("response = " + response);

			BufferedReader breader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuilder responseString = new StringBuilder();
			String line = "";
			while ((line = breader.readLine()) != null) {
				responseString.append(line);
			}
			breader.close();
			String responseStr = responseString.toString();
			System.out.println("responseStr = " + responseStr);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

