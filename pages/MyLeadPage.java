package com.leaftaps.UI.pages;
import org.openqa.selenium.By;
import com.leaftaps.UI.base.ProjectSpecficMethod;
public class MyLeadPage extends ProjectSpecficMethod {
public void clickcreatelead() {
	driver.findElement(By.linkText("Create Lead")).click();
}
}
