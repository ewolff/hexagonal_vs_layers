package com.ewolff.hexagonal_vs_layers;

import org.junit.jupiter.api.Test;

import com.ewolff.hexagonal_vs_layers.database_adapater.MyRepository;
import com.ewolff.hexagonal_vs_layers.logic.MyBusinessLogicClass;
import com.ewolff.hexagonal_vs_layers.logic.ui_port.BusinessLogic;
import com.ewolff.hexagonal_vs_layers.ui_adapter.MyUI;

class LogicTest {

	@Test
	void testBusinesssLogic() {
		BusinessLogic businessLogic = new MyBusinessLogicClass(new MyRepository());
		businessLogic.someBusinessLogic();
	}

	@Test
	void testUI() {
		BusinessLogic businessLogic = new MyBusinessLogicClass(new MyRepository());
		MyUI ui = new MyUI(businessLogic);
		ui.userDidSomething();
	}

}
