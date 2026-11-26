package tienda;

// Nodo de la lista enlazada simple de movimientos. (Semanas 6 y 7)

public class Tres_NodoListaMovimientos {
    private Tres_RegistroMovimiento dato; // Almacena un registro de movimiento.
    private Tres_NodoListaMovimientos sgte; // Guarda la referencia al siguiente nodo.

    public Tres_NodoListaMovimientos(Tres_RegistroMovimiento dato) { // Constructor que recibe el registro.
        this.dato = dato; // Guarda el registro.
        sgte = null; // Inicializa el enlace siguiente.
    }

    public Tres_RegistroMovimiento getDato() { // Obtiene el registro almacenado.
        return dato; // Devuelve el registro.
    }

    public void setDato(Tres_RegistroMovimiento dato) { // Modifica el registro almacenado.
        this.dato = dato; // Actualiza el registro.
    }

    public Tres_NodoListaMovimientos getSgte() { // Obtiene el siguiente nodo.
        return sgte; // Devuelve el siguiente nodo.
    }

    public void setSgte(Tres_NodoListaMovimientos sgte) { // Establece el siguiente nodo.
        this.sgte = sgte; // Actualiza el enlace.
    }
}