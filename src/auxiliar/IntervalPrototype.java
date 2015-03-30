package auxiliar;

import intervals.BothOpenedInterval;

import intervals.Interval;
import intervals.LeftOpenedInterval;
import intervals.RightOpenedInterval;
import intervals.UnOpenedInterval;

import java.util.HashMap;
import java.util.Map;

public class IntervalPrototype {

	private Map<String, Interval> prototypes;

	public IntervalPrototype(double maximum, double minimum) {
		prototypes = new HashMap<String, Interval>();
		addInterval(Opening.BOTH_OPENED, new BothOpenedInterval(minimum,
				maximum));
		addInterval(Opening.RIGHT_OPENED, new RightOpenedInterval(minimum,
				maximum));
		addInterval(Opening.LEFT_OPENED, new LeftOpenedInterval(minimum,
				maximum));
		addInterval(Opening.UNOPENED, new UnOpenedInterval(minimum, maximum));

	}

	public void addInterval(Opening type, Interval interval) {
		prototypes.put(type.toString(), interval);
	}

	public void removeInterval(Opening type) {
		prototypes.remove(type.toString());
	}

	public Object prototype(String type) throws CloneNotSupportedException {
		return prototypes.get(type).clone();
	}
}
