package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main{
    protected final static JFrame frame = new JFrame("2048");
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                initialize();
            }
        });
    }
    public static void initialize(){
        Board board = new Board();
        int size = board.getMapSize();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setLayout(new GridLayout(size,size));

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                Map t = board.getTile(i,j);
                frame.getContentPane().add(t.getLabel());
            }
        }

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_LEFT) board.left();
                else if(e.getKeyCode()==KeyEvent.VK_RIGHT) board.right();
                else if(e.getKeyCode()==KeyEvent.VK_UP) board.top();
                else if(e.getKeyCode()==KeyEvent.VK_DOWN) board.down();
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
