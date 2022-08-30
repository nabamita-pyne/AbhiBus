package pageRepository;

public class AbhiBus {
    public void login (String path, long PhoneNumber) {
        driver.findElement(By.xpath(path)).click();
        driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys(PhoneNumber);
        driver.findElement(By.xpath("//input[@id='getotp']")).click();

    }
    public void loginOtp(int Otp) {
        driver.findElement(By.xpath("//input[@id='signinotp']")).sendKeys(OTP);
        driver.findElement(By.xpath("//input[@id='signinVerify']")).click();
    }

}
