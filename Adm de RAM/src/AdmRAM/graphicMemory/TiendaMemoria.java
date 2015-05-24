package AdmRAM.graphicMemory;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TiendaMemoria extends JPanel {
	
	private JLabel memLabel;
	private JLabel algoritmoLabel;
	private JComboBox memCombo;
	private JTextField algoritmoCombo;
	private JButton okBtn;
	private JButton cancelBtn;
	private GroupLayout layout;
	

	public TiendaMemoria () {
		
		//Inicializar dimensiones y borde
		this.setPreferredSize(new Dimension(350,140));
		this.setMinimumSize(new Dimension(350, 140));
		TitledBorder tituloBorde;
		tituloBorde = BorderFactory.createTitledBorder( "Tienda de Memoria" );
		tituloBorde.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(tituloBorde);
		
		//Inicializar las variables
		memLabel = new JLabel("Cantidad de Memoria: ");
		algoritmoLabel = new JLabel("Tipo de Algoritmo: ");
		memCombo = new JComboBox();
		algoritmoCombo = new JTextField();
		okBtn = new JButton("OK");
		cancelBtn = new JButton("Cancel");
		
		memCombo.setMaximumSize(new Dimension (250,15));
		algoritmoCombo.setMaximumSize(new Dimension(250,15));
		memCombo.addItem("256");
		memCombo.addItem("512");
		memCombo.addItem("1024");
		memCombo.addItem("1500");
		memCombo.addItem("2048");
		memCombo.setEditable(true);
		memCombo.setSelectedItem("1024");
		memCombo.setToolTipText("Inserte la cantidad de Memoria RAM que desea administrar");
		
		
		//Inicializar el layout
		layout = new GroupLayout(this);
		this.setLayout(layout);
		
		//Especificar insercion automatica de espacios
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		layout.setHorizontalGroup(
			layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(memLabel)
						.addComponent(algoritmoLabel)
						.addComponent(okBtn)
						)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(memCombo)
						.addComponent(algoritmoCombo)
						.addComponent(cancelBtn)
						)
				
		);
		
		layout.setVerticalGroup(
				layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(memLabel)
							.addComponent(memCombo)
							)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(algoritmoLabel)
							.addComponent(algoritmoCombo))
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(okBtn)
							.addComponent(cancelBtn))
				);
		
		
		
		
		
		
	}
}
