
public class Input {
	private String state;
	private String product;
	private Integer creditScore;
	public Input(String state, String product, Integer creditScore) {
		super();
		this.state = state;
		this.product = product;
		this.creditScore = creditScore;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}
	
}
