import javax.swing.*;
import java.awt.*;

public class entornos extends JFrame {

    public entornos() throws HeadlessException {

        JLabel l = new JLabel("Mi primer Proyecto");
        this.add(l);
        this.setSize(300, 300);
        this.setTitle("Hola");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        entornos frame = new entornos();

    }
}
