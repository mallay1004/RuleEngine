import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuleEngineTest {

	private RuleEngineImpl rules = new RuleEngineImpl();
	
	@Before
	public void before() throws Exception {
		rules.configureRules();
	}
	
	@Test
	public void getResult1() {
		Input input = new Input("Florida", "7-1 ARM", 720);
		Result result = rules.getResult(input);
		assertTrue(result.getInterestRate().equals(new Double(5.2)));
		assertEquals(result.isDisqualified(), true);
	}
	
	@Test
	public void getResult2() {
		Input input = new Input("Texas", "PR", 410);
		Result result = rules.getResult(input);
		assertTrue(result.getInterestRate().equals(new Double(4.5)));
		assertEquals(result.isDisqualified(), false);
	}
}
