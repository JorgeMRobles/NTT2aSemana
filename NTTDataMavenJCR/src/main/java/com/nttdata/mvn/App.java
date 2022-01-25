package com.nttdata.mvn;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  

/**
 * Imprime
 * Hello world!
 * Y usa commons.lang3
 * Luego para el taller realiza un test web
 */
public class App 
{
	/**
	 * clase unica del archivo
	 * @param args
	 */
	
    public static void main( String[] args )
    {
    	/**
    	 * main
    	 */
    	String string = "Hello World!";
    	boolean contained = StringUtils.containsIgnoreCase(string, "Hello World!");
    	 
    	assertTrue(contained);
    	
        System.out.println( "Hello World!" );
    }
       
    /**
     * uso de otras dependencias 
     */
    
    public String baseUrl = "https://www.google.es/";  
    String driverPath = "C://chromedriver_win321//chromedriver.exe";  
    public WebDriver driver;   
    @Test             
    public void test()
    {      
		    System.setProperty("webdriver.chrome.driver", driverPath);  
		    driver = new ChromeDriver();  
		    driver.manage().window().maximize();  
		    driver.get(baseUrl);  
		    String title = driver.getTitle();    
		    String URL= driver.getCurrentUrl();  
		    System.out.println(title + " " + URL);  
    }     
    @BeforeTest  
    public void beforeTest()
    {    
    	System.out.println("beforetest");  
    }     
    @AfterTest  
    public void afterTest() 
    {  
   		driver.quit();  
   		System.out.println("aftertest");  
    }         
}  
