import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JButton button;
	JPanel panel;
	JFrame frame;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	public void gui() {
	frame = new JFrame();
	panel = new JPanel();
	button = new JButton();
	label1 = new JLabel();
	label2 = new JLabel();
	label3 = new JLabel();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,500);
	button.setText("SPIN");
	button.addActionListener(this);
	panel.add(button);
	frame.add(panel);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		Random rand = new Random();
		String url = "orange.jpg";
		int num1 = rand.nextInt(2);  
		ImageIcon image1 = new ImageIcon(url);
		label1.setIcon(image1);
		frame.add(label1);
		
		
		if (num1==0) {
			
		}
	}

	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine();
		slot.gui();
	}
}
