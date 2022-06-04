package com.leaftaps.UI.pages;
import org.openqa.selenium.By;
import com.leaftaps.UI.base.ProjectSpecficMethod;
public class WelcomePages extends ProjectSpecficMethod {
public void clickCRMSFA() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}
}
