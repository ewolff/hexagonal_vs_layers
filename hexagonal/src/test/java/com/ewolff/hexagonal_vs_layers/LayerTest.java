package com.ewolff.hexagonal_vs_layers;

import org.junit.jupiter.api.Test;

import com.ewolff.hexagonal_vs_layers.database_adapater.MyRepository;
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
