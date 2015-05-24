package AdmRAM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import AdmRAM.graphicMemory.TiendaMemoria;

public class GMemory extends JFrame{
	
	private TiendaMemoria panel1;
	
	/**
	 * Ventana para visualizar la memoria RAM
	 */
	public GMemory(){
		super("Tienda de Memoria");
		this.setSize(350, 170);
		this.setResizable(false);
		 panel1 = new TiendaMemoria();
		add(panel1);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public class VisualMem extends JPanel{
		
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.darkGray);
		g.drawRect(10, 10, 240, 100);
	}
	}
	
}
