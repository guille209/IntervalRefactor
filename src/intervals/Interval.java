package intervals;

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
		return (this.minimum.getValue() + this.maximum.getValue()) / 2;
	}

	public abstract boolean includes(double value);

	public abstract boolean includes(Interval interval);

	public abstract boolean includes(BothOpenedInterval interval);

	public abstract boolean includes(LeftOpenedInterval interval);

	public abstract boolean includes(RightOpenedInterval interval);

	public abstract boolean includes(UnOpenedInterval interval);

	public boolean intersectsWith(Interval interval) {
		// TODO
		return false;
	}

	public Interval intersection(Interval interval) {
		// TODO
		return null;
	}

	public boolean menorIgualMayorIgual(Interval interval) {
		return interval.minimum.getValue() <= this.minimum.getValue()
				&& interval.maximum.getValue() >= this.maximum.getValue();
	}

	public boolean menorIgualMayor(Interval interval) {
		return interval.minimum.getValue() <= this.minimum.getValue()
				&& interval.maximum.getValue() > this.maximum.getValue();
	}

	public boolean menorMayorIgual(Interval interval) {
		return interval.minimum.getValue() < this.minimum.getValue()
				&& interval.maximum.getValue() >= this.maximum.getValue();
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
