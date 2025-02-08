package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_object.HerokuappPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HerokuappStepDefinition {

	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	private HerokuappPage herokuappPage;
 	
	public HerokuappStepDefinition() {
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
		this.herokuappPage = new HerokuappPage();
	}

	@Given("I am on the login page")
	public void iAmOnTheLoginPage() {
        seleniumUtils.get(configFileReader.getProperties("hero.url"));

	}
	@When("I enter username")
	public void iEnterUsername() {
		seleniumUtils.writeText(herokuappPage.usernameField, configFileReader.getProperties("hero.username"));

	}
	@When("I enter password")
	public void iEnterPassword() {
		seleniumUtils.writeText(herokuappPage.passwordField, configFileReader.getProperties("hero.password"));

	}
	@When("I clic on the button")
	public void iClicOnTheButton() {
	seleniumUtils.click(herokuappPage.loginButton);
	}
	@Then("I logged in")
	public void iLoggedIn() {
		validations.assertEquals(herokuappPage.welcomemessage, configFileReader.getProperties("hero.messagee"));

	
	}








	
}
