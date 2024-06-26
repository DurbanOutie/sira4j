package sira4j;

public class Canvas{
    public int[] pixels;
    public int x;
    public int y;
    public int w;
    public int h;
    public int stride;
    public Canvas(int[] pixels, int w, int h){
        this.pixels = pixels;
        this.x = 0;
        this.y = 0;
        this.w = w;
        this.h = h;
        this.stride = w;
    }
    public Canvas(int[] pixels, int x, int y, int w, int h, int stride){
        this.pixels = pixels;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.stride = stride;
    }
}
