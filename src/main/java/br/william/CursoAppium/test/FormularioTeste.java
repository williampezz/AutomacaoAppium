package br.william.CursoAppium.test;


import java.net.MalformedURLException;

import br.william.CursoAppium.core.BaseTest;
import br.william.CursoAppium.page.FormularioPage;
import br.william.CursoAppium.page.MenuPage;
import org.junit.Test;

import junit.framework.Assert;

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
		 formulario.escreverNome("William");
		 formulario.clicarCheck();
		 formulario.clicarSwitch();
		 formulario.isCheckMarcado();
		 formulario.isSwitchMarcado();
		 formulario.salvar();
	}
	 }              
