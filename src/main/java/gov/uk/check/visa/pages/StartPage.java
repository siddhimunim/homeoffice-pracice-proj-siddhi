package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class StartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startNowButton;
    public void clickStartNow(){
        Reporter.log("click on start button" + startNowButton.toString());
        mouseHoverToElementAndClick(startNowButton);
        CustomListeners.test.log(Status.PASS,"click on start button");

    }
}
