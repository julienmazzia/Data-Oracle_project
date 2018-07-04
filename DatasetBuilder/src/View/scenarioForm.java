package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class scenarioForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scenarioForm frame = new scenarioForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public scenarioForm() {
		setTitle("JTable basique dans un JScrollPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Object[][] donnees = {};
 
        String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme", "Sport"};
 
        JTable tableau = new JTable(donnees, entetes);
 
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
 
        pack();
	}

}
