package Jpract;
import Jpract.TesterInfo.Priority;
import Jpract.*;

@TesterInfo(
		priority = Priority.HIGH,
		createdBy = "sriv",
		tags = {"automation","test"}
		)
public class TestExample {

	@Test
	void testA(){
		if (true)
			throw new RuntimeException("This test always failed");
	}
	
	@Test(enabled = false)
	void testB(){
		if (false)
			throw new RuntimeException("This test always failed");
		
	}
	
	@Test(enabled = true)
	void testC(){
		if (10>1){
		}
		}
			
	}
	


