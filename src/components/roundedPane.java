package components;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class roundedPane extends JButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1455347876190768258L;

	private static String globalFont = "Comic Sans MS";
	
	private int radius;
	private Color color;
	private Color textColor;

    public roundedPane(String text) {
        super(text);
        super.setFocusable(false);
        Dimension size = new Dimension(1600, 900);
        size.width = size.height = Math.max(size.width,size.height);
        setMaximumSize(size);
        super.setContentAreaFilled(false);
        
        setFont(new Font(globalFont, Font.BOLD, 42));

        color = Color.decode("#e1b173");
        textColor = Color.decode("#38075d");
    }

    @Override
    protected void paintComponent(Graphics g) {
		g.setColor(color);
		setForeground(textColor);
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
        
        super.paintComponent(g);
    }
    
    protected void paintBorder(Graphics g) {
    	g.setColor(color);
    	g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
    }
    
    Shape shape;
    public boolean contains(int x, int y) {
    	if (shape == null || 
                !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, radius, radius);
        }
        return shape.contains(x, y);
    }

    public void setContentAreaFilled(boolean b) {
    }
    
    public void setRadius(int radius) {
    	this.radius = radius;
    }
    
    public void setColor(Color color) {
    	this.color = color;
    }
    
    public void setTextColor(Color color) {
    	this.textColor = color;
    }
}