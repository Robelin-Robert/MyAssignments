package fourthWeek.days2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FinanceYahoo {

	public static void main(String[] args) {
		
		//launch the window and the application
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://finance.yahoo.com/markets/crypto/all/");
		
		
		//first forloop to find the header and also column Index   
		int columnIndex=0;
		int count=0;
		List<WebElement> noOfColumns=driver.findElements(By.xpath("//table[contains(@class,'yf-')]//thead//tr//th"));
		List<WebElement> noOfRows=driver.findElements(By.xpath("//table[contains(@class,'yf-')]//tbody//tr"));
		for(int i=0; i<noOfColumns.size(); i++) {
			if(noOfColumns.get(i).getText().equals("Name")) {
				columnIndex= i+1;
				System.out.println(columnIndex);
				break;
			    
			}
		}
		//using the columnIndex and by the iteration we can get the value of the desired column
			for(int j=1;j<noOfRows.size();j++) {
		    	String cryptoName = driver.findElement(By.xpath("//table[contains(@class,'yf-')]//tbody//tr["+j+"]//td["+columnIndex+"]")).getText();
		    	count++;
		    	System.out.println("Row"+" "+j+" "+cryptoName);
		    	
		    }
			System.out.println(count);
			
		}
		
	
		
	}
	

