package intervals;

import points.Point;
import auxiliar.Opening;

public class RightOpenedInterval extends Interval {

	public RightOpenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getType() {
		return Opening.RIGHT_OPENED;
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
