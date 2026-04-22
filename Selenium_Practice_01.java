package practice_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Practice_01 {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/account/login?ret=/");
	driver.findElement(By.name("Enter Email/Mobile number")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("Request OTP")).click();
}
}
