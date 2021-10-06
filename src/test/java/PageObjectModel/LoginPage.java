package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By nameLokator=By.id("name");
    By passwordLokator=By.id("password");
    By loginbuttonLokator=By.id("login");

    public LoginPage(WebDriver driver){
        this.driver=driver;

    }

    public void sendkeysMethod(By lokator,String text){

        driver.findElement(lokator).sendKeys(text);

    }

    public void clickMethod(By lokator){

        driver.findElement(lokator).click();

    }

    public boolean isDisplayed(By lokator){

        return driver.findElement(lokator).isDisplayed();

    }
}
