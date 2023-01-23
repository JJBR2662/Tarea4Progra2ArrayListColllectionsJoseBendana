package tarea4progra2josebendaña;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Tarea4Progra2JoseBendaña {

    public static void main(String[] args) {
        ArrayList<Integer> conjunto1 = new ArrayList();
        ArrayList<Integer> conjunto2 = new ArrayList();
        ArrayList<Integer> interseccion = new ArrayList();
        conjunto1.add(5); conjunto2.add(9);
        conjunto1.add(2); conjunto2.add(2);
        conjunto1.add(8); conjunto2.add(1);
        conjunto1.add(3); conjunto2.add(5);
        conjunto1.add(1); conjunto2.add(7);
        conjunto1.add(27);conjunto2.add(13);
        conjunto1.add(13);conjunto2.add(24);
        conjunto1.add(24);conjunto2.add(15);
        conjunto1.add(7);
        System.out.println("Conjunto 1 = "+conjunto1);
        System.out.println("Conjunto 2 = "+conjunto2);
        
        for (int i = 0; i < conjunto1.size(); i++) {
            for (int j = 0; j < conjunto2.size(); j++) {
                if (conjunto1.get(i).equals(conjunto2.get(j))) {
                    interseccion.add(conjunto1.get(i));
                }
            }
        }
        
        System.out.println("Intersecciones = "+interseccion);
        for (int i = 0; i < interseccion.size(); i++) {
            if (interseccion.get(i)%2==0) {
                interseccion.remove(i);
            }
        }
        System.out.println("Intersecciones impares = "+interseccion);
        
        Collections.sort(interseccion);
        Comparator<Integer> compara = Collections.reverseOrder();
        Collections.sort(interseccion, compara);
        System.out.println("Intersecciones impares ordenada descendientemente = "+interseccion);
        
    }
    
}
