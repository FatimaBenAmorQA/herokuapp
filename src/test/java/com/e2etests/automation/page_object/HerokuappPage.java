package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class HerokuappPage {
/* @FindBy */
	
	@FindBy(how = How.ID, using = "username")
	public static WebElement usernameField;
	
	@FindBy(how = How.ID, using = "password")
	public static WebElement passwordField;
	
	@FindBy(how = How.CLASS_NAME, using = "fa-sign-in")
	public static WebElement loginButton;
	
	@FindBy(how = How.CLASS_NAME, using = "subheader")
	public static WebElement welcomemessage;
	
	public HerokuappPage() {
		PageFactory.initElements(Setup.driver, this);
	}


}
