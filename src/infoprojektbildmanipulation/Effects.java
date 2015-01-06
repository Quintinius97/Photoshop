package infoprojektbildmanipulation;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

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
     * @param x0 Wirbelzentrum
     * @param y0 Wirbelzentrum
     * @param neigung Neigung der Kurve Faktor um den r kleiner wird
     * @param radius Radius des Wirbels
     * @return BufferedImage
     */
    public BufferedImage Verwirbeln(int x0, int y0, int neigung, int radius) {
        System.out.println("Verwirbeln beginnt...");
        double winkelAdd=4*Math.PI/360;
        int schweif=6;
        
        for(int yalt=y0-radius;yalt<y0+radius;yalt++) {
            for(int xalt=x0-radius;xalt<x0+radius;xalt++) {
                //System.out.println("X: "+xalt+" Y: "+yalt);
                int abstand = (int)Math.sqrt(Math.pow(xalt-x0, 2)+Math.pow(yalt-y0, 2)); //Pythagoras
                if(abstand<radius) {
                    double winkel=Math.atan2(-(yalt-y0), xalt-x0);
                    if(winkel<0) {
                        winkel=2*Math.PI+winkel;
                    }
                    
                    Color[] rgb = new Color[schweif+1];
                    rgb[0]=new Color(image.getRGB(xalt, yalt));
                    
                    for(int anz=1; anz<=schweif; anz++){ 
                        int xneu=(int)(x0+Math.cos(winkel-winkelAdd*anz)*(abstand+neigung*anz));
                        int yneu=(int)(y0-Math.sin(winkel-winkelAdd*anz)*(abstand+neigung*anz));
                        rgb[anz]=new Color(image.getRGB(xneu, yneu));
                    }
                    double r=0;
                    double g=0;
                    double b=0;
                    for(int i=0;i<schweif;i++) {
                        r += rgb[i].getRed()*((schweif+1)-i)/(((schweif+1)*(schweif+2))/2);
                        g += rgb[i].getGreen()*((schweif+1)-i)/(((schweif+1)*(schweif+2))/2);
                        b += rgb[i].getBlue()*((schweif+1)-i)/(((schweif+1)*(schweif+2))/2);
                    }
                    Color c1=new Color((int)r,(int)g,(int)b);
                    image.setRGB(xalt, yalt, c1.getRGB());
                }
            }
        }
        System.out.println("Done!!!!");
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
    
    /**
     *
     * @param anzahlx Anzahl der Puzzleteile in X Richtung
     * @param anzahly Anzahl der Puzzleteile in Y Richtung
     * @return BufferedImage
     */
    public BufferedImage Puzzle(int anzahlx, int anzahly) {
        int hoehe = image.getHeight()/anzahly;
        int breite = image.getWidth()/anzahlx;
        Graphics2D zeichner = image.createGraphics();
        
        for(int y=hoehe;y<image.getHeight();y+=hoehe) {
            zeichner.draw(new Line2D.Float(0, y, 1/3*breite, y));
            for(int x=(2/3*breite);x<image.getWidth()-breite;x+=breite) {
                zeichner.draw(new Line2D.Float(x, y, x+(2/3*breite), y));
            }
            zeichner.draw(new Line2D.Float(image.getWidth()-(1/3*breite), y, image.getWidth(), y));
        }
        for(int x=breite;x<image.getWidth();x+=breite) {
            zeichner.draw(new Line2D.Float(x, 0, x, 1/3*hoehe));
            for(int y=(2/3*hoehe);y<image.getHeight()-hoehe;y+=hoehe) {
                zeichner.draw(new Line2D.Float(x, y, x, y+(2/3*hoehe)));
            }
            zeichner.draw(new Line2D.Float(x, image.getHeight()-(1/3*breite), x, image.getHeight()));
        }
        
        
        
        //Graphics2D to BufferedImage
        BufferedImage bImage = null;
        ByteArrayInputStream bais = new ByteArrayInputStream(zeichner.toString().getBytes());
        try {
            bImage = ImageIO.read(bais);
        } catch (IOException ex) {
            Logger.getLogger(Effects.class.getName()).log(Level.SEVERE, null, ex);
        }
        image= bImage;
        System.out.println("DONE");
        return image;
    }
    
    public BufferedImage Comic() {
        return null;
    }
}
