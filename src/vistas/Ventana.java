package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ventana extends JFrame {

    JMenuBar menuBar;
    JMenu menu;

    public Ventana(String title, int x, int y, String nombre_menu) {
        setSize(x, y);
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        this.menu = new JMenu(nombre_menu);
        this.menuBar.add(menu);
    }


    public void crearItem(String[] items) {

        for (String item : items) {
            JMenuItem x = new JMenuItem(item);
            this.menu.add(x);
            x.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Action event: " + item);
                }
            });
        }
    }

    public void salir(String item) {
        JMenuItem salir = new JMenuItem(item);
        menu.add(salir);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saliendo del programa :-(");
                System.exit(0);            }
        });
    }
}

