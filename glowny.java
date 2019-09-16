package kalkulatorGUI;

import javax.swing.JFrame;
/**
 * Ten program przedstawia kalkulator z podstawowym interfejsem graficznym.
 * @author Julita
 * @version 1.0 2019-09-15
 * 
 */

public class glowny 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Kalkulator");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setResizable(false);
	}
}
