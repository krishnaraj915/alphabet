package project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testcalculator{
	@Test 
    void Testadd() {
		calculator cop = new calculator();
		int res = cop.Add(3,2);
		assertEquals(5,res," 2+3 should equal 5");
	}
}
