package br.william.CursoAppium.page;

import br.william.CursoAppium.core.BasePage;
import br.william.CursoAppium.core.BaseTest;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormularioPage extends BasePage {

    public void escreverNome(String nome) {
        escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public String obterNome() {
        return obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public void selecionarCombo(String valor) {
        selecionarCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String obterValorCombo() {
        return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void clicarCheck() {
        clicar(By.className("android.widget.CheckBox"));

    }

    public void clicarSwitch() {
        clicar(MobileBy.AccessibilityId("switch"));
    }

    public boolean isCheckMarcado() {
       return isCheckMarcado(By.className("android.widget.CheckBox"));
    }

    public boolean isSwitchMarcado() {
        return isCheckMarcado(MobileBy.AccessibilityId("switch"));
    }

    public void salvar() {
        clicarporTexto("SALVAR");
    }

    public void salvarDemorado() {
        clicarporTexto("SALVAR DEMORADO");
    }

}
