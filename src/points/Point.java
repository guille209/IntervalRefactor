package points;

public abstract class Point {
	protected double value;

	public Point(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public double midPoint(Point point) {
		return (this.getValue() + point.getValue()) / 2;
	}

	public boolean greaterOrEquals(Point p) {
		return value >= p.value;
	}

	public boolean lessOrEquals(Point p) {
		return value <= p.value;
	}

	public abstract boolean checkMinimum(Point p);

	public abstract boolean checkMaximum(Point p);

	public abstract boolean isGreaterOrEquals(ClosedPoint p);

	public abstract boolean isGreaterOrEquals(OpenedPoint p);

	public abstract boolean isLessOrEquals(ClosedPoint p);

	public abstract boolean isLessOrEquals(OpenedPoint p);

}
