import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JPanel panel;
	JButton joke;
	JButton punchline;
	JFrame frame;
	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();
	}
	public void makeButtons(){
		frame = new JFrame();
		panel = new JPanel();
		joke = new JButton();
		joke.setText("joke");
		punchline = new JButton();
		punchline.setText("punchline");
		joke.addActionListener(this);
		punchline.addActionListener(this);
		panel.add(joke);
		panel.add(punchline);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setTitle("ChuckleClicker");
		frame.setVisible(true);
		frame.pack();

	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed==joke) {
			JOptionPane.showMessageDialog(null,"guess what, chicken butt");
		}
		else {
			JOptionPane.showMessageDialog(null,"sooooooooooooooooooooooo" );
		}
	}
}
