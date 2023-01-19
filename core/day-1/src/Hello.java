
public class Hello {

	public static void main(String[] args) {
		
		//doday date i want to find out next date
		int daysInMonths[]= 
			{-1,31,28,31,30,31,30,31,31 ,30,31,30,31 };
		
		
		int day=28;
		int month=2;
		int year=2001;
		if(isLeapYear(year)) {
			daysInMonths[2]=29;
			
		}
		System.out.println("current date: "+ day+": "+ month+ ": "+ year);
		
		day=day+1;
		if(daysInMonths[month]<day) {
			day=1;
			month++;
			if(month>12) {
				month=1;
				year++;
			}
		}
		

		System.out.println("next date: "+ day+": "+ month+ ": "+ year);
			
		
		
	}
	
	public static boolean isLeapYear(int year) {
		 return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
}
