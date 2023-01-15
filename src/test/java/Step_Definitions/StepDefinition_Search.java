package Step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Search {
	
	@Given("launch the chrome browser;")
	public void launch_the_chrome_browser() {
	  System.out.println("chrome browser open");  
	}
	

	@Then("go to the url https:\\/\\/www.amazon.com")

	public void go_to_the_url_https_www_amazon_com() {
	    System.out.println("go to amazon url");
	}

	@When("i landed on amazon homepage")
	public void i_landed_on_amazon_homepage() {
		System.out.println("use explicit wait for element to find");
	   
	}

	@Then("i entered following character in the search field computer")
	public void i_entered_following_character_in_the_search_field_computer() {
		System.out.println("sendkeys computer in search field");
	    
	}

	@And("i clicked on the search icon")
	public void i_clicked_on_the_search_icon() {
		System.out.println("click method");
	  
	}

	@Then("the result according to keyword displays on the screen")
	public void the_result_according_to_keyword_displays_on_the_screen() {
		System.out.println("assert the displayed text");
	    
	}

}
