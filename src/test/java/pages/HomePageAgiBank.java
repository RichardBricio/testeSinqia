package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.StepDefinitions;

public class HomePageAmazon {

    public HomePageAmazon() {
		PageFactory.initElements(StepDefinitions.getDriver(), this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement barraPesquisa;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement btnBuscar;

	@FindBy(xpath = "//div[@id='nav-flyout-searchAjax']")
	WebElement boxAutoComplete;

	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")
	WebElement menuTodos;
	
	@FindBy(xpath = "//body/div[@id='hmenu-container']/div[@id='hmenu-canvas-background']/div[1]")
	WebElement menuTodosFechar;

	@FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[1]")
	WebElement menuVendaNaAmazon;

	@FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[2]")
	WebElement menuMaisVendidos;

	@FindBy(xpath = "//a[contains(text(),'Ofertas do Dia')]")
	WebElement menuOfertasDoDia;

	@FindBy(xpath = "//a[@id='nav-link-amazonprime']")
	WebElement menuPrime;

	@FindBy(xpath = "//a[contains(text(),'Livros')]")
	WebElement menuLivros;

	@FindBy(xpath = "//a[contains(text(),'Música')]")
	WebElement menuMusica;

	@FindBy(xpath = "//a[contains(text(),'Eletrônicos')]")
	WebElement menuEletronicos;

	@FindBy(xpath = "//a[contains(text(),'Ideias de Presente')]")
	WebElement menuIdeiasDePresente;

	@FindBy(xpath = "//a[contains(text(),'Casa')]")
	WebElement menuCasa;

	@FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[10]")
	WebElement menuNovidadesNaAmazon;

	@FindBy(xpath = "//a[contains(text(),'Computadores')]")
	WebElement menuComputadores;

	@FindBy(xpath = "//a[contains(text(),'Games')]")
	WebElement menuGames;

	@FindBy(xpath = "//a[contains(text(),'Amazon Moda')]")
	WebElement menuAmazonModa;

	@FindBy(xpath = "//a[contains(text(),'Beleza')]")
	WebElement menuBeleza;

	@FindBy(xpath = "//a[contains(text(),'Cuidados Pessoais')]")
	WebElement menuCuidadosPessoais;

	@FindBy(xpath = "//a[contains(text(),'Brinquedos e Jogos')]")
	WebElement menuBrinquedosEJogos;

	@FindBy(xpath = "//span[contains(text(),'Notebook ASUS X515MA, Celeron Dual Core, SSD 128GB')]")
	WebElement noteAsus;

	public WebElement getBarraPesquisa() {
		return barraPesquisa;
	}

	public WebElement getBtnBuscar() {
		return btnBuscar;
	}

	public WebElement getBoxAutoComplete() {
		return boxAutoComplete;
	}

	public WebElement getMenuTodos() {
		return menuTodos;
	}

	public WebElement getMenuTodosFechar() {
		return menuTodosFechar;
	}

	public WebElement getMenuVendaNaAmazon() {
		return menuVendaNaAmazon;
	}

	public WebElement getMenuMaisVendidos() {
		return menuMaisVendidos;
	}

	public WebElement getMenuOfertasDoDia() {
		return menuOfertasDoDia;
	}

	public WebElement getMenuPrime() {
		return menuPrime;
	}

	public WebElement getMenuLivros() {
		return menuLivros;
	}

	public WebElement getMenuMusica() {
		return menuMusica;
	}

	public WebElement getMenuEletronicos() {
		return menuEletronicos;
	}

	public WebElement getMenuIdeiasDePresente() {
		return menuIdeiasDePresente;
	}

	public WebElement getMenuCasa() {
		return menuCasa;
	}

	public WebElement getMenuNovidadesNaAmazon() {
		return menuNovidadesNaAmazon;
	}

	public WebElement getMenuComputadores() {
		return menuComputadores;
	}

	public WebElement getMenuGames() {
		return menuGames;
	}

	public WebElement getMenuAmazonModa() {
		return menuAmazonModa;
	}

	public WebElement getMenuBeleza() {
		return menuBeleza;
	}

	public WebElement getMenuCuidadosPessoais() {
		return menuCuidadosPessoais;
	}

	public WebElement getMenuBrinquedosEJogos() {
		return menuBrinquedosEJogos;
	}

	public WebElement getPdtNoteGalaxyi7() {
			return noteAsus;
	}

}