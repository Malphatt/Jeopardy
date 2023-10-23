package components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class roundedTextBox extends JTextField {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1652957513075882136L;

	private static String globalFont = "Comic Sans MS";
	
	private int radius;
	private Color color;
	private Color borderColor;
	private Color textColor;
	private int inset;
    
    private boolean textFieldSuggestion = false;
    private List<String> items;
	
	public roundedTextBox() {
		setOpaque(false);
        setHorizontalAlignment(SwingConstants.CENTER);
        
        color = Color.decode("#e1b173");
        textColor = Color.decode("#38075d");
        inset = 50; 
        radius = getHeight();
	}
	
	public roundedTextBox(String text) {
		super(text);
		setOpaque(false);
        setHorizontalAlignment(SwingConstants.CENTER);
        
        color = Color.decode("#e1b173");
        textColor = Color.decode("#38075d");
        inset = 50; 
        radius = getHeight();
	}
	
	public roundedTextBox(boolean textFieldSuggestion) {
		this.textFieldSuggestion = textFieldSuggestion;
		clearAutocompleteItems();

		setOpaque(false);
        setHorizontalAlignment(SwingConstants.CENTER);
        
        color = Color.decode("#e1b173");
        textColor = Color.decode("#38075d");
        inset = 50; 
        radius = getHeight();
	}
	
	protected void paintComponent(Graphics g) {
        g.setColor(color);
        setForeground(textColor);
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
        
        setMargin(new Insets(0, inset, 0, inset));
        setFont(new Font(globalFont, Font.BOLD, 20));

        super.paintComponent(g);
    }
	
    protected void paintBorder(Graphics g) {
    	radius = getHeight();
        g.setColor(borderColor);
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, radius, radius);
    }
    
   public void setColor(Color color) {this.color = color;}
   public void setBorderColor(Color borderColor) {this.borderColor = borderColor;}
   public void setTextColor(Color color) {this.textColor = color;}
   public void setInset(int inset) {this.inset = inset;}
   
   public void setAutocompleteItems(ArrayList<String> items) {
	   this.items = items;
	   
		AutoCompleteDecorator.decorate(this, this.items, false);
   }
   
   public void clearAutocompleteItems() {this.items = new ArrayList<String>();}
}
