package gov.uk.check.visa.testsuites;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.checkerframework.checker.units.qual.s;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

import java.rmi.server.RemoteRef;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inInt() {
        durationOfStayPage = new DurationOfStayPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        selectNationalityPage = new SelectNationalityPage();
        startPage = new StartPage();
        workTypePage = new WorkTypePage();

    }

    @Test(dataProvider = "dataNO1",dataProviderClass = TestData.class,groups = {"sanity","regression"})
    public void anAustralianCominToUKForTourism(String country,String reason,String expectedMassage) {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality(country);
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();
       resultPage.confirmResultMassage(expectedMassage);

    }

    @Test(dataProvider = "dataNO2",dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(String country,String reason,String stay,String jobType,String expectedMassage) throws InterruptedException {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality(country);
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit(reason);
        Thread.sleep(1500);
        reasonForTravelPage.clickNextStepButton();
        Thread.sleep(1500);
        durationOfStayPage.selectLengthOfStay(stay);
        Thread.sleep(1500);
        durationOfStayPage.clickNextStepButton();
        Thread.sleep(1500);
         workTypePage.selectJobTyp(jobType);
   workTypePage.clickNextStepButton();
        resultPage.confirmResultMassage(expectedMassage);

    }

    @Test(dataProvider = "dataNO3",dataProviderClass = TestData.class,groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(String country,String reason,String status,String expectedMassage) {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality(country);
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();
        familyImmigrationStatusPage.selectImmigrationStatus(status);
        familyImmigrationStatusPage.clickNextStepButton();
        resultPage.confirmResultMassage(expectedMassage);

    }

}
