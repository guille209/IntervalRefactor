package points;

public abstract class Point {
	protected double value;

	public Point(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
	
	public double midPoint(Point point) {
		return (this.getValue() + point.getValue()) / 2;
	}
	
	public boolean menorIgual(Point point){
		return value <= point.getValue(); 
	}
	
	public boolean mayorIgual(Point point){
		return value >= point.getValue(); 
	}
	
	public boolean menor(Point point){
		return value < point.getValue(); 
	}
	
	public boolean mayor(Point point){
		return value > point.getValue(); 
	}
	
	public abstract boolean checkMinimum(Point p);
	
	public abstract boolean checkMaximum(Point p);
	
	public abstract boolean isGreaterOrEquals(ExactPoint p);
	public abstract boolean isGreaterOrEquals(FromAlmostPoint p);
	public abstract boolean isGreaterOrEquals(ToAlmostPoint p);
	
	public abstract boolean isLessOrEquals(ExactPoint p);
	public abstract boolean isLessOrEquals(FromAlmostPoint p);
	public abstract boolean isLessOrEquals(ToAlmostPoint p);

}
