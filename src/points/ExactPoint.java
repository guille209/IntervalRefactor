package points;

public class ExactPoint extends Point {

	public ExactPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkMinimum(Point point) {
		// TODO Auto-generated method stub
		return point.checkMinimum(this);
	}

	@Override
	public boolean checkMinimum(ExactPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMinimum(FromAlmostPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMinimum(ToAlmostPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMaximum(Point point) {
		// TODO Auto-generated method stub
		return point.checkMaximum(this);
	}

	@Override
	public boolean checkMaximum(ExactPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMaximum(FromAlmostPoint point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMaximum(ToAlmostPoint point) {
		// TODO Auto-generated method stub
		return false;
	}



}
