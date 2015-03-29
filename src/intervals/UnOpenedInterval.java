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

	@Override
	public boolean includes(Interval interval) {
		// TODO Auto-generated method stub
		return interval.includes(this);
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		// TODO Auto-generated method stub
		return interval.minimum < this.minimum
				&& interval.maximum > this.maximum;
	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		// TODO Auto-generated method stub
		return interval.minimum < this.minimum
				&& interval.maximum >= this.maximum;
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		// TODO Auto-generated method stub
		return interval.minimum <= this.minimum
				&& interval.maximum > this.maximum;
	}

	@Override
	public boolean includes(UnOpenedInterval interval) {
		// TODO Auto-generated method stub
		return interval.minimum <= this.minimum
				&& interval.maximum >= this.maximum;
	}

	@Override
	public String toString() {
		return "Interval[" + minimum + "," + maximum + ","+this.getClass()+"]";
	}
	
	
	

}
