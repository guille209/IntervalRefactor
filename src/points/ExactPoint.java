package points;

public class ExactPoint extends Point {

	public ExactPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isGreaterOrEquals(ExactPoint p) {
		// TODO Auto-generated method stub
		return this.value >= p.value;
	}

	@Override
	public boolean isGreaterOrEquals(OpenedPoint p) {
		// TODO Auto-generated method stub
		return this.value > p.value;
	}

	@Override
	public boolean isLessOrEquals(ExactPoint p) {
		// TODO Auto-generated method stub
		return this.value <= p.value;
	}

	@Override
	public boolean isLessOrEquals(OpenedPoint p) {
		// TODO Auto-generated method stub
		return this.value < p.value;
	}

	@Override
	public boolean checkMinimum(Point p) {
		// TODO Auto-generated method stub
		return p.isGreaterOrEquals(this);
	}

	@Override
	public boolean checkMaximum(Point p) {
		// TODO Auto-generated method stub
		return p.isLessOrEquals(this);
	}
}
