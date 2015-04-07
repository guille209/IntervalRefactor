package intervals;

import points.ExactPoint;
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
		ExactPoint point = new ExactPoint(value);
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

	public boolean menorIgualMayorIgual(Interval interval) {
		return interval.minimum.menorIgual(this.minimum)
				&& interval.maximum.mayorIgual(this.maximum);
	}

	public boolean menorIgualMayor(Interval interval) {
		return interval.minimum.menorIgual(this.minimum)
				&& interval.maximum.mayor(this.maximum);
	}

	public boolean menorMayorIgual(Interval interval) {
		return interval.minimum.menor(this.minimum)
				&& interval.maximum.mayorIgual(this.maximum);
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
