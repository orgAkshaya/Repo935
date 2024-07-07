package ytestingo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public  class aaaa {
private static aaaa a=null;
WebDriver d;
private aaaa() {
	
}
private WebDriver openbrowser() {
	d=new ChromeDriver();
	return d;
}
private static aaaa inilize() {
	if(a==null) {
		a=new aaaa();
	}
	return a;
}

	
@Test
	public void show() {
	System.out.println("Test1");	
		
}
		
	}
	
	
	
	  
	 
		
		
				

