package intervals;

public class RightOpenedInterval extends Interval {

	public RightOpenedInterval(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public Opening getType() {
		return Opening.RIGHT_OPENED;
	}

}
