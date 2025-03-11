package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.StepDefinitions;

public class HomePageAgiBank {

    public HomePageAgiBank() {
		PageFactory.initElements(StepDefinitions.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"ast-desktop-header\"]/div/div/div/div/div[1]/div[1]/div/span/a/img")
	WebElement iconeHome;

	@FindBy(xpath = "//*[@id=\"ast-desktop-header\"]/div/div/div/div/div[3]/div[2]/div")
	WebElement lupaPesquisa;

	@FindBy(xpath = "//*[@id=\"search-field\"]")
	WebElement barraPesquisa;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/div[1]/article[1]")
	WebElement comResultadoPesquisa;

	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/main/section/div/p")
	WebElement semResultadoPesquisa;

	public WebElement getIconeHome() {
		return iconeHome;
	}

	public WebElement getLupaPesquisa() {
		return lupaPesquisa;
	}

	public WebElement getBarraPesquisa() {
		return barraPesquisa;
	}

	public WebElement getComResultadoPesquisa() {
		return comResultadoPesquisa;
	}

	public WebElement getSemResultadoPesquisa() {
		return semResultadoPesquisa;
	}

}