package br.william.CursoAppium.page;

import br.william.CursoAppium.core.BasePage;

public class MenuPage extends BasePage {

    public void acessarFormulario() {
        clicarporTexto(("Formulário"));

    }
    public void acessarSplash() {
        clicarporTexto("Splash");
    }
}
