package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstScript {
    public static void main(String[] args){

        //Step 1 - Path of the webdriver ( chromedriver )
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonu kumar\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");

        //Step 2 - Initialisation of chromedriver
        WebDriver driver=new ChromeDriver();
        //Step 3 - Opening browser and going to target URL.
        driver.navigate().to("https://trello.com/");
        //Step 4 - Closing webdriver/session
        driver.quit();

    }
}
