package deloittecore;

public class CommandLineDaysOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first 3 caharacters of the month in Upper Case.");
		String str=args[0];
		switch(str){
		case "FEB":
		System.out.println("Number of days in "+str+"=28");
		break;
		case "JAN":
		case "MAR":
		case "MAY":
		case "JUL":
		case "AUG":
		case "OCT":
		case "DEC":
		System.out.println("Number of days in "+str+"=31");
		break;
		case "APR":
		case "JUN":
		case "SEP":
		case "NOV":
		System.out.println("Number of days in "+str+"=30");
		break;
		default:System.out.println("INVALID MONTH");
		break;
			
		}
		

	}

}
