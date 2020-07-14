import java.awt.*;
import javax.swing.*;


public class App {
    
        public static void main(String[] args) {
            JFrame v=new JFrame("Primera Ventana");
            //v.setLocation(100, 100);
            //v.setSize(600, 400);
            v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            v.setVisible(true);
            v.add(new Panel());
            v.setBounds(100, 100, 600, 400);
            System.out.println("x=" + v.getX() + ", y=" + v.getY());
            System.out.println("ancho=" + v.getWidth() + ", alto=" + v.getHeight());

            


        }
    
}
