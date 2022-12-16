package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {
    @DataProvider(name = "dataNO1")
    public Object[][] getData(){
        Object[][] dataNo1 = new Object[][]{
                {"Australia","Tourism or visiting family and friends","You will not need a visa to come to the UK"}
        };
        return dataNo1;
    }
  @DataProvider(name = "dataNO2")
    public Object[][] getData1(){
        Object[][] dataNo2 = new Object[][]{
                {"Chile","Work, academic visit or business","longer than 6 months","Health and care professional","You need a visa to work in health and care"}
        };
        return dataNo2;
    }
    @DataProvider(name = "dataNO3")
    public Object[][] getData2(){
        Object[][] dataNo3 = new Object[][]{
                {"India","Join partner or family for a long stay","Yes","You’ll need a visa to join your family or partner in the UK"}
        };
        return dataNo3;
    }



}
