public class Hoja {
    private Hoja izquierdo, derecho, padre;
    private String val;
    private boolean respuesta;
    Hoja(String v){
        this.val = v;
        this.derecho = null;
        this.izquierdo = null;
    }
    public void setDerecho(Hoja derecho) {
        this.derecho = derecho;
    }
    public void setIzquierdo(Hoja izquierdo) {
        this.izquierdo = izquierdo;
    }
    public Hoja getDerecho() {
        return derecho;
    }
    public Hoja getIzquierdo() {
       return izquierdo;
    }
    public boolean getRespuesta(){
        return respuesta;
    }
    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }
    public String getVal() {
        return val;
    }
    public void setPadre(Hoja padre) {
        this.padre = padre;
    }
    public Hoja getPadre() {
        return padre;
    }
    public void setVal(String val) {
        this.val = val;
    }
}