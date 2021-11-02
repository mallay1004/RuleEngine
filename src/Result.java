
public class Result {
	private Double interestRate;
	private boolean disqualified;
	
	public Result(Double interestRate, boolean disqualified) {
		super();
		this.interestRate = interestRate;
		this.disqualified = disqualified;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public boolean isDisqualified() {
		return disqualified;
	}

	public void setDisqualified(boolean disqualified) {
		this.disqualified = disqualified;
	}

}
