package br.william.CursoAppium.test;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import br.william.CursoAppium.core.BaseTest;
import br.william.CursoAppium.core.DriverFactory;
import br.william.CursoAppium.page.FormularioPage;
import br.william.CursoAppium.page.MenuPage;
import org.junit.Test;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.Assert.assertEquals;


@SuppressWarnings("deprecation")
public class FormularioTeste extends BaseTest {


	//Chamadas para o PageObject
	private MenuPage menu = new MenuPage();
	private FormularioPage formulario = new FormularioPage();

	 @org.junit.Before 
	 public void inicializaAppium() throws MalformedURLException {
		 menu.acessarFormulario();

	} 

	 @Test
	public void PreencherCampoText() throws MalformedURLException {
		    //escrever nome
		    formulario.escreverNome("William");
		    
		    //checar nome escrito
		    assertEquals("William", formulario.obterNome());
		  

	} 
	 
	 @Test
		public void ComboBox() throws MalformedURLException {
			    //Clicar no combo
                formulario.selecionarCombo("PS4");

			    //Verificar opcao selecionada

			    assertEquals("PS4", formulario.obterValorCombo());

			   
			   
		      }


	 
	 @Test
		public void interagirSwitch() throws MalformedURLException {
			    
  
			   
			    //Verificar status dos elementos
				 Assert.assertFalse(formulario.isCheckMarcado());
				 Assert.assertTrue(formulario.isSwitchMarcado());



                //clicar nos elementos
		         formulario.clicarCheck();
				 formulario.clicarSwitch();

			    
			    //verificar estados alterados
				 Assert.assertTrue(formulario.isCheckMarcado());
				 Assert.assertFalse(formulario.isSwitchMarcado());


}

    @Test
	   public void deveRealizarCadastro() {
		 //realiza cadastro do desafio
		 formulario.escreverNome("William");
		 formulario.clicarCheck();
		 formulario.clicarSwitch();
		 formulario.isCheckMarcado();
		 formulario.isSwitchMarcado();
		 formulario.salvar();
	}

	@Test
	public void deveRealizarCadastroDemorado() {

		//realiza cadastro do desafio
		formulario.escreverNome("William");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		formulario.salvarDemorado();

		//Espera explicita. Espera ate o elemento aparecer
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome: William']")));
	}

	 }              
