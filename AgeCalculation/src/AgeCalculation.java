import javax.swing.JOptionPane;

public class AgeCalculation {

	public static void main(String[] args) {
		
		String birthday = JOptionPane.showInputDialog(null, "Enter your birthday (MM/DD/YYYY): ");
			
		String subYearBirthday= birthday.substring(6,10);
		String subDayBirthday = birthday.substring(3,5);
		String subMonthBirthday = birthday.substring(0,2);
		
		String todaysDate = JOptionPane.showInputDialog(null, "Enter today's date (MM/DD/YYYY): ");
		
		String subYearTodaysDate = todaysDate.substring(6,10);
		String subDayTodaysDate = todaysDate.substring(3,5);
		String subMonthTodaysDate = todaysDate.substring(0,2);
		
		
		int intYearBirthday = Integer.parseInt(subYearBirthday);
		int intMonthBirthday = Integer.parseInt(subMonthBirthday);
		int intDayBirthday = Integer.parseInt(subDayBirthday);
		
		int intYearTodaysDate = Integer.parseInt(subYearTodaysDate);
		int intMonthTodaysDate = Integer.parseInt(subMonthTodaysDate);
		int intDayTodaysDate = Integer.parseInt(subDayTodaysDate);
		
		int systemYear = intYearTodaysDate - intYearBirthday;
		int systemMonth = intMonthTodaysDate - intMonthBirthday;
			
		if(intMonthTodaysDate <= intMonthBirthday)
		{
			systemYear = systemYear - 1;
		}
		if(intDayTodaysDate < intDayBirthday)
		{
			systemMonth = systemMonth - 1;
		}
	
		JOptionPane.showMessageDialog(null, "You are " + systemYear + " and " + systemMonth + " months old");
		
	}

}
