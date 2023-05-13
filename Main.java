/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles;
import java.util.Scanner;

/**
 *
 * @author Catalina Quijano L
 */
public class Main { 
    
    public static void main(String[] args) {
    
    Arboles op = new Arboles();

    //Arbol 1 (original)
    op.getRaiz().izquierdo = op.getAcebo();
    op.getRaiz().derecho = op.getFairy(); 
    op.getAcebo().izquierdo = op.getCacao();
    op.getCacao().izquierdo = op.getLily();
    op.getLily().izquierdo = op.getMadeleine();
    op.getCacao().derecho = op.getLatte();
    op.getAcebo().derecho = op.getAlmond();
    op.getAlmond().izquierdo = op.getTea();
    op.getAlmond().derecho = op.getCheese();
    op.getFairy().izquierdo = op.getPearl();
    op.getFairy().derecho = op.getMilky();
    op.getMilky().izquierdo = op.getExpreso();
    op.getMilky().derecho = op.getCremita();
    op.getCremita().izquierdo = op.getLunar();
    op.getCremita().derecho = op.getMashmellow();
    
    //Arbol2 (igual al original)
    op.getRaiz2().izquierdo = op.getAcebo();
    op.getRaiz2().derecho = op.getFairy(); 
    op.getAcebo().izquierdo = op.getCacao();
    op.getCacao().izquierdo = op.getLily();
    op.getLily().izquierdo = op.getMadeleine();
    op.getCacao().derecho = op.getLatte();
    op.getAcebo().derecho = op.getAlmond();
    op.getAlmond().izquierdo = op.getTea();
    op.getAlmond().derecho = op.getCheese();
    op.getFairy().izquierdo = op.getPearl();
    op.getFairy().derecho = op.getMilky();
    op.getMilky().izquierdo = op.getExpreso();
    op.getMilky().derecho = op.getCremita();
    op.getCremita().izquierdo = op.getLunar();
    op.getCremita().derecho = op.getMashmellow();
    
    //Arbol3 (estructura orignal datos distintos)
    op.getRaiz3().izquierdo = op.getPizza();
    op.getRaiz3().derecho = op.getSorbet(); 
    op.getPizza().izquierdo = op.getChocolate();
    op.getChocolate().izquierdo = op.getMilk();
    op.getMilk().izquierdo = op.getSanji();
    op.getChocolate().derecho = op.getPrincess();
    op.getPizza().derecho = op.getCrujiente();
    op.getCrujiente().izquierdo = op.getAfogatto();
    op.getCrujiente().derecho = op.getPasas();
    op.getSorbet().izquierdo = op.getCiruela();
    op.getSorbet().derecho = op.getAngel();
    op.getAngel().izquierdo = op.getDevil();
    op.getAngel().derecho = op.getChilli();
    op.getChilli().izquierdo = op.getGingerbreak();
    op.getChilli().derecho = op.getMilenial();
    
    //Arbol 4 (Estructura completamente diferente al original)
    op.getRaiz4().izquierdo = op.getCherry();
    op.getRaiz4().derecho = op.getLiquorice(); 
    op.getCherry().izquierdo = op.getMacarron();
    op.getMacarron().izquierdo = op.getMango();
    op.getMango().izquierdo = op.getConopino();
    op.getLiquorice().izquierdo = op.getDon();
    op.getLiquorice().derecho = op.getPoison();
    op.getPoison().izquierdo = op.getHot();

    
    Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---------- MENU ----------");
            System.out.println("1. Mostrar Arboles");
            System.out.println("2. Comparar");
            System.out.println("0. Salir");
            System.out.println("---------------------------");

            System.out.print("Ingrese la opcion deseada: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                  int opcion2;
                  
                    System.out.println("---------- ARBOLES ----------");
                    System.out.println("1. Arbol 1");
                    System.out.println("2. Arbol 2");
                    System.out.println("3. Arbol 3");
                    System.out.println("4. Arbol 4");
                    System.out.println("---------------------------");
                    System.out.println("Ingrese arbol a mostrar: ");
                    opcion2 = sc.nextInt();
                    
                    switch(opcion2){
                        case 1:
                            System.out.println("---------- ARBOL 1 ----------");
                            show(op.getRaiz(),"");
                            break;
                        case 2:
                            System.out.println("---------- ARBOL 2 ----------");
                            show(op.getRaiz2(),"");
                            break;
                        case 3:
                            System.out.println("---------- ARBOL 3 ----------");
                            show(op.getRaiz3(),"");
                            break;
                        case 4:
                            System.out.println("---------- ARBOL 4 ----------");
                            show(op.getRaiz4(),"");
                            break;
                    }
                            
                    break;
                case 2:
                    int opcion3;
                  
                    System.out.println("---------- COMPARAR ----------");
                    System.out.println("1. Arbol 1");
                    System.out.println("2. Arbol 2");
                    System.out.println("3. Arbol 3");
                    System.out.println("4. Arbol 4");
                    System.out.println("---------------------------");
                    System.out.println("Ingrese arbol a mostrar: ");
                    opcion3 = sc.nextInt();
                    
                    switch(opcion3){
                        case 1:
                            System.out.println("---------- ARBOL 1 ----------");
                            show(op.getRaiz(),"");
                            break;
                        case 2:
                            System.out.println("---------- ARBOL 2 ----------");
                            show(op.getRaiz2(),"");
                            break;
                        case 3:
                            System.out.println("---------- ARBOL 3 ----------");
                            show(op.getRaiz3(),"");
                            break;
                        case 4:
                            System.out.println("---------- ARBOL 4 ----------");
                            show(op.getRaiz4(),"");
                            break;
                    }
                            
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        sc.close();
    }





public static Nodo buscarNodo(Nodo nodo, String nombre) {
        if (nodo == null) {
            return null;
        }

        if (nodo.nombre.equals(nombre)) {
            return nodo;
        }

        Nodo resultadoIzq = buscarNodo(nodo.izquierdo, nombre);
        if (resultadoIzq != null) {
            return resultadoIzq;
        }

        Nodo resultadoDer = buscarNodo(nodo.derecho, nombre);
        if (resultadoDer != null) {
            return resultadoDer;
        }

        return null;
   }
public static boolean sonSimilares(Nodo raiz1, Nodo raiz2) {
    if (raiz1 == null && raiz2 == null) {
        return true;
    }

    if (raiz1 == null || raiz2 == null) {
        return false;
    }

    return sonSimilares(raiz1.izquierdo, raiz2.izquierdo) && sonSimilares(raiz1.derecho, raiz2.derecho);
}

public static boolean sonDistintos(Nodo raiz1, Nodo raiz2) {
    if (raiz1 == null || raiz2 == null) {
        return true;
    }

    if (raiz1.nombre != raiz2.nombre) {
        return true;
    }

    return sonDistintos(raiz1.izquierdo, raiz2.izquierdo) || sonDistintos(raiz1.derecho, raiz2.derecho);
}

public static boolean sonEquivalentes(Nodo raiz1, Nodo raiz2) {
    if (raiz1 == null && raiz2 == null) {
        return true;
    }

    if (raiz1 == null || raiz2 == null) {
        return false;
    }

    if (raiz1.nombre != raiz2.nombre) {
        return false;
    }

    return sonEquivalentes(raiz1.izquierdo, raiz2.izquierdo) && sonEquivalentes(raiz1.derecho, raiz2.derecho);
}



    public static void show(Nodo nodo, String prefijo) {
        if (nodo == null) {
            return;
        }

        System.out.println(prefijo + " >> " + nodo.nombre + " Cookie");

        show(nodo.izquierdo, prefijo + "    ");
        show(nodo.derecho, prefijo + "    ");
    }


}

