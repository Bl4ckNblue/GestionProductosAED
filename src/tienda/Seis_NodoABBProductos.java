package tienda;

// Nodo utilizado por el ABB de productos. (Semana 12)

public class Seis_NodoABBProductos {
    private final Producto producto;
    private Seis_NodoABBProductos der, izq;

    public Seis_NodoABBProductos(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public Seis_NodoABBProductos getDer() {
        return der;
    }

    public void setDer(Seis_NodoABBProductos der) {
        this.der = der;
    }

    public Seis_NodoABBProductos getIzq() {
        return izq;
    }

    public void setIzq(Seis_NodoABBProductos izq) {
        this.izq = izq;
    }
}