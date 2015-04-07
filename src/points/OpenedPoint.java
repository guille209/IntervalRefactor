package points;

public class OpenedPoint extends Point {

	public OpenedPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isGreaterOrEquals(ClosedPoint p) {
		// TODO Auto-generated method stub
		return this.value >= p.value;
	}

	@Override
	public boolean isGreaterOrEquals(OpenedPoint p) {
		// TODO Auto-generated method stub
		return this.value >= p.value;
	}

	@Override
	public boolean isLessOrEquals(ClosedPoint p) {
		// TODO Auto-generated method stub
		return this.value <= p.value;
	}

	@Override
	public boolean isLessOrEquals(OpenedPoint p) {
		// TODO Auto-generated method stub
		return this.value <= p.value;
	}
	
	public boolean greaterOrEquals(Point p){
		return value > p.value;
	}
	public boolean lessOrEquals(Point p){
		return value < p.value;
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
