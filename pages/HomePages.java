package com.leaftaps.UI.pages;
import org.openqa.selenium.By;
import com.leaftaps.UI.base.ProjectSpecficMethod;
public class HomePages extends ProjectSpecficMethod{
	public HomePages() {
	
	}
	public void clickleads() {
		driver.findElement(By.linkText("Leads")).click();
}
}