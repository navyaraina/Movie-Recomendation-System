package rating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class rating {
    public static String getRatings(String gen) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        
        // Set the path to the ChromeDriver executable
        System.setProperty("webriver.chrome.driver", "./src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver (options);

        // Navigate to the Rotten Tomatoes homepage
        driver.get("https://editorial.rottentomatoes.com/guide/popular-movies/");

        // Locate a list of movie name elements using the given CSS selector
        List<WebElement> movieNameElements = driver.findElements(By.cssSelector("h2 a"));

        // Locate a list of synopsis elements using the given CSS selector
        List<WebElement> synopsisElements = driver.findElements(By.cssSelector(".info.synopsis"));

        // Print the movie names and synopses
        for (int i = 0; i < 10; i++)
        {
            WebElement movieNameElement = movieNameElements.get(i);
            WebElement synopsisElement = synopsisElements.get(i);

            String movieName = movieNameElement.getText();
            String movieSynopsis = synopsisElement.getText();

            System.out.println("Movie Name: " + movieName);
            System.out.println("Synopsis: " + movieSynopsis);
            System.out.println();
        }

        // Close the WebDriver
        driver.quit();

        return "ratings recommended!";
    }
}