import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator implements ActionListener{
	JButton add;
	JButton sub;
	JButton mult;
	JFrame frame;
	JPanel panel;
	JTextField text1;
	JTextField text2;
	JLabel label;
	void userinter() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,600);
		add = new JButton();
		add.setText("add");
		add.addActionListener(this);
		sub = new JButton();
		sub.setText("sub");
		sub.addActionListener(this);
		mult = new JButton();
		mult.setText("mult");
		mult.addActionListener(this);
		text1 = new JTextField();
		text2 = new JTextField();
		Dimension size1 = new Dimension(200,20);
		Dimension size2 = new Dimension(200,20);
		text1.setPreferredSize(size1);
		text2.setPreferredSize(size2);
		label = new JLabel(); 
		label.setVisible(true);
		panel = new JPanel();
		panel.add(text1 );
		panel.add(text2);
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(label);
		frame.add(panel);
		 
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == add) {
			label.setText(Add()+"");
		}
		else if (buttonPressed == sub) {
			label.setText(Sub()+"");
		} else {
			label.setText(Mult()+"");
		}

	}
int Add() {
	int text11 = Integer.parseInt(text1.getText());
	int text22 = Integer.parseInt(text2.getText()); 
	return text11 + text22;
}
int Sub() {
	int text11 = Integer.parseInt(text1.getText());
	int text22 = Integer.parseInt(text2.getText()); 
	return text11 - text22;
}
int Mult() {
	int text11 = Integer.parseInt(text1.getText());
	int text22 = Integer.parseInt(text2.getText()); 
	return text11 * text22;
}
}
