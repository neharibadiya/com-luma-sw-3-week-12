package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class MenTest extends Utility {
        String baseURL = "https://magento.softwaretestingboard.com/";

        @Before
        public void setUp() {
            openBrowser(baseURL);
        }

        @Test
        public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
            //Mouse Hover on Men Menu
            mouseHover(By.xpath("(//a[@id='ui-id-5'])[1]"));
            //Mouse Hover on Bottoms
            Thread.sleep(1000);
            mouseHover(By.xpath("(//span[contains(text(),'Bottoms')])[2]"));
            //Click on Pants
            Thread.sleep(1000);
            clickOnElement(By.xpath("(//span[contains(text(),'Pants')])[2]"));
            //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
            mouseHover(By.xpath("//a[contains(text(),'Cronus Yoga Pant')]"));
            clickOnElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
            //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
            mouseHover(By.xpath("//a[contains(text(),'Cronus Yoga Pant')]"));
            clickOnElement(By.xpath("(//div[@id='option-label-color-93-item-49'])[1]"));
            //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
            mouseHover(By.xpath("//a[contains(text(),'Cronus Yoga Pant')]"));
            clickOnElement(By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]"));
            //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
            Thread.sleep(2000);
            verifyThis("You added Cronus Yoga Pant to your shopping cart.",By.xpath("//div[@class='message-success success message']"));
            //Click on ‘shopping cart’ Link into message
            clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));
            //Verify the text ‘Shopping Cart.’
            verifyThis("Shopping Cart",By.xpath("//span[@class='base']"));
            //Verify the product name ‘Cronus Yoga Pant’
            verifyThis("Cronus Yoga Pant",By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"));
            //Verify the product size ‘32’
            verifyThis("32",By.xpath("//dd[contains(text(),'32')]"));
            //Verify the product colour ‘Black’
            verifyThis("Black",By.xpath("//dd[contains(text(),'Black')]"));
        }
        @After
        public void tearDown(){
            //closeBrowser();
        }
}
