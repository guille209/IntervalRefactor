package intervals;

import auxiliar.Opening;

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

	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		return menorMayorIgual(interval);

	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		return menorMayorIgual(interval);
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		return menorIgualMayorIgual(interval);
	}

	@Override
	public boolean includes(UnOpenedInterval interval) {
		return menorIgualMayorIgual(interval);
	}

	public boolean menorMayorIgual(Interval interval) {
		return interval.minimum < this.minimum
				&& interval.maximum >= this.maximum;
	}

	@Override
	public String toString() {
		return "Interval[" + minimum + "," + maximum + "," + this.getClass()
				+ "]";
	}

}
