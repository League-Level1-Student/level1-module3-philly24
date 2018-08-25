import java.util.Random;

import javax.swing.JFrame;

public class TypingTutor {
JFrame frame;
char currentLetter;

void userinter() {
	frame.setTitle("Type or Die");
	frame.setVisible(true);
	frame.pack();
 
}
char random() {
	
	currentLetter = generateRandomLetter();
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	
}
}
