package intervals;

import points.ClosedPoint;
import points.Point;
import auxiliar.Opening;

public abstract class Interval implements Cloneable {

	protected Point minimum;
	protected Point maximum;

	public Interval(Point minimum, Point maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public abstract Opening getType();

	public double midPoint() {
		return minimum.midPoint(maximum);
	}

	public boolean includes(double value) {
		ClosedPoint point = new ClosedPoint(value);
		return this.minimum.checkMinimum(point)
				&& this.maximum.checkMaximum(point);
	}

	public abstract boolean includes(Interval interval);

	public boolean intersectsWith(Interval interval) {
		// TODO
		return false;
	}

	public Interval intersection(Interval interval) {
		// TODO
		return null;
	}


	@Override
	public boolean equals(Object object) {
		Interval intervalo = (Interval) object;
		return maximum == intervalo.maximum && minimum == intervalo.minimum
				&& this.getType().equals(intervalo.getType());
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
