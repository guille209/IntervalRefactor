package auxiliar;

import intervals.Interval;

public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum,
			Opening opening) {	
		try {
			return (Interval) new IntervalPrototype(maximum, minimum).prototype(opening.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}

	}
}
