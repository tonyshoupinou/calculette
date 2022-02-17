import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.LinkedList;

import javax.swing.AbstractButton;
import javax.swing.Icon;

public class Calculette {
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		//mise en place de l'interface graphique
		Interfacegraphique calculette = new Interfacegraphique();
				
		// test swing
//		Swing1 test = new Swing1();

		// initialisation du listener
		ActionListener clic = new ActionListener() {
			String createdNumber = "";
			LinkedList<String> operands = new LinkedList<>();
			LinkedList<String> operators = new LinkedList<>();
			
			@Override
			public void actionPerformed(ActionEvent e) {			

		//creation du switch qui va controler toutes les actions en fonction des pression sur les boutons
				
				//verification de la "valeur" de la touche en effectuant un compareTo
				switch ((((AbstractButton) e.getSource()).getText()).compareTo("=")){
				
				// cas de l'addition
				case -18 -> {
						// une pression sur "+", stocke le nombre createdNumber dans ine linked List 'operands'
						operands.add(createdNumber);
						// on ajoute aussi le signe '+' sous forme de string dans une linked list 'operator'
						operators.add("+");
						// on vérifie ensuite si le nombre entré est le premier opérande et dans ce cas, on ne fait rien 
						if (operands.size() <= 1) {
						// si il y a déja 2 opérandes (donc que operands.size > 1)	
						} else 	{
						//on calcul le resultat des opérandes entrés	
							createdNumber = calculate(operands.getFirst(), operands.getLast(), operators.getFirst());
						// puis on supprime les données consommées 	
							operands.clear();
							operators.removeFirst();
						// mais on garde le resultat comme opérande pour la suite des calculs
							operands.add(createdNumber);

								}
						// affichage du calcul temporaire stocké en tant qu'operande 1 ou du seul opérande disponible et reinitialisation de la string createdNumber pour receboir le prochain nombre.
						calculette.txtfldresultat.setText(operands.getLast());			
						createdNumber = "";
				}
					
				// cas de lq soustraction	(voir comment sur 'cas de l'addition')
				case -16 -> {
					operands.add(createdNumber);
					operators.add("-");		
					if (operands.size() <= 1) {
					} else 	{
						createdNumber = calculate(operands.getFirst(), operands.getLast(), operators.getFirst());
						operands.clear();
						operators.removeFirst();
						operands.add(createdNumber);

							}
					calculette.txtfldresultat.setText(operands.getLast());			
					createdNumber = "";
				}
					
				// cas de la division		(voir comment sur 'cas de l'addition')
				case -14 -> {
					operands.add(createdNumber);
					operators.add("/");		
					if (operands.size() <= 1) {
					} else 	{
						createdNumber = calculate(operands.getFirst(), operands.getLast(), operators.getFirst());
						operands.clear();
						operators.removeFirst();
						operands.add(createdNumber);

							}
					calculette.txtfldresultat.setText(operands.getLast());			
					createdNumber = "";
				}
					
				// cas de la multiplication		(voir comment sur 'cas de l'addition')
				case -19 -> {
					operands.add(createdNumber);
					operators.add("*");		
					if (operands.size() <= 1) {
					} else 	{
						createdNumber = calculate(operands.getFirst(), operands.getLast(), operators.getFirst());
						operands.clear();
						operators.removeFirst();
						operands.add(createdNumber);
					}
					calculette.txtfldresultat.setText(operands.getLast());			
					createdNumber = "";
				}
					
					
//				cas de l'initialisation	
				case 6 -> {
					// on vite toute les linked list et la String de concatenation des nombres
					// et on vide le text field d'affichage.
					operands.clear();
					operators.clear();
					createdNumber = "";
					calculette.txtfldresultat.setText("");
				}
//				
				// cas du résultat
				case 0 -> {
					// le resultat ets similaire aux autres opérations mais n'introduit pas de nouveau operateur.
					operands.add(createdNumber);		
					//si on presse le '=' avanbt d'aviir rentré un deuxième operande, on laisse l'affichage sur le premier opérande rentré
					if (operands.size() <= 1) {
						calculette.txtfldresultat.setText(operands.getFirst());

					// on effectue le dernier calcul en prenant les deux opérandes disponibles dans la linked list operands et l'operateur disponible dans 
					// la linked list opérator
					} else {
						createdNumber = calculate(operands.getFirst(), operands.getLast(), operators.getFirst());
					// On clean les lists 
						operands.clear();
						operators.removeFirst();
						// on affiche le résultat dans le text field
						calculette.txtfldresultat.setText(createdNumber);	
					}
					createdNumber = "";
				}
				
				// cas pour les entrées de chiffres et de décimal
				default -> {
					// on concatene une string avec les entrées des boutons de chiffres et la décimale
					createdNumber = createdNumber + ((AbstractButton) e.getSource()).getText();
					// on affiche a chaque fois l'entrée en plus des précédents, donc le createdNumber 
					calculette.txtfldresultat.setText(createdNumber);
					}
				}
			
			}
			
			public String calculate(String operand1, String operand2, String operator) {
				Double result = 0.0;
				Double A = Double.parseDouble(operand1);
				Double B = 0.0;
				if (operand2 != "") {
					B = Double.parseDouble(operand2);}
		
				Integer a = operator.compareTo("a");
				switch (a) {
				// ADDITION
				case (-54) -> result = A + B;
				//SOUSTRACTION
				case (-52) -> result = A - B;
				// DIVISION	
				case (-50) -> result = A / B;
				// MULTIPLICATION
				case (-55) -> result = A * B;
				}
				return result.toString();
			}
			
		};
		
		
		
		calculette.un.addActionListener(clic);
		calculette.deux.addActionListener(clic);
		calculette.trois.addActionListener(clic);
		calculette.quatre.addActionListener(clic);
		calculette.cinq.addActionListener(clic);
		calculette.six.addActionListener(clic);
		calculette.sept.addActionListener(clic);
		calculette.huit.addActionListener(clic);
		calculette.neuf.addActionListener(clic);
		calculette.zero.addActionListener(clic);
		calculette.plus.addActionListener(clic);
		calculette.moins.addActionListener(clic);
		calculette.multiply.addActionListener(clic);
		calculette.divide.addActionListener(clic);
		calculette.init.addActionListener(clic);
		calculette.egal.addActionListener(clic);
		calculette.point.addActionListener(clic);
	}
}
