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
	public boolean includes(Interval interval) {
		return this.minimum.checkMinimum(interval.minimum)
				&& this.maximum.checkMaximum(interval.maximum);
	}

	@Override
	public String toString() {
		return "Interval[" + minimum + "," + maximum + "," + this.getClass()
				+ "]";
	}

}
