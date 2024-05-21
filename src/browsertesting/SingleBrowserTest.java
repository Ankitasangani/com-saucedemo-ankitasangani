package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */

public class SingleBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        // launch Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open baseUrl
        driver.get(baseUrl);

        // Maximise the browser window
        driver.manage().window().maximize();

        System.out.println("The title of the page: " + driver.getTitle());   // get the title of the page
        System.out.println("The current URL:  " + driver.getCurrentUrl());  //get the current Url of the page
        System.out.println("The page source: " + driver.getPageSource());  // get page source

        driver.findElement(By.id("user-name")).sendKeys("standard_user");  // Enter the email to email field
        driver.findElement(By.name("password")).sendKeys("secret_sauce");  // Enter the password to password field
        driver.findElement(By.id("login-button")).click(); // Click on Login Button

        System.out.println("Get current URl:" + driver.getCurrentUrl()); //get the current Url of the page
        driver.navigate().to(baseUrl); // Navigate to baseUrl
        driver.navigate().refresh(); // Refresh the page

        driver.close(); // close the current window where Selenium automation is running

    }
}
