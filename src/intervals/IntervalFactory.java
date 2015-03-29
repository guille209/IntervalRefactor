package intervals;

public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum,
			Opening opening) {

		
		if(opening.equals(Opening.LEFT_OPENED)){
			return new LeftOpenedInterval(minimum, maximum);
			
		}else if(opening.equals(Opening.RIGHT_OPENED)){
			return new RightOpenedInterval(minimum, maximum);
			
		}else if(opening.equals(Opening.BOTH_OPENED)){
			return new BothOpenedInterval(minimum, maximum);
			
		}else{
			return new UnOpenedInterval(minimum, maximum);
		}
	}
}
