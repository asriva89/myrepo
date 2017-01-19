package Tempractice;



public class EnumTest {
	
	public enum Day {
		SUNDAY,	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
	
	Day day;
	public EnumTest(Day day)
	 {
		this.day=day;
	 }
	 
	 public void tellItLikeItIs() {
	        switch (day) {
	            case MONDAY:
	                System.out.println("Mondays are bad.");
	                break;
	                    
	            case FRIDAY:
	                System.out.println("Fridays are better.");
	                break;
	                         
	            case SATURDAY: case SUNDAY:
	                System.out.println("Weekends are best.");
	                break;
	                        
	            default:
	                System.out.println("Midweek days are so-so.");
	                break;
	        }
	    }
	 
	
	public static void main(String[] args) {
		
		EnumTest t= new EnumTest(Day.MONDAY);
		t.tellItLikeItIs();
		// TODO Auto-generated method stub

	}

}