package intervals;

public class RightOpenedInterval extends Interval {

	public RightOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getType() {
		return Opening.RIGHT_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return value >= this.minimum && value < this.maximum;
	}

}
