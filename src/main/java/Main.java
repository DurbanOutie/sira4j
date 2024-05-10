
import sira4j.Sira;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Main{
    static final int SCALE  = 10;
    static final int WIDTH  = 16*SCALE;
    static final int HEIGHT = 9*SCALE;


    public static void main(String[] args){

        BufferedImage bi = new BufferedImage(WIDTH, HEIGHT, TYPE_INT_ARGB);

        int[] pixels = ((DataBufferInt)(bi.getRaster()
                    .getDataBuffer())).getData();

        int bg = 0xFF202020;
        int fgr = 0xFFFF0000;
        int fgg = 0xFF00FF00;
        int fgb = 0xFF0000FF;

        
        Arrays.fill(pixels, bg);

       //Sira.fillRect(pixels, WIDTH, HEIGHT, 50, 50, 100, 100, fgr);
       Sira.drawLine(pixels, WIDTH, HEIGHT, WIDTH/2, 0, WIDTH/2, HEIGHT, fgr);
       Sira.drawLine(pixels, WIDTH, HEIGHT, 0, HEIGHT/2, WIDTH, HEIGHT/2, fgr);

       Sira.drawLine(pixels, WIDTH, HEIGHT, 0, 0, WIDTH/4, HEIGHT, fgg);
       Sira.drawLine(pixels, WIDTH, HEIGHT, 0, HEIGHT, WIDTH/4, 0, fgg);
       
       Sira.drawLine(pixels, WIDTH, HEIGHT, WIDTH*3/4, 0, WIDTH, HEIGHT, fgg);
       Sira.drawLine(pixels, WIDTH, HEIGHT, WIDTH, HEIGHT, WIDTH*3/4, 0, fgg);

       Sira.drawLine(pixels, WIDTH, HEIGHT, 0, 0, WIDTH, HEIGHT, fgb);
       Sira.drawLine(pixels, WIDTH, HEIGHT, 0, HEIGHT, WIDTH, 0, fgb);



        try {
            File outputfile = new File("saved.png");
            ImageIO.write(bi, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

