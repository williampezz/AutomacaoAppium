package br.william.CursoAppium.core;

import org.openqa.selenium.By;

import static br.william.CursoAppium.core.DriverFactory.getDriver;

public class BasePage {

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

}
