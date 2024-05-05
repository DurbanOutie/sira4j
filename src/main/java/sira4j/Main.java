package sira4j;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main{
    public static void main(String[] args){
        Window window = new Window();
        Thread t1 = new Thread(window);
        t1.start();
    }
}

class Window extends JFrame implements Runnable{
    static final int SCALE = 50;
    static final int WIDTH = 16*SCALE;
    static final int HEIGHT = 9*SCALE;
    static final String TITLE = "sira4j";

    Graphics2D g2;
    KL keyListener = new KL();
    ML mouseListener = new ML();
    Image dbImage; 
    Graphics dbg;
    boolean appRunning = true;

    int color = 0x00202020;
    
    static double timeStarted = System.nanoTime();

    static double getTime(){
        return (System.nanoTime() - timeStarted)*1E-9;
    }

    Window(){
        this.setSize(WIDTH, HEIGHT);
        this.setTitle(TITLE);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(keyListener);
        this.addMouseListener(mouseListener);
        this.addMouseMotionListener(mouseListener);
        //this.getInsets().top;
        //this.getInsets().bottom;
        g2 = (Graphics2D)this.getGraphics();

        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();

    }
    
    void draw(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(new Color(color));
        g2.fillRect(0, 0, WIDTH, HEIGHT);

    }

    void update(double dt){

        color += 10; 


        draw(dbg);
        g2.drawImage(dbImage, 0, 0, this);
    }
    
    public void run(){
        double lastFrameTime = 0.0;
        System.out.println("Starting Game");
        while(appRunning){
            double time = getTime();
            double deltaTime = time - lastFrameTime;
            lastFrameTime = time;
            update(deltaTime);
            try{
                Thread.sleep(16);
            }catch(Exception e){
            }
        }
        this.dispose();
    }
}

class ML extends MouseAdapter implements MouseMotionListener{
    boolean isPressed;
    double x, y;
   
    @Override 
    public void mousePressed(MouseEvent e){
        isPressed = true;
    }

    @Override 
    public void mouseReleased(MouseEvent e){
        isPressed = false;
    }
    
    @Override 
    public void mouseMoved(MouseEvent e){
        x = e.getX();
        y = e.getY();
    }
}

class KL implements KeyListener{

    public void keyTyped(KeyEvent e){
    }

    private boolean[] keyPressed = new boolean[128];
     
    public void keyReleased(KeyEvent e){
        keyPressed[e.getKeyCode()] = false;
    }

    public void keyPressed(KeyEvent e){
        keyPressed[e.getKeyCode()] = true;
    }

    boolean isKeyPressed(int keyCode){
        return keyPressed[keyCode];
    }
}
