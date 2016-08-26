package py.edu.facitec.containers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import py.edu.facitec.pantallasecundarios.FormCliente;
import py.edu.facitec.pantallasecundarios.FormProveedor;
import py.edu.facitec.pantallasecundarios.FormUsuarios;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//means to kill the process after close
		getContentPane().setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);//maximiza la pantalla
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenu mnHerramientas = new JMenu("Herramientas");
		menuBar.add(mnHerramientas);
		
		JMenu mnFormas = new JMenu("Formulario");
		menuBar.add(mnFormas);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verFormCliente();
			}
		});
		mnFormas.add(mntmClientes);
		
		JMenuItem mntmProveedores = new JMenuItem("Proveedores");
		mntmProveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verFormProveedor();
			}
		});
		
		JMenuItem mntmUsuarios = new JMenuItem("Usuarios");
		mntmUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verFormUsuarios();
			}
		});
		mnFormas.add(mntmUsuarios);
		mnFormas.add(mntmProveedores);
		
		JMenu mnOpciones = new JMenu("Opciones");
		mnFormas.add(mnOpciones);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mnOpciones.add(mntmBuscar);

	}
		private void verFormProveedor() {
			FormProveedor formProveedor = new FormProveedor();
			formProveedor.setVisible(true);

	}
		private void verFormCliente(){
			FormCliente formCliente = new FormCliente();
			formCliente.setVisible(true);
		}
		private void verFormUsuarios(){
			FormUsuarios formUsuarios = new FormUsuarios();
			formUsuarios.setVisible(true);
		}
}