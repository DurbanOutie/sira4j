
import sira4j.Sira;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Main{
    static final int SCALE  = 50;
    static final int WIDTH  = 16*SCALE;
    static final int HEIGHT = 9*SCALE;


    public static void main(String[] args){

        BufferedImage bi = new BufferedImage(WIDTH, HEIGHT, TYPE_INT_ARGB);

        int[] pixels = ((DataBufferInt)(bi.getRaster()
                    .getDataBuffer())).getData();

        int bg = 0xFF202020;
        int fg = 0xFF0000FF;

        
        Arrays.fill(pixels, bg);

        Sira.fillRect(pixels, WIDTH, HEIGHT, 100, 100, 100, 100, fg);



        try {
            // retrieve image
            File outputfile = new File("saved.png");
            ImageIO.write(bi, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

