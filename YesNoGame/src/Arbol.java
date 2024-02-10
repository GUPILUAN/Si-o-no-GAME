import java.util.Scanner;

public class Arbol {
    Hoja raiz;
    Scanner input = new Scanner(System.in);
    Arbol(){
        this.raiz = new Hoja("Es un mamífero? s/n");
    }

    public void agregarHoja(Hoja h, String p, boolean r){
        Hoja nuevaHoja = new Hoja(p);
        if(r){
            h.setIzquierdo(nuevaHoja);
        }else{
            h.setDerecho(nuevaHoja);
        }
        nuevaHoja.setPadre(h);
    }

    public void reemplazar(Hoja h, String nuevoAnimal, String nuevaPregunta){
        agregarHoja(h,nuevaPregunta,false);
        agregarHoja(h.getDerecho(), nuevoAnimal, true);
    }
    

    public void leerHojas(){
        Hoja actual = raiz;
        Hoja actualPadre = null;
        String r = "";
        boolean res = true;
        while (actual != null) {
            System.out.println(actual.getVal());
             r = input.nextLine();
            actualPadre = actual;
            if (r.equalsIgnoreCase("s")){
                actual = actual.getIzquierdo();
                res = true;
            }else if (r.equalsIgnoreCase("n")){
                res = false;
                actual = actual.getDerecho();
            }else{
                System.out.println("Ingresa una opcion valida");
            }
        }
        comprobarGane(actualPadre, res);
    }
    
    public void comprobarGane(Hoja h, boolean r){
       if(!r){
            System.out.println("Ok me rindo, que animal estabas pensando?");
            System.out.print("Escribe el animal: ");
            String a = "Es " + input.nextLine().toLowerCase() + "?";
            System.out.println("Que pregunta hubiera sido buena para llegar a ese resultado?");
            System.out.print("Escribe la pregunta: ");
            String p = input.nextLine().toLowerCase();
            reemplazar(h,a,p);
            return;
       }
       System.out.println("GANE!!");
    }
}
