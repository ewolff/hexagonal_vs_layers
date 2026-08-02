package com.ewolff.hexagonal_vs_layers.ui_adapter;

import com.ewolff.hexagonal_vs_layers.logic.ui_port.BusinessLogic;

public class MyUI {
	
	BusinessLogic businessLogic;
	
	public MyUI(BusinessLogic businessLogic) {
		super();
		this.businessLogic = businessLogic;
	}

	public void userDidSomething() {
		businessLogic.someBusinessLogic();
	}

}
