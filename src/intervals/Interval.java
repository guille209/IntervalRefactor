package intervals;

public class Interval {

	private double minimum;
	private double maximum;
	private Opening opening;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}

	public double midPoint() {
		return (this.minimum + this.maximum) / 2;
	}

	public boolean includes(double value) {
		switch (opening) {
		case BOTH_OPENED:
			return value > this.minimum && value < this.maximum;
		case LEFT_OPENED:
			return value > this.minimum && value <= this.maximum;
		case RIGHT_OPENED:
			return value >= this.minimum && value < this.maximum;
		case UNOPENED:
			return value >= this.minimum && value <= this.maximum;
		}
		return false;
	}

	public boolean includes(Interval interval) {
		return false;
	}

	public Opening getOpening() {
		return opening;
	}

	public void setOpening(Opening opening) {
		this.opening = opening;
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
