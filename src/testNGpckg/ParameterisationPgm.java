package testNGpckg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisationPgm {
	@Parameters("name")                        //defining parameter 'name' created in xml file and calling
	@Test
	public void nameprint(String name)         //parameterised method specifying 'name'
	{
		System.out.println("what is your name: "+name);
		
	}

}

//run using xml file
