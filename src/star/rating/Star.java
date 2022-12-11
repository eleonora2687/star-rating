/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package star.rating;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

/**
 *
 * @author eleon
 */
public class Star extends JButton{
    
    public Star()
    {
        setContentAreaFilled(false);
        setCursor(new  Cursor(Cursor.HAND_CURSOR));
        setBackground(new Color(200, 200, 200));
        setForeground(Color.yellow);
    
    }
    @Override
    public void paint(Graphics graphics)
    {
        super.paint(graphics);
        Graphics2D graphics2D=(Graphics2D) graphics.create();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
        int width=getWidth();
        int height=getHeight();
        
        int size=Math.min(width, height)/2;
        int x=width/2;
        int y=height/2;
        Star2D star2D=new Star2D(x, y, size/2, size, 5);
        graphics2D.setColor(getBackground());
        graphics2D.fill(star2D);
        if(isSelected())
        {
            graphics2D.setColor(getForeground());
            graphics2D.fill(star2D);
        }
        graphics2D.dispose();
        
        
        
    }
    
    
}
