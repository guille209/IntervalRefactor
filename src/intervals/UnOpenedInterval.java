package intervals;

public class UnOpenedInterval extends Interval {

	public UnOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getType() {
		return Opening.UNOPENED;
	}

	@Override
	public boolean includes(double value) {
		return value >= this.minimum && value <= this.maximum;
	}
	

}
