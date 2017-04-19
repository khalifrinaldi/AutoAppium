import org.junit.*;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;

public class autoAppium extends setup {
    AppiumDriverLocalService service;

    @Before
    public void startAppium() throws Exception {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @Test
    public void step() throws Exception {
        PrepareAutomation();
        driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
        driver.findElement(By.id("com.flipkart.android:id/mobileNo")).clear();
        driver.findElement(By.id("com.flipkart.android:id/mobileNo")).sendKeys("818234123");
        driver.findElement(By.id("com.flipkart.android:id/et_password")).sendKeys("1234");
        driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
    }

    @After
    public void stopAppium() throws Exception {
        driver.quit();
        service.stop();
    }
}
