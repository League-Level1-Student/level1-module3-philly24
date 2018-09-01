import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener {
	JButton button;
	JFrame frame;
	JPanel panel;
	int score = 0;
	Date start = new Date();
	public void gui(int num) {
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		button = new JButton();
		frame.setTitle("whack");

		for (int i = 0; i < 24; i++) {
			button = new JButton();	
			button.addActionListener(this);
			panel.add(button);
			if (i==num) {
				button.setText("mole!");
			}
		}
		
		frame.add(panel);
		frame.setSize(250, 300);

	}
	
	public static void main(String[] args) {
		WhackaMole ui = new WhackaMole();
		Random randy = new Random();
		ui.gui(randy.nextInt(25));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		gui(new Random().nextInt(25));
		JButton buttonPressed = (JButton) e.getSource();
	
		if (buttonPressed.getText().equals("mole!")) {
			score++;
			if (score==10) {
				endGame(start,10);
		
			}
		
		}
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
}
