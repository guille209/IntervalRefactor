package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public Opening getType() {
		return Opening.BOTH_OPENED;
	}

}
