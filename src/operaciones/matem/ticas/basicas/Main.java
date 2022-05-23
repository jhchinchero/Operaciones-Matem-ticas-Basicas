
package operaciones.matem.ticas.basicas;

import vistas.Ventana;
public class Main {

    public static void main(String[] args) {
        Ventana v = new Ventana("Operaciones Matemáticas", 300, 300, "Opciones");
        v.setVisible(true);
        String items[]={"suma", "resta", "multiplicación", "división"};
        v.crearItem(items);
        v.salir("Salir");     
    } 
}
