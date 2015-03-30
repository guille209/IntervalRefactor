package intervals;

import auxiliar.Opening;

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
		return value > this.minimum && value <= this.maximum;
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		return menorIgualMayor(interval);
	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		return menorIgualMayorIgual(interval);
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		return menorIgualMayor(interval);
	}

	@Override
	public boolean includes(UnOpenedInterval interval) {
		return menorIgualMayorIgual(interval);
	}

	public boolean menorIgualMayor(Interval interval) {
		return interval.minimum <= this.minimum
				&& interval.maximum > this.maximum;
	}

	public boolean menorIgualMayorIgual(Interval interval) {
		return interval.minimum <= this.minimum
				&& interval.maximum >= this.maximum;
	}

	@Override
	public String toString() {
		return "Interval[" + minimum + "," + maximum + "," + this.getClass()
				+ "]";
	}

}
