package sira4j;

public class Sira{
    public static void fillRect(int[] pixels, int WIDTH, int HEIGHT, int x0, int y0, int w, int h, int color){
        for(int y = y0; y < y0 + h; ++y){
            for(int x = x0; x < x0 + w; ++x){
                if(0 <= y && y < HEIGHT && 0 <= x && x < WIDTH){
                    pixels[y*WIDTH + x] = color;
                }
            }
        }
    }
}
