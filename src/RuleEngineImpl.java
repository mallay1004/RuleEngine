import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuleEngineImpl {
	static Map<String, Double> products = new HashMap<>();
	static Map<String, String> states = new HashMap<>();
	static List<CreditScore> scores = new ArrayList<>();

	public void configureRules() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("products.csv"));
		String line;
		while ((line = br.readLine()) != null) {
			String[] sp = line.split(",");
			products.put(sp[0], Double.valueOf(sp[1]));
		}
		br.close();

		br = new BufferedReader(new FileReader("states.csv"));
		while ((line = br.readLine()) != null) {
			String[] sp = line.split(",");
			states.put(sp[0], sp[1]);
		}
		br.close();
		
		br = new BufferedReader(new FileReader("credit.csv"));
		while ((line = br.readLine()) != null) {
			String[] sp = line.split(",");
			CreditScore p = new CreditScore(Integer.valueOf(sp[0]), sp[1], Double.valueOf(sp[2]));
			scores.add(p);
		}
		br.close();
		
	}

	public Result getResult(Input input) {
		double d = 0.0;
		if (products.get("All") != null) {
			d += products.get("All");
		}
		if (products.get(input.getProduct()) != null) {
			d += products.get(input.getProduct());
		}
		if (scores.get(0).getCreditScore() > input.getCreditScore()) {
			d -= scores.get(0).getInterestRate();
		} else {
			d -= scores.get(1).getInterestRate();
		}
		boolean disqualified = false;
		if (states.get(input.getState()) != null) {
			disqualified = true;
		}
		Result result = new Result(d, disqualified);
		return result;
	}

}
