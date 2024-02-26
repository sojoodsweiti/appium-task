package Appium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actions extends Parameters{
	public void addTwoNumbers(String num1, String num2) {
		List<WebElement> keys =	driver.findElements(By.className("android.widget.ImageButton"));
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num1)) {
				keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num2)) {
				keys.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void subTwoNumbers(String num1, String num2) {
		
		List<WebElement> keys =	driver.findElements(By.className("android.widget.ImageButton"));
		
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num1)) {
				keys.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
		
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num2)) {
				keys.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
	}
	
	public void mulTwoNumbers(String num1, String num2) {
		List<WebElement> keys =	driver.findElements(By.className("android.widget.ImageButton"));
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num1)) {
				keys.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num2)) {
				keys.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

	}
	
	public void squareRoot(String num1) {
		driver.findElement(By.id("com.google.android.calculator:id/op_sqrt")).click();
		
		List<WebElement> keys =	driver.findElements(By.className("android.widget.ImageButton"));
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num1)) {
				keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
	}
	
	public void powerOfTwoNumbers(String num1, String num2) {
		List<WebElement> keys =	driver.findElements(By.className("android.widget.ImageButton"));
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num1)) {
				keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/op_pow")).click();
		
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num2)) {
				keys.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	
	}
	
	public void factorialOfNumber(String num1) {
		List<WebElement> keys =	driver.findElements(By.className("android.widget.ImageButton"));
		for(int i=0; i<keys.size(); i++) {
			String resourceId = keys.get(i).getAttribute("resource-id");
			if(resourceId != null && resourceId.contains(num1)) {
				keys.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.google.android.calculator:id/op_fact")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		
		
	}
	public void clearData() {
		driver.findElement(By.id("com.google.android.calculator:id/clr")).click();
		
	}
}
