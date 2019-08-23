package paytm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\user\\eclipse-workspace\\test\\src\\test\\resources\\login\\Review.feature"},glue= {"com.paytm.flight"},
tags= {"@Regression","@smoke"})
public class Paytm_Runner  {
	

}
//@RunWith(Cucumber.class) shold not be there

/*public class Paytm_Runner extends AbstractTestNGCucumberTests {
	

}
*/


//to enable we use~