package py.edu.facitec.pantallasecundarios;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class FormProveedor extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormProveedor dialog = new FormProveedor();
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
	public FormProveedor() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 229, 434, 33);
		getContentPane().add(panel);
		
		JButton btnGuardar = new JButton("Guardar");
		panel.add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		panel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panel.add(btnEliminar);
		
		JButton btnCerrar = new JButton("Cerrar");
		panel.add(btnCerrar);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(23, 18, 46, 14);
		getContentPane().add(lblCodigo);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(23, 63, 76, 20);
		getContentPane().add(lblDireccin);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setBounds(23, 114, 46, 14);
		getContentPane().add(lblCiudad);
		
		JCheckBox chckbxActivo = new JCheckBox("Activo");
		chckbxActivo.setBounds(88, 200, 97, 23);
		getContentPane().add(chckbxActivo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Saltos del Guaira", "Curuguaty", "Ciudad del Este", "Catuete"}));
		comboBox.setBounds(68, 111, 117, 20);
		getContentPane().add(comboBox);
		
		JLabel lblGe = new JLabel("Genero:");
		lblGe.setBounds(23, 159, 46, 14);
		getContentPane().add(lblGe);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(23, 204, 46, 14);
		getContentPane().add(lblEstado);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(210, 14, 89, 23);
		getContentPane().add(btnBuscar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(313, 14, 89, 23);
		getContentPane().add(btnNuevo);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(88, 155, 109, 23);
		getContentPane().add(rdbtnFemenino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(210, 155, 109, 23);
		getContentPane().add(rdbtnMasculino);
		
		textField = new JTextField();
		textField.setBounds(68, 15, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(351, 61, -279, 41);
		getContentPane().add(textArea);

	}
}
