package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-!-margin-bottom-6']/h2")
    WebElement resultPageLocator;
    public String getResultMessage(){
        return getTextFromElement(resultPageLocator);
    }
    public void confirmResultMassage(String expectedmassage){

      Assert.assertTrue(getResultMessage().contains(expectedmassage));

    }
}
