package components;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class roundedButton extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7663306845012324056L;
	
	private static String globalFont = "Comic Sans MS";
	
	private int radius;
	private Color color;
	private Color borderColor;
	private Color textColor;
    private Color hoverBackgroundColor;
    private Color pressedBackgroundColor;
    private boolean isSelectable;

    public roundedButton(String text) {
        super(text);
        super.setFocusable(false);
        isSelectable = true;
        Dimension size = new Dimension(1600, 900);
        size.width = size.height = Math.max(size.width,size.height);
        setMaximumSize(size);
        super.setContentAreaFilled(false);
        
        setFont(new Font(globalFont, Font.BOLD, 50));

        color = Color.decode("#7608db");
        textColor = Color.decode("#e1b173");
        hoverBackgroundColor = color.brighter();
    	pressedBackgroundColor = color.brighter().brighter();
    }

    @Override
    protected void paintComponent(Graphics g) {
    	if (isSelectable==true) {        		
    		if (getModel().isArmed()) {
    			g.setColor(pressedBackgroundColor);
    		} else if (getModel().isRollover()) {
    			g.setColor(hoverBackgroundColor);
    		} else {
    			g.setColor(color);
    			setForeground(textColor);
    		}
    	} else {
    		g.setColor(color);
			setForeground(textColor);
    	}
    	radius = getHeight();
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
        
        super.paintComponent(g);
    }
    
    protected void paintBorder(Graphics g) {
    	g.setColor(borderColor);
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
    
    public void setRadius(int radius) {this.radius = radius;}
    
    public void setColor(Color color) {
    	this.color = color;
    	hoverBackgroundColor = color.brighter();
    	pressedBackgroundColor = color.brighter().brighter();
    }
    public void setBorderColor(Color borderColor) {this.borderColor = borderColor;}
    public void setTextColor(Color color) {this.textColor = color;}
    
    public void setSelectable(boolean state) {this.isSelectable = state;}
    
    public boolean isSelectable() {return isSelectable;}
}
