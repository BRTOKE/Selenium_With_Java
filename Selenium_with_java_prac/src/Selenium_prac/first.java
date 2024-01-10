package Selenium_prac;

import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://google.com");
       String name= driver.getTitle();
       System.out.println(name);
//		System.out.println("Hello world");
//		System.out.println("second Hello world");
//		System.out.println("third Hello world");
	}

}
