package intervals;

import points.Point;
import auxiliar.Opening;

public class UnOpenedInterval extends Interval {

	public UnOpenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getType() {
		return Opening.UNOPENED;
	}

	@Override
	public boolean includes(double value) {
		return value >= this.minimum.getValue() && value <= this.maximum.getValue();
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}

	@Override
	public boolean includes(BothOpenedInterval interval) {
		return interval.minimum.getValue() < this.minimum.getValue()
				&& interval.maximum.getValue() > this.maximum.getValue();
	}

	@Override
	public boolean includes(LeftOpenedInterval interval) {
		return menorMayorIgual(interval);
	}

	@Override
	public boolean includes(RightOpenedInterval interval) {
		return menorIgualMayor(interval);
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
