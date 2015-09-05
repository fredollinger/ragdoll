package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.Event.*;
 
class RagCanvas extends Canvas {

	public RagDoll doll = new RagDoll();

	public void paint(Graphics g){
	    Graphics2D g2 = (Graphics2D) g;
	    g2.fillRect(100, 100, 100, 100);
	    return;
	}

} // END class AttributeWindow
