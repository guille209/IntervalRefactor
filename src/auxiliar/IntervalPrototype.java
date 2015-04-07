package auxiliar;

import intervals.BothOpenedInterval;

import intervals.Interval;
import intervals.LeftOpenedInterval;
import intervals.RightOpenedInterval;
import intervals.UnOpenedInterval;

import java.util.HashMap;
import java.util.Map;

import points.ClosedPoint;
import points.OpenedPoint;
import points.Point;

public class IntervalPrototype {

	private Map<Opening, Interval> prototypes;

	public IntervalPrototype(double maximum, double minimum) {
		prototypes = new HashMap<Opening, Interval>();
		addInterval(Opening.BOTH_OPENED, new BothOpenedInterval(
				new OpenedPoint(minimum), new OpenedPoint(maximum)));
		addInterval(Opening.RIGHT_OPENED, new RightOpenedInterval(
				new ClosedPoint(minimum), new OpenedPoint(maximum)));
		addInterval(Opening.LEFT_OPENED, new LeftOpenedInterval(
				new OpenedPoint(minimum), new ClosedPoint(maximum)));
		addInterval(Opening.UNOPENED, new UnOpenedInterval(new ClosedPoint(
				minimum), new ClosedPoint(maximum)));

	}

	public void addInterval(Opening type, Interval interval) {
		prototypes.put(type, interval);
	}

	public void removeInterval(Opening type) {
		prototypes.remove(type.toString());
	}

	public Object prototype(Opening type) throws CloneNotSupportedException {
		return prototypes.get(type).clone();
	}
}
