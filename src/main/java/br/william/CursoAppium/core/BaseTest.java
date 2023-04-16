package br.william.CursoAppium.core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    @AfterClass
    public static void finalizarClasse() {
        DriverFactory.killDriver();
    }
    @After
    public void tearDown() {
        gerarScreenShot();
        DriverFactory.getDriver().resetApp();
    }

    public void gerarScreenShot() {

        try {
            File imagem =  ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshots/imagem.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
