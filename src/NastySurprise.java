import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
JButton trick;
JButton treat;
JFrame frame;
JPanel panel;
void userInter(){
	trick = new JButton();
	treat = new JButton();
	panel = new JPanel();
	frame = new JFrame();
	trick.setText("trick");
	treat.setText("treat");
	trick.addActionListener(this);
	treat.addActionListener(this);
	panel.add(trick);
	panel.add(treat);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed==trick) {
		showPictureFromTheInternet("https://pbs.twimg.com/profile_images/446566229210181632/2IeTff-V_400x400.jpeg");
	}
	else {
	showPictureFromTheInternet("https://m.media-amazon.com/images/M/MV5BYmU4MmY1YjgtZmQ0Ny00ZGExLTk4ZDEtYzNjZjhhNTY5Y2NjXkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_CR0,45,480,270_AL_UX477_CR0,0,477,268_AL_.jpg")
	;}
}
}
