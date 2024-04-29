package second_code;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class First_script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\pc\\Desktop\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}

}
