package last;

import org.springframework.stereotype.Component;

@Component("finalComp")//Assigning an ID: finalComp
public class FinalTestComponent {
	public void doTest() {
		System.out.println("FinalTestComponent succeeded.");
	}
}
