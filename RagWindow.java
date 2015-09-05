package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.Event.*;
 
class RagWindow extends JFrame {
    public RagWindow(){
	RagCanvas canvas = new RagCanvas();
	canvas.setBackground(Color.orange);
	JFrame frame = new JFrame( "Hello, Java" );
	frame.add(canvas);
	frame.setSize( 600, 400 );
	frame.setVisible( true );
    } // END RagWindow()
} // END class RagWindow
