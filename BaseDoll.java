package com.fredollinger;
 
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.image.FilteredImageSource;  
import java.awt.Image;
import java.awt.image.ImageFilter;  
import java.awt.image.ImageProducer;  
import java.awt.image.RGBImageFilter;
import java.awt.Toolkit;

class BaseDoll extends Object {
    public int x, y;
    protected int w, h, gap;

    public int getHeight(){
        return h;
    }

    public int getWidth(){
        return w;
    }

public static Image makeColorTransparent(final BufferedImage im, final Color color)  
   {  
      final ImageFilter filter = new RGBImageFilter()  
      {  
         // the color we are looking for (white)... Alpha bits are set to opaque  
         public int markerRGB = color.getRGB() | 0xFFFFFFFF;  
  
         public final int filterRGB(final int x, final int y, final int rgb)  
         {  
            if ((rgb | 0xFF000000) == markerRGB)  
            {  
               // Mark the alpha bits as zero - transparent  
               return 0x00FFFFFF & rgb;  
            }  
            else  
            {  
               // nothing to do  
               return rgb;  
            }  
         }  
      };  
     final ImageProducer ip = new FilteredImageSource(im.getSource(), filter);  
      return Toolkit.getDefaultToolkit().createImage(ip);  
   } // END makeColorTransparent() 

} // END class BaseDoll
