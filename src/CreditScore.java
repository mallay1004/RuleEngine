
public class CreditScore {
	private Integer creditScore;
	private String condition;
	private Double interestRate;
	
	
	public CreditScore(Integer creditScore, String condition, Double interestRate) {
		super();
		this.creditScore = creditScore;
		this.condition = condition;
		this.interestRate = interestRate;
	}
	
	public Integer getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
}
