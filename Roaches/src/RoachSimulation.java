import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double startingPopulation;
		double sprayPercent;
		
		DecimalFormat decFormat = new DecimalFormat("00");
		String in = JOptionPane.showInputDialog(null, "Please enter the starting roach population: ");
		startingPopulation = Double.parseDouble(in);
		RoachPopulation bugs = new RoachPopulation(startingPopulation);
		JOptionPane.showMessageDialog(null, "The intial roach population is " + decFormat.format(startingPopulation));
		
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 1 breeding is " + decFormat.format(Math.round(bugs.getroaches())));
		in = JOptionPane.showInputDialog("Please enter spray percentage for cycle 1 ");
		sprayPercent = Double.parseDouble(in);
		bugs.spray(sprayPercent);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 1 " + decFormat.format(sprayPercent * 100) + "% spraying is " + Math.round(bugs.getroaches()));
		
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 2 breeding is " + decFormat.format(Math.round(bugs.getroaches())));
		in = JOptionPane.showInputDialog("Please enter spray percentage for cycle 2 ");
		sprayPercent = Double.parseDouble(in);
		bugs.spray(sprayPercent);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 2 " + decFormat.format(sprayPercent * 100) + "% spraying is " + Math.round(bugs.getroaches()));
		
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 3 breeding is " + decFormat.format(Math.round(bugs.getroaches())));
		in = JOptionPane.showInputDialog("Please enter spray percentage for cycle 3 ");
		sprayPercent = Double.parseDouble(in);
		bugs.spray(sprayPercent);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 3 " + decFormat.format(sprayPercent * 100) + "% spraying is " + Math.round(bugs.getroaches()));
		
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 4 breeding is " + decFormat.format(Math.round(bugs.getroaches())));
		in = JOptionPane.showInputDialog("Please enter spray percentage for cycle 4 ");
		sprayPercent = Double.parseDouble(in);
		bugs.spray(sprayPercent);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 4 " + decFormat.format(sprayPercent * 100) + "% spraying is " + Math.round(bugs.getroaches()));	
	
	}

}
