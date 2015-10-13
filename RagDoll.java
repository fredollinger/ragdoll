package com.fredollinger;

import java.awt.*;
import java.awt.Color.*;
import java.awt.image.BufferedImage;
 
class RagDoll extends BaseDoll {

    public RagDoll(){
        w = 15;
	h = 10;
	x = 10;
	y = 10;
	gap = 20;
    } // END RagWindow()

    public void render(BufferedImage img){
	Graphics2D g2 = img.createGraphics();
	//image.createGraphics().setColor(Color.Black);
	g2.fillRect(0, 0, w, h);
	g2.fillRect(0, 0+h+gap, w, h);
	System.out.println(x);
    } // end paint()

} // END class RagDoll
