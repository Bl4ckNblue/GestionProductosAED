package tienda;

public class Cinco_PilaOperaciones {
    private final String pila[];
    private int tope;
    private final int tamaño;

    public Cinco_PilaOperaciones() {
        tamaño = 100;
        pila = new String[tamaño];
        pilaVacia();
    }

    public void pilaVacia() {
        tope = -1;
    }

    public int getTope() {
        return tope;
    }

    public boolean apilar(String operacion) {
        boolean respuesta = false;

        if (operacion != null && !operacion.trim().equals("")
                && tope < tamaño - 1) {
            tope++;
            pila[tope] = operacion.trim();
            respuesta = true;
        }

        return respuesta;
    }

    public String desapilar() {
        String operacion = null;

        if (tope >= 0) {
            operacion = pila[tope];
            pila[tope] = null;
            tope--;
        }

        return operacion;
    }

    public String consultarCima() {
        String operacion = null;

        if (tope >= 0) {
            operacion = pila[tope];
        }

        return operacion;
    }

    public String mostrar() {
        String cadena = "";

        if (tope >= 0) {
            cadena = "Última operación primero:\n";

            for (int i = tope; i >= 0; i--) {
                cadena = cadena + pila[i] + "\n";
            }
        } else {
            cadena = "La pila está vacía.";
        }

        return cadena;
    }

    public boolean estaVacia() {
        return tope == -1;
    }
}