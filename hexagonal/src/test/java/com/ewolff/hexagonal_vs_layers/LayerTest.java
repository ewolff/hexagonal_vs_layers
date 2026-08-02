package com.ewolff.hexagonal_vs_layers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ewolff.hexagonal_vs_layers.database.MyRepository;
import com.ewolff.hexagonal_vs_layers.logic.MyBusinessLogicClass;
import com.ewolff.hexagonal_vs_layers.ui.MyUI;

class LayerTest {

	@Test
	void testBusinesssLogic() {
		MyBusinessLogicClass businessLogic = new MyBusinessLogicClass(new MyRepository());
		businessLogic.someBusinessLogic();
	}

	@Test
	void testUI() {
		MyBusinessLogicClass businessLogic = new MyBusinessLogicClass(new MyRepository());
		MyUI ui = new MyUI(businessLogic);
		ui.userDidSomething();
	}

}
