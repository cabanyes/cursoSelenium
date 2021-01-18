package cursoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "1";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver = null;

		if (browser.contentEquals("1")) {

			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}

		/*driver.get("http://www.filmaffinity.com");
		driver.manage().window().maximize();*/

		/*
		 * WebElement campobusqueda = driver.findElement(By.id("top-search-input"));
		 * System.out.println("Dimensiones de campo de busqueda: " +
		 * campobusqueda.getAttribute("clientHeight") +
		 * campobusqueda.getAttribute("clientWidth")); List<WebElement>
		 * listabotonRegistrar = driver.findElements(By.className("sign-in"));
		 * System.out.println("numero de botones: " + listabotonRegistrar.size());
		 * 
		 * for (WebElement boton : listabotonRegistrar) {
		 * 
		 * System.out.println(boton.getAttribute("innerText"));
		 * 
		 * } // div[@class='mini-tours']//a // a[text()='Registrarse'] //
		 * *[text()='España' and
		 * // @class='lsmheader']/parent::div//a[contains(text(),'strenos')] //
		 * div[@class="catrd-container"]//div[@class='mtitle' and //
		 * starts-with(text(),'The')]
		 * 
		 * // https://www.w3schools.com/xml/xpath_intro.asp
		 * 
		 * // full complet xpath List<WebElement> listaEtiquetas = driver.findElements(
		 * By.xpath(
		 * "/html/body/div[5]/table/tbody/tr/td[2]/div[1]/div[4]/div[1]/div[2]/div[2]/ul/li/a"
		 * )); System.out.println("numero de etiquetas: " + listaEtiquetas.size()); for
		 * (WebElement etiqueta : listaEtiquetas) {
		 * System.out.println(etiqueta.getText());
		 * 
		 * }
		 * 
		 * WebElement context = driver.findElement(By.
		 * xpath("//*[text()='Usuarios' and @class='lsmheader']/parent::div"));
		 * WebElement primerElemento = context.findElement(By.xpath(".//li[1]/a"));
		 * //WebElement segundoElemento = context.findElement(By.xpath("./li[2]/a"));
		 * //WebElement terceroElemento = context.findElement(By.xpath("./li[3]/a"));
		 * 
		 * System.out.println(primerElemento.getText());
		 * //System.out.println(segundoElemento.getText());
		 * //System.out.println(terceroElemento.getText());
		 * 
		 */
		
		driver.get("https://www.filmaffinity.com/es/register.php");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[text()='Registrarse' and @class='register']")).click();
		
		//WebElement nickfield = driver.findElement(By.name("nick"));
		//nickfield.sendKeys("Javier");
		//nickfield.clear();
		//nickfield.sendKeys("Pablo");
		
		driver.findElement(By.name("year")).sendKeys("2020");
		
		driver.findElement(By.id("sex-button")).click();
		//driver.findElement(By.xpath("//*[text()='Femenino' and @class='ui-selectmenu-text']")).click();
		driver.findElement(By.xpath("/html/body/div[8]/ul/li[2]/div")).click();
		//driver.findElement(By.xpath("//option[@value='F']")).click() ;
		//Select dropdown = new Select(driver.findElement(By.id("Género")));
		//dropdown.selectByValue("F");
		//driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr/td[2]/div[1]/div[2]/form/div[3]/div/div[2]/select/option[2]")).click();
		
		driver.findElement(By.name("city")).sendKeys("Munich");
		
		driver.findElement(By.id("country-button")).click();
		driver.findElement(By.xpath("/html/body/div[7]/ul/li[3]/div")).click();
		
		driver.findElement(By.name("email")).sendKeys("selenium@test.com");
		
		WebElement checkbox = driver.findElement(By.name("discover_by_email"));
		System.out.println("El estado es : " + checkbox.isSelected());
		checkbox.click();
		System.out.println("El estado es : " + checkbox.isSelected());
	}
}
