package py.edu.facitec.pantallasecundarios;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class FormCliente extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente dialog = new FormCliente();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public FormCliente() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblCcc = new JLabel("Cliente");
		lblCcc.setBounds(172, 12, 70, 15);
		getContentPane().add(lblCcc);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(12, 91, 70, 15);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(12, 57, 70, 15);
		getContentPane().add(lblApellido);
		
		JLabel lblCdulaN = new JLabel("C.I. Nº:");
		lblCdulaN.setBounds(12, 130, 58, 15);
		getContentPane().add(lblCdulaN);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(12, 225, 58, 15);
		getContentPane().add(lblEstado);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(12, 185, 58, 15);
		getContentPane().add(lblSexo);
		
		textField = new JTextField();
		textField.setBounds(152, 55, 114, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 89, 114, 19);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 128, 114, 19);
		getContentPane().add(textField_2);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setBounds(117, 181, 49, 23);
		getContentPane().add(rdbtnM);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setBounds(164, 181, 149, 23);
		getContentPane().add(rdbtnF);
		
		JCheckBox chckbxActivo = new JCheckBox("Activo");
		chckbxActivo.setBounds(117, 221, 70, 23);
		getContentPane().add(chckbxActivo);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(210, 237, 70, 25);
		getContentPane().add(btnSave);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(287, 237, 79, 25);
		getContentPane().add(btnEdit);

	}
}
