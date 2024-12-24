package src.tg;

import org.testng.annotations.Test;

public class NewClass {

	@Test(priority=1)
	
	public void Registion() {
		System.out.println("You on Registration from");
	}
	
	@Test(priority=2)
	public void Lohin() {
		System.out.println("Login Kro");
	}
	@Test(priority=3)
	public void Home() {
		System.out.println("You Are On Home Page");
	}
	@Test(priority=4)
	public void LogOut() {
		System.out.println("Logout Ho Raha hai....");
	}
}

//Priority concept we will for assign or deside to sequence 

//if u give priority only two methods then first run non priority methods and then run priority methods..