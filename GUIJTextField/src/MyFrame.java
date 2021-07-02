import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener
{
	JButton button;
	JTextField Textfield;
	MyFrame (){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
	    button = new JButton("Submit");
		button.addActionListener(this);
		
	    Textfield = new JTextField();
		Textfield.setPreferredSize(new Dimension(250,40));
		Textfield.setFont(new Font("Consolas",Font.PLAIN,35));
		Textfield.setForeground(new Color(0x00FF00)); 
		Textfield.setBackground(Color.BLACK);
		Textfield.setCaretColor(Color.WHITE);
		Textfield.setText("Username");
		
		
		
		
		this.add(button);
		this.add(Textfield);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button) {
			System.out.println("Welcome "+ Textfield.getText());
			button.setEnabled(false);
			Textfield.setEditable(false);
		}
		
	}

}
