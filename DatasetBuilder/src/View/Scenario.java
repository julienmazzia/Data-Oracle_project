package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;

import java.awt.CardLayout;

import javax.swing.BoxLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controller.OracleController;

public class Scenario extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox;
	private Object[][] data = {};
	private JTextField textField;
	private OracleController ctrl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scenario frame = new Scenario();
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
	public Scenario() {

	    //Les titres des colonnes
	    String  title[] = {"Index", "Pays", "Date de la commande", "Date de réception especté", "Date expédition"};
	    String[] typeValue = {"standard", "aléatoire", "critique"};
		
		this.setSize(800, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 270, 800, 200);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JTable tab = new JTable(this.data, title);
		
		JScrollPane tableContainer = new JScrollPane(tab);
		panel.add(tableContainer);
		this.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 34, 788, 192);
		contentPane.add(panel_1);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNombreDeCommandes = new JLabel("Nombre de commandes :");
		panel_1.add(lblNombreDeCommandes, "2, 2, left, default");
		
		textField = new JTextField();
		panel_1.add(textField, "4, 2, left, default");
		textField.setColumns(10);
		
		JLabel lblTypeDeGnration_2 = new JLabel("Type de génération des commandes :");
		panel_1.add(lblTypeDeGnration_2, "2, 6, left, default");
		
		comboBox_1 = new JComboBox(typeValue);
		panel_1.add(comboBox_1, "4, 6, left, default");
		
		JLabel lblTypeDeGnration = new JLabel("Type de génration du stock de bonbon :\n");
		panel_1.add(lblTypeDeGnration, "2, 10");
		
		comboBox_2 = new JComboBox(typeValue);
		panel_1.add(comboBox_2, "4, 10, left, default");
		
		JLabel lblTypeDeGnration_1 = new JLabel("Type de génération du stock de composant :");
		panel_1.add(lblTypeDeGnration_1, "2, 14, right, default");
		
		comboBox = new JComboBox(typeValue);
		panel_1.add(comboBox, "4, 14, left, default");
		
		JLabel lblRemplissezLeFormulaire = new JLabel("Remplissez le formulaire pour créer un scénario");
		lblRemplissezLeFormulaire.setBounds(6, 6, 340, 16);
		contentPane.add(lblRemplissezLeFormulaire);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 231, 788, 34);
		contentPane.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{464, 90, 112, 96, 0};
		gbl_panel_2.rowHeights = new int[]{29, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		GridBagConstraints gbc_btnAjouter = new GridBagConstraints();
		gbc_btnAjouter.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAjouter.insets = new Insets(0, 0, 0, 5);
		gbc_btnAjouter.gridx = 1;
		gbc_btnAjouter.gridy = 0;
		panel_2.add(btnAjouter, gbc_btnAjouter);
		
		JButton btnEnlever = new JButton("Supprimer\n");
		btnEnlever.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		GridBagConstraints gbc_btnEnlever = new GridBagConstraints();
		gbc_btnEnlever.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEnlever.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnlever.gridx = 2;
		gbc_btnEnlever.gridy = 0;
		panel_2.add(btnEnlever, gbc_btnEnlever);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		GridBagConstraints gbc_btnModifier = new GridBagConstraints();
		gbc_btnModifier.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnModifier.gridx = 3;
		gbc_btnModifier.gridy = 0;
		panel_2.add(btnModifier, gbc_btnModifier);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 520, 794, 34);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] scenarioData = {textField.getText(), comboBox_1.toString(), comboBox_2.toString(), comboBox.getSelectedItem().toString()};
				ctrl = new OracleController(scenarioData, data);
			}
		});
		btnValider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_3.add(btnValider, BorderLayout.EAST);
		
		/*
		
		this.getContentPane().add(tab, BorderLayout.CENTER);*/
	}
}
