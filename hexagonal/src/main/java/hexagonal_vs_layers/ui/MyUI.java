package hexagonal_vs_layers.ui;

import hexagonal_vs_layers.logic.MyBusinessLogicClass;

public class MyUI {
	
	MyBusinessLogicClass businessLogic;
	
	public MyUI(MyBusinessLogicClass businessLogic) {
		super();
		this.businessLogic = businessLogic;
	}

	public void userDidSomething() {
		businessLogic.someBusinessLogic();
	}

}
