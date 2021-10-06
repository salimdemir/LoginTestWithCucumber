package StepDefinition;

import PageObjectModel.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {
    WebDriver driver;
    LoginPage loginPage;


    By nameLokator=By.id("name");
    By passwordLokator=By.id("password");
    By loginbuttonLokator=By.id("login");
    By logoutLokator=By.id("logout");

    @Given("Browser is open")
    public void browserIsOpen() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
        driver.get("https://example.testproject.io/web/");
    }

    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
        loginPage=new LoginPage(driver);
        loginPage.sendkeysMethod(nameLokator,"salim");
        loginPage.sendkeysMethod(passwordLokator,"12345");
    }

    @And("user click on Loginbutton")
    public void userClickOnLoginbutton() {
        loginPage.clickMethod(loginbuttonLokator);
    }

    @Then("user navigated to the homePage")
    public void userNavigatedToTheHomePage() {
        loginPage.isDisplayed(logoutLokator);
    }

    @And("driver shots down")
    public void quitDriver(){
        driver.close();
        driver.quit();
    }
}
