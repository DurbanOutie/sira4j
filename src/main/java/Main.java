
import sira4j.Sira;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Main{
    static final int SCALE  = 5;
    static final int WIDTH  = 16*SCALE;
    static final int HEIGHT = 9*SCALE;
    static final int bg = 0xFF202020;
    static final int fgr = 0xFFFF0000;
    static final int fgg = 0xFF00FF00;
    static final int fgb = 0xFF0000FF;
    static final BufferedImage bi = new BufferedImage(WIDTH, HEIGHT, TYPE_INT_ARGB);
    static int[] pixels = ((DataBufferInt)(bi.getRaster()
                .getDataBuffer())).getData();


    public static void main(String[] args){
        Sira.fillRect(pixels, WIDTH, HEIGHT, 0, 0, WIDTH, HEIGHT, bg);

        //lineExample();
        //circleFillExample();
        //circleDrawExample();
        //dotDrawExample();
        triangleDrawExample();
        

        try {
            File outputfile = new File("saved.png");
            ImageIO.write(bi, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    static void triangleDrawExample(){

        int x1 = WIDTH*2/4;
        int y1 = HEIGHT/4;
        int x2 = WIDTH/4;
        int y2 = HEIGHT*2/4;
        int x3 = WIDTH*3/4;
        int y3 = HEIGHT*3/4;

        


        Sira.drawTriangle(pixels, WIDTH, HEIGHT, x1, y1, x2, y2, x3, y3, fgb);

    }
    
    static void dotDrawExample(){
        Sira.drawDot(pixels, WIDTH, HEIGHT, WIDTH/2, HEIGHT/2, fgr);
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
        Sira.drawLine(pixels, WIDTH, HEIGHT, WIDTH, HEIGHT, WIDTH*3/4, 0, fgg);

        Sira.drawLine(pixels, WIDTH, HEIGHT, 0, 0, WIDTH, HEIGHT, fgb);
        Sira.drawLine(pixels, WIDTH, HEIGHT, 0, HEIGHT, WIDTH, 0, fgb);
    }

}

