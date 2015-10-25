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
	img.createGraphics().setColor(java.awt.Color.black);
	//g2.fillRect(0, 0, w, h);
	//g2.fillRect(0, 0+h+gap, w, h);
	System.out.println(x);

        RagNode node1 = new RagNode(0, 0, 15, 10);

        RagNode node2 = new RagNode(0, 30, 15, 10);

        RagNode node3 = new RagNode(30, 0, 15, 10);

        RagNode node4 = new RagNode(30, 30, 15, 10);

	node1.render(g2);
	node2.render(g2);
	node3.render(g2);
	node4.render(g2);
        //RagNode node2 = new RagNode();
    } // end paint()

} // END class RagDoll
