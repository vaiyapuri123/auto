package TestPage;

import org.testng.Assert;

import objectpage.Basepge;
import objectpage.Homeobject;

public class Hometest {
	Basepge bp;
	Homeobject hp;
	public Hometest() {
		
		bp=new Basepge();
		hp=new Homeobject();
		
	}
@Test
public void verifyWomenTagss12() {
	Assert.assertTrue(bp.elementFound(hp.getWomenTag()),"Failed to display");
}
@Test
public void verifyWomenPage() {
	hp.getWomenTag().click();
	String wt=bp.driver.getTitle();
	Assert.assertTrue(wt.contains("Women"), "Failed to verify");
}
}
