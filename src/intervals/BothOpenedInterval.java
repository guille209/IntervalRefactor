package intervals;

import points.Point;
import auxiliar.Opening;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(Point minimum, Point maximum) {
		super(minimum, maximum);
	}

	@Override
	public Opening getType() {
		return Opening.BOTH_OPENED;
	}

	@Override
	public boolean includes(double value) {
		return value > this.minimum.getValue() && value < this.maximum.getValue();
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.isIncluded(this);
	}

	@Override
	public boolean isIncluded(BothOpenedInterval interval) {
		System.out.println("Soy un "+this+"\n me comparo con "+interval);
		System.out.println();System.out.println();
		return menorIgualMayorIgual(interval);
	}

	@Override
	public boolean isIncluded(LeftOpenedInterval interval) {
		System.out.println("Soy un "+this+"\n me comparo con "+interval);
		System.out.println();System.out.println();
		return menorIgualMayorIgual(interval);
	}

	@Override
	public boolean isIncluded(RightOpenedInterval interval) {
		System.out.println("Soy un "+this+"\n me comparo con "+interval);
		System.out.println();System.out.println();
		
		return menorIgualMayorIgual(interval);
	}

	@Override
	public boolean isIncluded(UnOpenedInterval interval) {
		System.out.println("This: "+this+"\n Comparado con: "+interval);
		System.out.println();
		System.out.println();
		return menorIgualMayorIgual(interval);
	}

	@Override
	public String toString() {
		return "Interval[" + minimum + "," + maximum + "," + this.getClass()
				+ "]";
	}

}
