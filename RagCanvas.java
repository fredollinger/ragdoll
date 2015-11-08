package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.Color.*;
import java.awt.Event.*;
import java.awt.image.BufferedImage;
 
class RagCanvas extends Canvas {

     public RagDoll doll = new RagDoll();

     public void paint(Graphics g1){
	BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_BYTE_INDEXED);

/*
	Graphics g = image.getGraphics();
	if( g instanceof Graphics2D ){
        	Graphics2D g2d = (Graphics2D) g;
        	// make sure the background is filled with transparent pixels when cleared !
        	g2d.setBackground(new Color(0,0,0,0));
        	g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_IN, 0.0f));
        }
*/

	//image.createGraphics().setColor(getForekground());
	//image.createGraphics().fillRect(0,0,100,100);
        doll.render(image);
	g1.drawImage(image, 100, 100, null);
	//System.out.println("RagCanvas::paint()");
        return;
     } // end paint()

} // END class RagCanvas
