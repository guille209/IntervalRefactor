package points;

public abstract class Point {
	protected double value;

	public Point(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public abstract boolean checkMinimum(Point point);

	public abstract boolean checkMinimum(ExactPoint point);

	public abstract boolean checkMinimum(FromAlmostPoint point);

	public abstract boolean checkMinimum(ToAlmostPoint point);

	public abstract boolean checkMaximum(Point point);

	public abstract boolean checkMaximum(ExactPoint point);

	public abstract boolean checkMaximum(FromAlmostPoint point);

	public abstract boolean checkMaximum(ToAlmostPoint point);

}
