package br.william.CursoAppium.core;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

import static br.william.CursoAppium.core.DriverFactory.getDriver;

public class BasePage {

    //METODOS GENERICOS DE USO COMUM
    public void escrever(By by, String texto) {

        getDriver().findElement(by).sendKeys(texto);


    }

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();

    }

    public void clicar(By by) {
        getDriver().findElement(by).click();
    }

    public void clicarporTexto(String texto) {
        clicar(By.xpath("//*[@text='"+texto+"']"));

    }
    public void selecionarCombo(By by, String valor) {
        //clicar no combo
        getDriver().findElement(by).click();
        //selecionar opcao desejada
        clicarporTexto(valor);

    }

    public boolean isCheckMarcado(By by) {
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }

    public boolean existeUmElementoPorTexto(String texto) {
            List <MobileElement>elementos = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
            return elementos.size() > 0;
    }
}
