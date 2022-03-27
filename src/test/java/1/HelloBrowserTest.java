// package demo;

// import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

@Test
public class HelloBrowserTest {
    
    public static void test() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://seek.com.au");

        driver.getTitle();

        WebElement searchBox = driver.findElement(By.id("keywords-input"));
        searchBox.sendKeys("QA Automation Testing");

        WebElement searchButton = driver.findElement(By.xpath("//button[@data-automation='searchButton']"));
        
        searchButton.click();

        WebElement searchBar = driver.findElement(By.id("SearchBar__Where"));

        searchBar.sendKeys("Accountant");

        driver.quit();

    }