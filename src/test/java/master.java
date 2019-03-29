
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class master {

 @Test
    public void open_browerser() {
       // System.setProperty("webdriver.gecko.driver", "/home/ghost/Desktop/java/geckodriver-v0.20.1-linux64/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //if you use jenkins comment this
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        //send 1st name
     driver.findElement(By.id("u_0_j")).sendKeys("fritname");
     //last name
     driver.findElement(By.id("u_0_l")).sendKeys("lastname");
    //email or number
     driver.findElement(By.id("u_0_o")).sendKeys("test@mail.com");
     driver.findElement(By.id("u_0_r")).sendKeys("test@mail.com");
     //password
     driver.findElement(By.id("u_0_v")).sendKeys("password");
     driver.findElement(By.id("u_0_9")).click();
    // click signup btn
     driver.findElement(By.id("u_0_11")).click();
    }


}
