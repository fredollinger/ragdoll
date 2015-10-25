package com.fredollinger;

import java.awt.Graphics2D;
 
class RagNode extends Object {
    public int x, y;
    protected int w, h;

    public RagNode(int ix, int iy, int iw, int ih){
        x = ix;
        y = iy;
        w = iw;
        h = ih;
    }

    public void render( Graphics2D g2 ){
	g2.fillRect(x, y, w, h);
	//g2.fillRect(0, 0+h+gap, w, h);
    }

    public int getHeight(){
        return h;
    }

    public int getWidth(){
        return w;
    }

} // END class RagNode
