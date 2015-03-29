package intervals;

public class UnOpenedInterval extends Interval {

	public UnOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public Opening getType() {
		return Opening.UNOPENED;
	}

}
