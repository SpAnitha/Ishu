package com.leaftaps.UI.pages;
import org.openqa.selenium.By;
import com.leaftaps.UI.base.ProjectSpecficMethod;
public class LoginPages extends ProjectSpecficMethod{
	public void typeusername(String username) {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	public void typepassword(String password) {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	public void clickloginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

}
