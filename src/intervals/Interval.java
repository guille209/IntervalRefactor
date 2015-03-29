package intervals;

public abstract class Interval {

	protected double minimum;
	protected double maximum;

	public Interval(double minimum, double maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public abstract Opening getType();

	public double midPoint() {
		return (this.minimum + this.maximum) / 2;
	}

	public abstract boolean includes(double value);

	public boolean includes(Interval interval) {
		return false;
	}

	public boolean intersectsWith(Interval interval) {
		// TODO
		return false;
	}

	public Interval intersection(Interval interval) {
		// TODO
		return null;
	}

	@Override
	public String toString() {
		return "Interval[" + minimum + "," + maximum + "]";
	}

	@Override
	public boolean equals(Object object) {
		Interval intervalo = (Interval) object;
		return maximum == intervalo.maximum && minimum == intervalo.minimum
				&& opening.equals(intervalo.opening);
	}
}
