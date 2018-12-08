package budgetPackage;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Login extends Popup{

	protected JTextField inputField; //This field is where commands are entered
    protected JTextArea textArea; 
    protected JButton inputButton;
	
	@Override
	public void setContents() {
		inputField = new JTextField(20);
		inputField.addKeyListener(new KeyListener(){
		    public void keyPressed(KeyEvent e){
		        if(e.getKeyCode() == KeyEvent.VK_ENTER){
		        	String text = inputField.getText();
					if (text != ""){
						processName(text);
					}
		        }
		    }
		    @Override
		    public void keyTyped(KeyEvent e) {
		    }
		    @Override
		    public void keyReleased(KeyEvent e) {
		    }
		});
		setLayout(inputField,0,1);
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("Enter a username please");
		setLayout(textArea,0,0);
		inputButton = new JButton();
		inputButton.setText("Enter");
		setLayout(inputButton,0,2);
		inputButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = inputField.getText();
				if (text != ""){
					processName(text);
				}
			}
		});
	}

	public Dimension objectSize() {
		return new Dimension (300,180);
	}

	public void frameAbort() {
		System.out.println("Proper closing sequence");
		System.exit(1);
	}
	
	private void setLayout(Component c, int x, int y) {
		GridXY(x,y);
		WeightXY(1,1);
		gbc.fill = GridBagConstraints.BOTH;
		c.setFont(new Font("Ariel",Font.PLAIN, 20));
		this.add(c,gbc);
	}
	
	private void processName(String enteredName) {
		System.out.println("Processing: " + enteredName);
	}
	
	
}
