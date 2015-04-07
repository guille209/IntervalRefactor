package points;

public class ClosedPoint extends Point {

	public ClosedPoint(double value) {
		super(value);
	}

	@Override
	public boolean isGreaterOrEquals(ClosedPoint p) {
		return greaterOrEquals(p);
	}

	@Override
	public boolean isGreaterOrEquals(OpenedPoint p) {
		return this.value > p.value;
	}

	@Override
	public boolean isLessOrEquals(ClosedPoint p) {
		return lessOrEquals(p);
	}

	@Override
	public boolean isLessOrEquals(OpenedPoint p) {
		return this.value < p.value;
	}

	@Override
	public boolean checkMinimum(Point p) {
		return p.isGreaterOrEquals(this);
	}

	@Override
	public boolean checkMaximum(Point p) {
		return p.isLessOrEquals(this);
	}
}
