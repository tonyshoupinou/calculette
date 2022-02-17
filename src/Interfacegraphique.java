import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Interfacegraphique extends Frame {
	
	// attributs
	
		// crée un nouvel objet JFrame nommé f avec le titre "Inscription"
		JFrame f = new JFrame("Calculette");
		
		//crée les boutons
		JButton un = new JButton("1");
		JButton deux = new JButton("2");
		JButton trois = new JButton("3");
		JButton quatre = new JButton("4");
		JButton cinq = new JButton("5");
		JButton six = new JButton("6");
		JButton sept = new JButton("7");
		JButton huit = new JButton("8");
		JButton neuf = new JButton("9");
		JButton zero = new JButton("0");
		JButton point = new JButton(".");
		JButton egal = new JButton("=");
		JButton init = new JButton("C");
		JButton plus = new JButton("+");
		JButton moins = new JButton("-");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
		
		//mise en place de l'icone
		ImageIcon icon = new ImageIcon("/res/icons/icon64.gif");
		
		
		// crée le text field pour afficher le résultat
		JTextField txtfldresultat = new JTextField("", 250);
			
	//constructor
				
		public Interfacegraphique() {
		
		//definition de l'icone de l'app
		f.setIconImage(icon.getImage());		
			
		// Definition en BOLD et RED pour la touche C (init)
		init.setFont(init.getFont().deriveFont(Font.BOLD, 20));
		init.setForeground(Color.RED);
		
		// definit la taille du JFrame f
		f.setSize(330, 460);
		f.setResizable(false);
		
		// Definit la visibilité du JFrame f
		f.setVisible(true);
		
		// definit le comportement de la pression sur la croix du JFrame f
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// crée un conteneur c dans le Jframe f
		Container c = f.getContentPane();
		c.setLayout(null);
		
		// cosmetique pour le  text field txtfldresultat
		txtfldresultat.setFont(txtfldresultat.getFont().deriveFont(Font.BOLD,30));
		txtfldresultat.setForeground(Color.BLACK);
		txtfldresultat.setHorizontalAlignment(JTextField.RIGHT);
//		txtfldresultat.setMaximumSize(getSize());
		
		// cosmétique pour les boutons
		Font buttonStyle = new Font("Arial", Font.BOLD, 30);
		un.setFont(buttonStyle);
        deux.setFont(buttonStyle);        
        trois.setFont(buttonStyle);		        		
        quatre.setFont(buttonStyle);
        cinq.setFont(buttonStyle);
		six.setFont(buttonStyle);
		sept.setFont(buttonStyle);	
		huit.setFont(buttonStyle);
		neuf.setFont(buttonStyle);	
		zero.setFont(buttonStyle);		
		point.setFont(buttonStyle);
		moins.setFont(buttonStyle);
		plus.setFont(buttonStyle);
		multiply.setFont(buttonStyle);				
		divide.setFont(buttonStyle);	
		egal.setFont(buttonStyle);
		
		//ajout des boutons dans le container et placement
		c.add(txtfldresultat);
		txtfldresultat.setBounds(20,20, 280, 50);

		c.add(un);
		un.setBounds(20, 100, 60, 60);

		c.add(deux);
		deux.setBounds(90, 100, 60, 60);

		c.add(trois);
		trois.setBounds(160, 100, 60, 60);

		c.add(init);
		init.setBounds(230, 100, 60, 50);
		
		c.add(quatre);
		quatre.setBounds(20, 180, 60, 60);

		c.add(cinq);
		cinq.setBounds(90, 180, 60, 60);

		c.add(six);
		six.setBounds(160, 180, 60, 60);

		c.add(plus);
		plus.setBounds(230, 160, 60, 50);

		c.add(sept);
		sept.setBounds(20, 260, 60, 60);

		c.add(huit);
		huit.setBounds(90, 260, 60, 60);

		c.add(neuf);
		neuf.setBounds(160, 260, 60, 60);

		c.add(moins);
		moins.setBounds(230, 220, 60, 50);

		c.add(zero);
		zero.setBounds(20, 340, 60, 60);

		c.add(point);
		point.setBounds(90, 340, 60, 60);

		c.add(egal);
		egal.setBounds(160, 340, 60, 60);

		c.add(multiply);
		multiply.setBounds(230, 280, 60, 50);

		c.add(divide);
		divide.setBounds(230, 340, 60, 50);


	}

		
}
