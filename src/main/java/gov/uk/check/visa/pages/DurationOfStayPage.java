package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;

    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                break;
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
                break;

        }
    }

        public void clickNextStepButton () {
            Reporter.log("click on continue" + nextStepButton.toString());
            mouseHoverToElementAndClick(nextStepButton);
            CustomListeners.test.log(Status.PASS,"click on continue");

        }
    }

