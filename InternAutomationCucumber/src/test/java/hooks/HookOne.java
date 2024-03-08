package hooks;

import Main.BaseClass;
import io.cucumber.java.BeforeAll;


public class HookOne {
	
	@BeforeAll
	public static void intidriverchrome() {
		BaseClass.initdriver();
	}

}
