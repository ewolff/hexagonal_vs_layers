package hexagonal_vs_layers.logic;

import hexagonal_vs_layers.database.MyRepository;

public class MyBusinessLogicClass {
	
	MyRepository myRepository;

	public MyBusinessLogicClass(MyRepository myRepository) {
		super();
		this.myRepository = myRepository;
	}
	
	public void someBusinessLogic() {
		myRepository.someDatabaseCode();
	}

}
