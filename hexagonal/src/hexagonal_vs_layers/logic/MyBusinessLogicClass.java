package hexagonal_vs_layers.logic;

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
