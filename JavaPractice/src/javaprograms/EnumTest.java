package javaprograms;

enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY, SATURDAY;
}

public class EnumTest {
	
	Day day;

	public EnumTest(Day day) {
		this.day = day;
	}
	@SuppressWarnings("unused")
	private void dayIsLike() {
		switch (day) 
		{ 
		case MONDAY: 
			System.out.println("Mondays are bad."); 
			break; 
		case FRIDAY: 
			System.out.println("Fridays are better."); 
			break; 
		case SATURDAY: 
		case SUNDAY: 
			System.out.println("Weekends are best."); 
			break; 
		default: 
			System.out.println("Midweek days are so-so."); 
			break; 
		}
	}
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		String str ="MONDAY";
//		EnumTest e = new EnumTest(Day.valueOf(str));
//		e.dayIsLike();
		System.out.println(Day.FRIDAY.toString());
		Day days[]=Day.values();
		for (Day day :days) {
			System.out.println(day + " at index "
                    + day.ordinal());
		}
		System.out.println(Day.valueOf("FUNDAY"));
		
	}
}
