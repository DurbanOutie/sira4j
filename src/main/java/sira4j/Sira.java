package sira4j;
/*
 * For nD array flattened to 1D -> to access an index use formula 
 * n*max(n - 1) + (n - 1)*max(n - 2) + .. + (n - (n - 1))*max(1).
 *
 * ie
 *
 * 1D array 
 * with 10 elements and 
 * index start at 0
 * retrieving position x = 4
 *
 * IS SAME AS
 *
 * "y" is always 0 and 
 * "max(x)" is size of x elements = 10;
 * "x" is 4
 * 
 * -> y*max(x) + x*max(1)
 * -> 0*10 + 4*1
 * -> 4
 *
 *  Not that exciting for 1D arrays
 * 
 *
 * 2D array 
 * with 10 elements in x and 7 elements in y
 * index start at 0
 * retrieving position x = 3 and y = 4
 *
 * IS SAME AS
 *
 * "z" is always 0 and 
 * "max(y)" is index of last element in y direction = 7 and 
 * "max(x)" is index of last element in x direction = 10;
 * "y" is 4
 * "x" is 3
 * 
 * -> z*max(y) + y*max(x) + x*max(1)
 * -> 0*7      + 4*10     + 3*1
 * -> 43
 *
 * You get the picture for 3D and up.
 */


public class Sira{

    public static void fillRect(int[] pixels, int WIDTH, int HEIGHT, int x1, int y1, int w, int h, int color){
        for(int y = y1; y < y1 + h; ++y){
            for(int x = x1; x < x1 + w; ++x){
                if(0 <= y && y < HEIGHT && 0 <= x && x < WIDTH){
                    pixels[y*WIDTH + x] = color;
                }
            }
        }
    }

    /* Line between 2 points x1,y1 and x2,y2
     * 
     *     (y2 - y1)
     * m = ---------      <------------- m is the ratio of the distance between 2 points
     *     (x2 - x1)      
     *
     * y-y1 = m*(x - x1)  <------------- for any value x and y on the same line with known m, 
     *                                   y2 and x2 can be subbed for x and y
     *
     * solve for y
     *
     * y = m*(x - x1) + y1
     * y = (dy*x-dy*x1)/dx + y1
     * y = (dy*x-dy*x1)/dx + dx*y1/dx
     * y = (dy*x-dy*x1 + dx*y1)/dx
     *
     */
    
    public static void drawLine(int[] pixels, int WIDTH, int HEIGHT, int x1, int y1, int x2, int y2, int color){

        //Swap points to avoid negative deltas, eaiser to work with
        
        if(x1 > x2){
            int t = x2;
            x2 = x1;
            x1 = t;
        }

        //set up deltas, they can be either 0 or positive
        int dy = y2 - y1;
        int dx = x2 - x1;

        if(dx > 0){
            
            //if dx is positive
            //  Then iterate each x in dx and solve for corresponding y
            //  The jump between x's may be greater than 1 for y
            //  So iterate for each y where the same x will solve for it
            //  Why do this? to avoid missing pixels in our line
            //
            //     0123456789            012345678
            //     1 x                   1 x
            //     2  x                  2  x
            //     3   x                 3   x
            //     4                     4   x
            //     5           ---->     5   x
            //     6                     6   x
            //     7    x                7    x
            //     8     x               8     x
            //     9      x              9      x
            //
            //  How we do this? we get the current x's y, and the next x's y 
            //  and iterate through the y's filling in the missing space
            

            for(int x = x1; x < x2; ++x){
                int curY = (dy*x-dy*x1 + dx*y1)/dx;
                int nexY = (dy*(x+1)-dy*x1 + dx*y1)/dx;

                if(nexY < curY){
                    int t = curY;
                    curY = nexY;
                    nexY = t;
                }

                for(int y = curY; y <= nexY; ++y){
                    if(0 <= y && y < HEIGHT && 0 <= x && x < WIDTH){
                        pixels[y*WIDTH + x] = color;
                    }
                }
            }
            
        }else{

            //if dx is 0 ie Straight vertical line, 
            //  no need to loop over x to find y,
            //  Just pick either x2 or x1 as your x and
            //  iterate through all of dy to draw a line
            
            int x = x1;
            for(int y = y1; y < y2; ++y){
                if(0 <= y && y < HEIGHT && 0 <= x && x < WIDTH){
                    pixels[y*WIDTH + x] = color;
                }
            }
            
        }

    }
}
