package intervals;

public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum,
			Opening opening) {
		IntervalPrototype intervalPrototype = new IntervalPrototype(maximum,
				minimum);
		try {
			return (Interval) intervalPrototype.prototype(opening.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
