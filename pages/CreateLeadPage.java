package com.leaftaps.UI.pages;
import org.openqa.selenium.By;
import com.leaftaps.UI.base.ProjectSpecficMethod;
public class CreateLeadPage extends ProjectSpecficMethod {
public void typecompanyname() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
}
public void typefirstname() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anil");
}
public void typelastname() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SP");
}
public void clickcreatelead() {
	driver.findElement(By.name("submitButton")).click();

}
}