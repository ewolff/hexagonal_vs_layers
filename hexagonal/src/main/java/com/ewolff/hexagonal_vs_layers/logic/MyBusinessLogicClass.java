package com.ewolff.hexagonal_vs_layers.logic;

import com.ewolff.hexagonal_vs_layers.logic.database_port.Repository;
import com.ewolff.hexagonal_vs_layers.logic.ui_port.BusinessLogic;

public class MyBusinessLogicClass implements BusinessLogic {
	
	Repository myRepository;

	public MyBusinessLogicClass(Repository myRepository) {
		super();
		this.myRepository = myRepository;
	}
	
	@Override
	public void someBusinessLogic() {
		myRepository.someDatabaseCode();
	}

}
