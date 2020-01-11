package TestPage;

import org.openqa.selenium.By;

import objectpage.Basepge;
import objectpage.Dresspage;
import objectpage.Homeobject;

public class DresspageTest {
	Basepge bp;
	Homeobject hp;
	Dresspage dp;
	
	
	public DresspageTest() {
		bp=new Basepge();
		hp=new Homeobject();
		dp=new Dresspage();
		
	}
	public void verifySsize() {
		hp.getWomenTag().click();
		dp.getProductImg();
		bp.driver.switchTo().frame(dp.driver.findElement(By.xpath(xpathExpression)));
		dp.getbtn();
		
	}

}
