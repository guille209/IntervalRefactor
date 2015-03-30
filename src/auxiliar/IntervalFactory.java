package auxiliar;

import intervals.Interval;

public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum,
			Opening opening) {	
		try {
			return (Interval) IntervalPrototype.getInstance(maximum, minimum).prototype(opening.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
