package com.ewolff.hexagonal_vs_layers.logic;

import com.ewolff.hexagonal_vs_layers.logic.database_port.Repository;

public class MyBusinessLogicClass {
	
	Repository myRepository;

	public MyBusinessLogicClass(Repository myRepository) {
		super();
		this.myRepository = myRepository;
	}
	
	public void someBusinessLogic() {
		myRepository.someDatabaseCode();
	}

}
