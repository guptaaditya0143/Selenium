package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomePag {
public DwsHomePag(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//input[@id='small-searchterms']")
WebElement Search_field;

@FindBy(xpath = "//input[@type='submit']")
WebElement Search_Button;
}
