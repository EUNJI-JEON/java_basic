package jump2java;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = 8;
		String monthString = "";
		switch(month) {
		case 1: monthString = "Jan";
		break;
		
				
		case 2: monthString = "Feb";
		break;
		
		case 3: monthString = "Mar";
		break;
		
		case 4: monthString = "Apr";
		break;
		
		case 5: monthString = "May";
		break;
		
		case 6: monthString = "Jun";
		break;
		
		case 7: monthString = "July";
		break;
		
		case 8: monthString = "Aug";
		break;
		
		case 9: monthString = "Sep";
		break;
		
		default: monthString = "Invalid month";
		break;
		
		}
		
		System.out.println(monthString);
	}
}
