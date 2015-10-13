package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.Color.*;
import java.awt.Event.*;
import java.awt.image.BufferedImage;
 
class RagCanvas extends Canvas {

     public RagDoll doll = new RagDoll();

     public void paint(Graphics g){
	BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_BYTE_INDEXED);
	//image.createGraphics().setColor(getForekground());
	image.createGraphics().fillRect(0,0,100,100);
        doll.render(image);
	g.drawImage(image, 100, 100, null);
	System.out.println("RagCanvas::paint()");
        return;
     } // end paint()

} // END class RagCanvas
