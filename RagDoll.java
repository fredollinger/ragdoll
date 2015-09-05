package com.fredollinger;

import java.awt.*;
import java.awt.image.BufferedImage;
 
class RagDoll extends BaseDoll {

    public void RagDoll(){
        w = 50;
	h = 50;
	x = 50;
	y = 50;
    } // END RagWindow()

    public void render(BufferedImage img){
	Graphics2D g2 = img.createGraphics();
	g2.fillRect(w, h, x, y);
	System.out.println("RagDoll::paint()");
    } // end paint()

} // END class RagDoll
