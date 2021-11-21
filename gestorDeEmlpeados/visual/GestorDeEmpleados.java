package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;

public class GestorDeEmpleados extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldCodigo;
	private JTextField textFieldNombre;
	private JTextField textFieldlocalidad;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestorDeEmpleados dialog = new GestorDeEmpleados();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestorDeEmpleados() {
		setTitle("Gestor de Empleados");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel panelDepartamentos = new JPanel();
		panelDepartamentos.setBounds(10, 11, 414, 99);
		panelDepartamentos.setToolTipText("Departamentos");
		panelDepartamentos.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Departamentos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 118, 414, 99);
		contentPanel.setLayout(null);
		panelDepartamentos.setLayout(null);
		contentPanel.add(panelDepartamentos);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setBounds(10, 21, 46, 14);
		panelDepartamentos.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 46, 46, 14);
		panelDepartamentos.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Localidad:");
		lblNewLabel_2.setBounds(10, 71, 50, 14);
		panelDepartamentos.add(lblNewLabel_2);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(66, 18, 86, 20);
		panelDepartamentos.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(66, 43, 180, 20);
		panelDepartamentos.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldlocalidad = new JTextField();
		textFieldlocalidad.setBounds(66, 68, 180, 20);
		panelDepartamentos.add(textFieldlocalidad);
		textFieldlocalidad.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(315, 68, 89, 23);
		panelDepartamentos.add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(315, 43, 89, 23);
		panelDepartamentos.add(btnModificar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(315, 18, 89, 23);
		panelDepartamentos.add(btnNuevo);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(413, 98, -409, -94);
		panel_1.add(table);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
