package def;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class kwadrat {
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kwadrat window = new kwadrat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public kwadrat() {
		initialize();
	}
	
	/**
	 * Initialize the contest of the frame.
	 */
	private void initialize() {
		MyPanel panel = new MyPanel();
		
		frame = new JFrame("Kwadrat");
		frame.getContentPane().setBackground(new Color(107,106,104));
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
	}
}

class MyPanel extends JPanel {
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(10, 10, 100, 100);
	}
}
