import java.awt.Font;

import javax.swing.JButton;

public class MyJButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4106443576708152444L;
	//attributs
	String buttonName;
	    MyJButton(String buttonName) {
	    	super();
	    	this.buttonName = buttonName;
	        setFont(new Font("Arial", Font.BOLD, 30));
	   }
	}
