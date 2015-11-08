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
	//Color c = new Color(255,0,0,255);

        g2.setBackground(new Color(0,0,0,0));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_IN, 0.0f));
	//`g2.clearRect();
	g2.clearRect(0, 0, w, h);

        //RagNode head = new RagNode(0, 30, 15, 10);
	//head.render(g2);
        //g2.setBackground(c);
	//g2.fillRect(0, 0, w, h);
	//img.createGraphics().setColor(java.awt.Color.black);
	//g2.fillRect(0, 0+h+gap, w, h);
	//System.out.println(x);
        //RagNode node1 = new RagNode(0, 0, 15, 10);

/*
        RagNode chest = new RagNode(30, 0, 15, 10);

        RagNode lshoulder = new RagNode(30, 30, 15, 10);
        RagNode lelbow = new RagNode(30, 60, 15, 10);
        RagNode lhand = new RagNode(30, 90, 15, 10);

        RagNode rshoulder = new RagNode(90, 30, 15, 10);
        RagNode relbow = new RagNode(90, 60, 15, 10);
        RagNode rhand = new RagNode(90, 90, 15, 10);

	chest.render(g2);
	lshoulder.render(g2);
	lelbow.render(g2);
	lhand.render(g2);

	rshoulder.render(g2);
	relbow.render(g2);
	rhand.render(g2);
*/

        //RagNode node2 = new RagNode();
    } // end paint()

} // END class RagDoll
