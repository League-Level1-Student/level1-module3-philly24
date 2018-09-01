import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame;
	char currentLetter;
	JLabel label;
	JPanel panel;
	void userinter() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		
		currentLetter = generateRandomLetter();
		label = new JLabel();
		label.setVisible(true);
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel = new JPanel();
		frame.add(panel);
		frame.add(label);
		frame.addKeyListener(this);
		frame.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you type: " + e.getKeyChar());
		if (e.getKeyChar()==currentLetter) {
			System.out.println("correct");
			panel.setBackground(Color.GREEN);
			
		}
		else {
			panel.setBackground(Color.RED);
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		;
		

	
	
	
	}

	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.userinter();
		tutor.generateRandomLetter();
	}
}