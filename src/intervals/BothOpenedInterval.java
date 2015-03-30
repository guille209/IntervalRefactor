package intervals;

import points.Point;
import auxiliar.Opening;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getType() {
		return Opening.BOTH_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return value > this.minimum.getValue() && value < this.maximum.getValue();
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		return menorIgualMayorIgual(interval);
	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		return menorIgualMayorIgual(interval);
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		return menorIgualMayorIgual(interval);
	}

	@Override
	public boolean includes(UnOpenedInterval interval) {
		return menorIgualMayorIgual(interval);
	}

	@Override
	public String toString() {
		return "Interval[" + minimum + "," + maximum + "," + this.getClass()
				+ "]";
	}

}
