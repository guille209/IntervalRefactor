package auxiliar;

import intervals.BothOpenedInterval;
import intervals.Interval;
import intervals.LeftOpenedInterval;
import intervals.RightOpenedInterval;
import intervals.UnOpenedInterval;

import java.util.HashMap;
import java.util.Map;

import points.ExactPoint;
import points.FromAlmostPoint;
import points.Point;
import points.ToAlmostPoint;

public class IntervalPrototype {

	private Map<Opening, Interval> prototypes;

	public IntervalPrototype(double maximum, double minimum) {
		prototypes = new HashMap<Opening, Interval>();
		addInterval(Opening.BOTH_OPENED, new BothOpenedInterval(
				new FromAlmostPoint(minimum), new ToAlmostPoint(maximum)));
		addInterval(Opening.RIGHT_OPENED, new RightOpenedInterval(
				new ExactPoint(minimum), new ToAlmostPoint(maximum)));
		addInterval(Opening.LEFT_OPENED, new LeftOpenedInterval(
				new FromAlmostPoint(minimum), new ExactPoint(maximum)));
		addInterval(Opening.UNOPENED, new UnOpenedInterval(new ExactPoint(
				minimum), new ExactPoint(maximum)));

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
