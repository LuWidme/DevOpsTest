package ny.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class DevopstestApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void doTest() {
		TestContoller testContoller=new TestContoller();
		Assertions.assertEquals( ResponseEntity.ok().body("Docker is Easy! :D"), testContoller.HomeTest() );
	}
}
