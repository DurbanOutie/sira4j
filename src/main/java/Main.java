
import sira4j.Sira;
import sira4j.font.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Main{
    static final int charScale = 10;
    static final int SCALE  = 50;
    static final int WIDTH  = 16*SCALE;
    static final int HEIGHT = 9*SCALE;
    static final int bg = 0xFFFFFFF8;
    static final int fgr = 0xFFFF0000;
    static final int fgg = 0xFF00FF00;
    static final int fgb = 0xFF0000FF;
    static final BufferedImage bi = new BufferedImage(WIDTH, HEIGHT, TYPE_INT_ARGB);
    static int[] pixels = ((DataBufferInt)(bi.getRaster()
                .getDataBuffer())).getData();


    public static void main(String[] args){
        Sira.fillRect(pixels, WIDTH, HEIGHT, 0, 0, WIDTH, HEIGHT, 0xFF040404);

        //lineExample();
        //circleFillExample();
        //triangleFillExample();
        //triangleDrawExample();
        //circleDrawExample();
        //dotDrawExample();
        //charExample();
        

        try {
            File outputfile = new File("triangleExample.png");
            ImageIO.write(bi, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static void charExample(){
        int x1 = 0;
        int y1 = 0;
        int fontWidth = Font_DOT13_1.w;
        int fontHeight = Font_DOT13_1.h;
        int cols = 0xF + 1;
        int rows = 0x5 + 1;
        int boxWidth = (fontWidth+1)*charScale;
        int boxHeight = (fontHeight+1)*charScale;

        int w = ((cols*boxWidth)+1);
        int h = ((rows*boxHeight)+1);
        Sira.fillRect(pixels, WIDTH, HEIGHT, x1, y1, w, h, bg);
        drawFontGrid(x1, y1, cols, rows, boxWidth, boxHeight);

        String s = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";

        for(char t:s.toCharArray()){
            char c = (char)(t - ' ');
            
            int col = (c & 0xF);
            int row = ((c & 0x70)/0xF);
            int x0 = x1 + ((col*boxWidth) + charScale);
            int y0 = y1 + ((row*boxHeight) + charScale);
            Sira.drawChar(pixels, WIDTH, HEIGHT, x0, y0, charScale, t, 0xFF303030);
        }
       
    }
    static void drawFontGrid(int x1, int y1, int cols, int rows, int boxWidth, int boxHeight){
        int w = (cols*boxWidth)+1;
        int h = (rows*boxHeight)+1;
        int lx1 = x1;
        int lx2 = x1 + w;
        int ly1, ly2 = y1;
        for(int s = 0; s < charScale; ++s){
            for(int row = 0; row < rows; ++row){
                
                ly1 = ly2 = y1 + row*boxHeight + s;
                //box hz
                Sira.drawLine(pixels, WIDTH, HEIGHT, lx1, ly1, lx2, ly2,  0xFFA5A5A5);
                //top guide
                Sira.drawLine(pixels, WIDTH, HEIGHT, lx1, ly1+2*charScale, lx2, ly2+2*charScale, 0xFFC0A0A0);
                //bottom guide
                Sira.drawLine(pixels, WIDTH, HEIGHT, lx1, ly1+7*charScale, lx2, ly2+7*charScale, 0xFFA0A0D0);

            }
            ly1 = ly2 = y1 + rows*boxHeight + s;
            //last hz
            Sira.drawLine(pixels, WIDTH, HEIGHT, lx1, ly1, lx2, ly2, 0xFFA5A5A5);
        }
        for(int s = 0; s < charScale; ++s){

            ly1 = y1;
            ly2 = y1 + h;
            for(int col = 0; col < cols; ++col){
                lx1 = lx2 = x1 + col*boxWidth + s;
                //box vert
                Sira.drawLine(pixels, WIDTH, HEIGHT, lx1, ly1, lx2, ly2, 0xFFA5A5A5);
            }
            lx1 = lx2 = x1 + cols*boxWidth + s;
            //last vert
            Sira.drawLine(pixels, WIDTH, HEIGHT, lx1, ly1, lx2, ly2, 0xFFA5A5A5);
        }
        
    }

    static void triangleFillExample(){

        int x1 = WIDTH*4/8;
        int y1 = HEIGHT*3/8;
        int x2 = WIDTH*6/8;
        int y2 = HEIGHT*4/8;
        int x3 = WIDTH*5/8;
        int y3 = HEIGHT*2/8;
        Sira.fillTriangle(pixels, WIDTH, HEIGHT, x1, y1, x2, y2, x3, y3, fgb);

        x1 = WIDTH*5/8;
        y1 = HEIGHT*5/8;
        x2 = WIDTH*7/8;
        y2 = HEIGHT*4/8;
        x3 = WIDTH*7/8;
        y3 = HEIGHT*5/8;
        Sira.fillTriangle(pixels, WIDTH, HEIGHT, x1, y1, x2, y2, x3, y3, fgg);

        x1 = WIDTH*5/8;
        y1 = HEIGHT*3/8;
        x2 = WIDTH*4/8;
        y2 = HEIGHT*6/8;
        x3 = WIDTH*6/8;
        y3 = HEIGHT*6/8;
        Sira.fillTriangle(pixels, WIDTH, HEIGHT, x1, y1, x2, y2, x3, y3, fgr);

    }
    
    static void triangleDrawExample(){

        int x1 = WIDTH*2/8;
        int y1 = HEIGHT*3/8;
        int x2 = WIDTH*3/8;
        int y2 = HEIGHT*5/8;
        int x3 = WIDTH*6/8;
        int y3 = HEIGHT*6/8;
        Sira.drawTriangle(pixels, WIDTH, HEIGHT, x1, y1, x2, y2, x3, y3, fgb);

    }
    
    static void dotDrawExample(){
        int x1 = WIDTH*2/4;
        int y1 = HEIGHT*2/4;
        Sira.drawDot(pixels, WIDTH, HEIGHT, x1, y1, fgr);
    }

    static void circleDrawExample(){
        Sira.drawCircle(pixels, WIDTH, HEIGHT, 0, 0, 10*SCALE, fgr);
        Sira.drawCircle(pixels, WIDTH, HEIGHT, WIDTH/2, HEIGHT/2, 4*SCALE, fgg);
        Sira.drawCircle(pixels, WIDTH, HEIGHT, WIDTH*3/4, HEIGHT*3/4, 2*SCALE, fgb);

    }

    static void circleFillExample(){
        Sira.fillCircle(pixels, WIDTH, HEIGHT, 0, 0, 500, fgr);
        Sira.fillCircle(pixels, WIDTH, HEIGHT, WIDTH/2, HEIGHT/2, 200, fgg);
        Sira.fillCircle(pixels, WIDTH, HEIGHT, WIDTH*3/4, HEIGHT*3/4, 100, fgb);
    }

    static void lineExample(){
        Sira.drawLine(pixels, WIDTH, HEIGHT, WIDTH/2, 0, WIDTH/2, HEIGHT, fgr);
        Sira.drawLine(pixels, WIDTH, HEIGHT, 0, HEIGHT/2, WIDTH, HEIGHT/2, fgr);

        Sira.drawLine(pixels, WIDTH, HEIGHT, 0, 0, WIDTH/4, HEIGHT, fgg);
        Sira.drawLine(pixels, WIDTH, HEIGHT, 0, HEIGHT, WIDTH/4, 0, fgg);

        Sira.drawLine(pixels, WIDTH, HEIGHT, WIDTH*3/4, 0, WIDTH, HEIGHT, fgg);
        Sira.drawLine(pixels, WIDTH, HEIGHT, WIDTH, 0, WIDTH*3/4, HEIGHT, fgg);

        Sira.drawLine(pixels, WIDTH, HEIGHT, 0, 0, WIDTH, HEIGHT, fgb);
        Sira.drawLine(pixels, WIDTH, HEIGHT, 0, HEIGHT, WIDTH, 0, fgb);
    }









}

