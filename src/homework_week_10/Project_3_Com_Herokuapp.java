package homework_week_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
public class Project_3_Com_Herokuapp {

    static String browser = "chrome";
    //base url
    static String baseUrl = "http://the-internet.herokuapp.com/login";

    static WebDriver driver;

    public static void main(String[] args) {


        //chrome browser setup
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        //open url
        driver.get(baseUrl);

        //print title
        System.out.println("The title of the page is : " + driver.getTitle());

        //print current url
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        //print source
        System.out.println("The source of page is : " + driver.getPageSource());

        //enter email
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        //enter password
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");

        //click on login button
        driver.findElement(By.className("fa-sign-in")).click();

        //print current url
        System.out.println("After clicking login button, currrent URL is : " + driver.getCurrentUrl());

        //refresh the page
        driver.navigate().refresh();

        //close the browser
        driver.quit();
    }
}
