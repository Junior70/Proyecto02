import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleTest2 extends Hooks {

    private WebDriverWait wait;

    public GoogleTest2() {
        wait = new WebDriverWait(driver, 30);
    }

    @Test
    public void GoogleTest2() throws InterruptedException {
        driver.get("https://www.google.com/");

        WebElement txtbuscador = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.visibilityOf(txtbuscador));
        txtbuscador.sendKeys("prueba");

        WebElement btn_buscar = driver.findElement(By.name("btnK"));
        wait.until(ExpectedConditions.elementToBeClickable(btn_buscar));
        btn_buscar.click();

        Thread.sleep(5000);
        Thread.sleep(5000);
    }
}
