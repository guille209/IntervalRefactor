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

}
