package infoprojektbildmanipulation;

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
        //int height = image.getHeight();
        //int width = image.getWidth();
        double winkelAdd=4*Math.PI/360;
        for(int yalt=y0-radius;yalt<y0+radius;yalt++) {
            for(int xalt=x0-radius;xalt<x0+radius;xalt++) {
                int abstand = (int)Math.sqrt(Math.pow(xalt, 2)+Math.pow(yalt, 2)); //Pythagoras
                if(abstand<radius) {
                    double winkel=Math.atan2(yalt, xalt);
                    
                    for(int anz=0; anz<6; anz++){ 
                        int xneu=(int)Math.cos(winkel+winkelAdd)*(abstand-neigung);
                        int yneu=(int)Math.sin(winkel+winkelAdd)*(abstand-neigung);
                    }
                }
            }
        }
        return null;
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
