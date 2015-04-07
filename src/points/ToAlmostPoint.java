package points;

public class ToAlmostPoint extends Point {

	public ToAlmostPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkMinimum() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMaximum() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreaterOrEquals(ExactPoint p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreaterOrEquals(FromAlmostPoint p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreaterOrEquals(ToAlmostPoint p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessOrEquals(ExactPoint p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessOrEquals(FromAlmostPoint p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessOrEquals(ToAlmostPoint p) {
		// TODO Auto-generated method stub
		return false;
	}
}
