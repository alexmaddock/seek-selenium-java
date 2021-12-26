import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloBrowser {
    
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://seek.com.au");

        driver.getTitle();

        WebElement searchBox = driver.findElement(By.xpath("/button[@data-automation='searchButton']"));
        searchBox.click();

        driver.quit();

    }

}