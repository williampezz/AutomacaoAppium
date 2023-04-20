package br.william.CursoAppium.page;

import br.william.CursoAppium.core.BasePage;
import br.william.CursoAppium.core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static br.william.CursoAppium.core.DriverFactory.getDriver;

public class SplashPage extends BasePage {
    public boolean isTelaSlpashVisivel() {
        return existeUmElementoPorTexto("Splash!");
    }

    public void aguardarSplashSumir() {
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='+Splash!+']")));
    }
}
