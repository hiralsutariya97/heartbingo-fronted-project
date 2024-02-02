package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement CookiesButton;

    @CacheLookup
    @FindBy(linkText = "Log In")
    WebElement loginLink;


    public void clickOnCookiesButton() {
        clickOnElement(CookiesButton);
        log.info("Clicking on accept Cookies Button " + CookiesButton.toString());
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Click on Login Button " + loginLink.toString());
    }

}
