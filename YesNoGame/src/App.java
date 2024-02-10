import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     try (Scanner input = new Scanner(System.in)) {
        Arbol a = new Arbol();
          a.agregarHoja(a.raiz, "Camina en cuatro patas?", true);
          a.agregarHoja(a.raiz, "Tiene alas?", false);
          a.agregarHoja(a.raiz.getIzquierdo(), "Es un perro?", true);
          a.agregarHoja(a.raiz.getDerecho(), "Es una gallina?", true);
        System.out.println("**************************************************");
        System.out.println("BIENVENIDO AL JUEGO DE SI O NO, PIENSA EN UN ANIMAL");
        System.out.println("**************************************************");
          while (true) {
            a.leerHojas();
            System.out.println("Volvemos a jugar? s/n");
            String respuesta = input.nextLine();
             if (!respuesta.equalsIgnoreCase("s")){
                break;
             }
          }
    }
      System.out.println("NOS VEMOS!");
    }

  
}
