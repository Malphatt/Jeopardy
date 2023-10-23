package components;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class modelPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7819654433507499605L;
	private int radius;
	private Color panelColor;
	private Color borderColor;
	
	public modelPanel() {
		radius = 0;
		panelColor = Color.decode("#38075d");
		super.setOpaque(false);
		super.setBorder(null);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//Draws the rounded opaque panel with borders.
		g.setColor(panelColor);
		g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);//paint background
		g.setColor(borderColor);
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);//paint border
	}
	
	public void setColor(Color panelColor) {
		this.panelColor = panelColor;
		this.borderColor = panelColor;
	}
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}
	public Color getColor() {
		return panelColor;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
