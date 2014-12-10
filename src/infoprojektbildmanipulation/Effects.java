package infoprojektbildmanipulation;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author Tom
 * @author Nicolai
 */
public class Effects {
    private BufferedImage image = null;
    
    public Effects(BufferedImage i) {
        image = i;
    }
    
    /**
     *
     * @param x Wirbelzentrum
     * @param y Wirbelzentrum
     * @param neigung Neigung der Kurve Faktor um den r kleiner wird
     * @param radius Radius des Wirbels
     * @return BufferedImage
     */
    public BufferedImage Verwirbeln(int x0, int y0, int neigung, int radius) {
        double winkelAdd=4*Math.PI/360;
        int schweif=6;
        
        for(int yalt=y0-radius;yalt<y0+radius;yalt++) {
            for(int xalt=x0-radius;xalt<x0+radius;xalt++) {
                int abstand = (int)Math.sqrt(Math.pow(xalt, 2)+Math.pow(yalt, 2)); //Pythagoras
                if(abstand<radius) {
                    double winkel=Math.atan2(-yalt-y0, xalt-x0);
                    Color[] rgb = new Color[7];
                    rgb[0]=new Color(image.getRGB(xalt, yalt));
                    for(int anz=1; anz<=schweif; anz++){ 
                        int xneu=(int)Math.cos(winkel-winkelAdd*anz)*(abstand+neigung*anz);
                        int yneu=(int)Math.sin(winkel-winkelAdd*anz)*(abstand+neigung*anz);
                        rgb[anz]=new Color(image.getRGB(xneu, yneu));
                    }
                    int r=0;
                    int g=0;
                    int b=0;
                    for(int i=0;i<schweif;i++) {
                        r += rgb[i].getRed()*(7-i)/28*255;
                        g += rgb[i].getGreen()*(7-i)/28*255;
                        b += rgb[i].getBlue()*(7-i)/28*255;
                    }
                    image.setRGB(xalt, yalt, r*255*255+g*255+b);
                }
            }
        }
        return image;
    }
    
    public BufferedImage Wellen() {
        return null;
    }
    
    public BufferedImage Einrollen() {
        return null;
    }
    
    public BufferedImage Leinwand() {
        return null;
    }
    
    public BufferedImage Oelbild() {
        return null;
    }
    
    public BufferedImage Kaffee() {
        return null;
    }
    
    public BufferedImage Puzzle() {
        return null;
    }
    
    public BufferedImage Comic() {
        return null;
    }
}
