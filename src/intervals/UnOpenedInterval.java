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
		return interval.isIncluded(this);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		return interval.minimum.menor(this.minimum)
				&& interval.maximum.mayor(this.maximum);
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		return menorMayorIgual(interval);
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		return menorIgualMayor(interval);
	}

	@Override
	public boolean isIncluded(UnOpenedInterval interval) {
		return menorIgualMayorIgual(interval);
	}

	@Override
	public String toString() {
		return "Interval[" + minimum + "," + maximum + "," + this.getClass()
				+ "]";
	}

}
