package hexagonal_vs_layers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hexagonal_vs_layers.database.MyRepository;
import hexagonal_vs_layers.logic.MyBusinessLogicClass;

class LayerTest {

	@Test
	void test() {
		MyBusinessLogicClass businessLogic = new MyBusinessLogicClass(new MyRepository());
		businessLogic.someBusinessLogic();
	}

}
