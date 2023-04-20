package br.william.CursoAppium.test;

import br.william.CursoAppium.core.BaseTest;
import br.william.CursoAppium.page.MenuPage;
import br.william.CursoAppium.page.SplashPage;
import org.junit.Assert;
import org.junit.Test;

public class SplashTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SplashPage splash = new SplashPage();

    @Test
    public void deveAguardarSplash() {
        //Acessar menu Splash
        menu.acessarSplash();

        //Verificar menu splash
        splash.isTelaSlpashVisivel();
        //aguardar saida do splash
        splash.aguardarSplashSumir();

        //Verificar exibicao do formulario
        Assert.assertTrue(splash.existeUmElementoPorTexto("Formulário"));
    }
}
