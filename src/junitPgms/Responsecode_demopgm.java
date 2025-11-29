package junitPgms;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class Responsecode_demopgm
{
	
String link="https://www.facebook.com/";

@Test
public void responsecode() throws Exception
{
	URI ob=new URI(link);     //add throws
	HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();   //import
	int responsecode=con.getResponseCode();
	
	
	if(responsecode==200)
	{
		System.out.println("link is successfull link");
	}
	else if(responsecode==404)
	{
		System.out.println("link is a broken link");
	}
	else
	{
		System.out.println("Other link");
	}
}
}
