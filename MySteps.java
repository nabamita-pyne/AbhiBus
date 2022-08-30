package steps;

import pageRepository.AbhiBus;
import pageRepository.GenericPage;

public class MySteps {



    @Given("open Website")
    public void openingWebsite() {
        GenericPage genericPage= new GenericPage();
        genericPage.open("https://www.abhibus.com/");
    }

    @When("passing $phone and $otp")
    public void credentials(long phone, int otp) {
        AbhiBus abhiBus= new AbhiBus();
        abhiBus.login(//span[@id='AccLogin'],7980686595);
                abhiBus.loginOtp(98980);

    }

    @Then("successfully logged")
    public void verification() {
        String hometext= driver.findElement(By.linkText("Home")).getText();
        if (StringUtils.containsIgnoreCase(hometext, "Home"){
            System.out.println("verified");
        }
        else {
            System.out.println("not verified")
        }


    }



}
