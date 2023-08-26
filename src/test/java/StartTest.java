import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.List;

public class StartTest {

    WebDriver wd;


    @BeforeMethod
    public void precondition() {
    wd = new ChromeDriver();
//    wd.get("https://telranedu.web.app/home");
    wd.navigate().to("https://telranedu.web.app/home");
//    wd.navigate().back();
//    wd.navigate().forward();
//    wd.navigate().refresh();

    }
    @Test
    public void testMethod() {
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("div"));
        System.out.println(elements.size());
//        howe many  tags "div" on the side -> 5

        wd.findElements(By.id("root"));
        //locator to element root

        wd.findElements(By.className("container"));
        wd.findElements(By.linkText("HOME"));
//         ......>HOME<.......

        wd.findElements(By.partialLinkText("OM"));


        //---------------------HW8----------------------------

      //  wd.findElements(By.className("activate"));
        wd.findElements(By.cssSelector(".activate"));
        wd.findElements(By.cssSelector("[class = 'activate']"));
        wd.findElements(By.cssSelector("[href='/login']"));



    }

    @AfterMethod
    public void postcondition() {
//        wd.close();
//    wd.quit();
//    quit - > close all



    }
}
