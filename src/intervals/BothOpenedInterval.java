package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(double minimum, double maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getType() {
		return Opening.BOTH_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return value > this.minimum && value < this.maximum;
	}

	@Override
	public boolean includes(Interval interval) {
		// TODO Auto-generated method stub
		return interval.includes(this);
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		
		// TODO Auto-generated method stub
		return interval.minimum <= this.minimum
				&& interval.maximum >= this.maximum;
	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		
		return interval.minimum <= this.minimum
				&& interval.maximum >= this.maximum;
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		
		return interval.minimum <= this.minimum
				&& interval.maximum >= this.maximum;
	}

	@Override
	public boolean includes(UnOpenedInterval interval) {
		
		return interval.minimum <= this.minimum
				&& interval.maximum >= this.maximum;
	}

	@Override
	public String toString() {
		return "Interval[" + minimum + "," + maximum + "," + this.getClass()
				+ "]";
	}

}
