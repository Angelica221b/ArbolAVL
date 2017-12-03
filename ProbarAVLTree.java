/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author fires
 * blog: http://proyectosbeta.blogspot.com/
 */
public class ProbarAVLTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AVLTree arbolAVL = new AVLTree();

        /*Integer elemento1 = new Integer(1);
        Integer elemento2 = new Integer(2);
        Integer elemento3 = new Integer(3);
        Integer elemento4 = new Integer(4);
        Integer elemento5 = new Integer(5);
        Integer elemento6 = new Integer(6);
        Integer elemento7 = new Integer(7);
        Integer elemento8 = new Integer(15);
        Integer elemento9 = new Integer(14);
        Integer elemento10 = new Integer(13);*/
        
        Integer elemento1 = new Integer(3);
        Integer elemento2 = new Integer(7);
        Integer elemento3 = new Integer(4);
        Integer elemento4 = new Integer(2);
        Integer elemento5 = new Integer(10);
        Integer elemento6 = new Integer(23);
        Integer elemento7 = new Integer(6);
        Integer elemento8 = new Integer(24);
        Integer elemento9 = new Integer(1);
        Integer elemento10 = new Integer(29);
        Integer elemento11 = new Integer(12);
        Integer elemento12 = new Integer(5);
        Integer elemento13 = new Integer(32);
        Integer elemento14 = new Integer(31);
        Integer elemento15 = new Integer(8);
        
       /* String elemento1 = new String("a");
        String elemento2 = new String("z");
        String elemento3 = new String("d");
        String elemento4 = new String("f");
        String elemento5 = new String("s");
        String elemento6 = new String("d");
        String elemento7 = new String("b");
        String elemento8 = new String("y");
        String elemento9 = new String("u");
        String elemento10 = new String("e");*/
     

        arbolAVL.insert(elemento1);
        arbolAVL.insert(elemento2);
        arbolAVL.insert(elemento3);
        arbolAVL.insert(elemento4);
        arbolAVL.insert(elemento5);
        arbolAVL.insert(elemento6);
        arbolAVL.insert(elemento7);
        arbolAVL.insert(elemento8);
        arbolAVL.insert(elemento9);
        arbolAVL.insert(elemento10);
        arbolAVL.insert(elemento11);
        arbolAVL.insert(elemento12);
        arbolAVL.insert(elemento13);
        arbolAVL.insert(elemento14);
        arbolAVL.insert(elemento15);
        arbolAVL.imprimirPorNiveles();
        System.out.println("\n");

        

    }

}
