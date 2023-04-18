package br.william.CursoAppium.test;

import br.william.CursoAppium.core.BaseTest;
import br.william.CursoAppium.page.MenuPage;
import org.junit.Test;

public class SplashTest extends BaseTest {

    private MenuPage menu = new MenuPage();

    @Test
    public void deveAguardarSplash() {
        //Acessar menu Splash
        menu.acessarSplash();

        //Verificar menu splash

        //aguardar saida do splash

        //Verificar exibicao do formulario
    }
}
