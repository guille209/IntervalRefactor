package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getType() {
		return Opening.LEFT_OPENED;
	}

	@Override
	public boolean includes(double value) {
		// TODO Auto-generated method stub
		return value > this.minimum && value <= this.maximum;
	}
}
