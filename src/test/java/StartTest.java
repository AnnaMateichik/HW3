import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));
        List<WebElement> elements = wd.findElements(By.tagName("div"));
        System.out.println(elements.size());
//        howe many  tags "div" on the side -> 5



        wd.findElement(By.id("root"));
        //locator to element root
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id='root']"));

        wd.findElement(By.className("container"));
        wd.findElement(By.xpath("//*[@class='container']"));
        wd.findElement(By.linkText("HOME"));
//         ......>HOME<.......
        wd.findElement(By.xpath("//*[text()='HOME']"));
        wd.findElement(By.xpath("//*[.='HOME']"));

        wd.findElements(By.partialLinkText("OM"));

    }
        //---------------------HW8----------------------------
        @Test
        public void testMethod1() {
            //  wd.findElements(By.className("activate"));
            wd.findElements(By.cssSelector(".activate"));
            wd.findElements(By.cssSelector("[class = 'activate']"));

            wd.findElement(By.cssSelector("[href='/login']"));
            wd.findElement(By.xpath("//*[@href='/login']"));

            wd.findElement(By.cssSelector("[href*='og']"));
            wd.findElement(By.xpath("//*[contains(@href,'og')]"));

            wd.findElement(By.cssSelector("[href^='/log']"));
            wd.findElement(By.xpath("//*[starts-with(@href,'/log')]"));

            wd.findElement(By.cssSelector("[href$='gin']"));


        }


    @AfterMethod
    public void postcondition() {
//        wd.close();
//    wd.quit();
//    quit - > close all



    }
}
