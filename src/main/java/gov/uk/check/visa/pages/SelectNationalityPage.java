package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;


    public void selectNationality(String text){
        Reporter.log("Select Nationality " + nationalityDropDownList.toString());
     selectByVisibleTextFromDropDown(nationalityDropDownList,text);
        CustomListeners.test.log(Status.PASS,"Select Nationality");


    }
    public void clickNextStepButton(){
        Reporter.log("click on Continue" + nextStepButton.toString());
        mouseHoverToElementAndClick(nextStepButton);
        CustomListeners.test.log(Status.PASS,"click on Continue");

    }

}


