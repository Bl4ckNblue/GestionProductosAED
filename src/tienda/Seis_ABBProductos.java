package tienda;

// Tema: Árboles binarios de búsqueda. (Semana 12)

public class Seis_ABBProductos {
    private Seis_NodoABBProductos raiz, nuevo, p;

    public Seis_ABBProductos() {
        raiz = null;
    }

    public void insertar(Producto producto) {
        nuevo = new Seis_NodoABBProductos(producto);

        if (raiz == null)
            raiz = nuevo;
        else {
            p = raiz;
            insertaNodo(p, nuevo);
        }
    }

    public void insertaNodo(Seis_NodoABBProductos p, Seis_NodoABBProductos nuevo) {
        if (p == null)
            p = nuevo;
        else {
            if (nuevo.getProducto().getNombre().compareToIgnoreCase(p.getProducto().getNombre()) > 0) {
                if (p.getDer() == null)
                    p.setDer(nuevo);
                else 
                    insertaNodo(p.getDer(), nuevo);
                } else {
                if (p.getIzq() == null)
                    p.setIzq(nuevo);
                else
                    insertaNodo(p.getIzq(), nuevo);
            }
        }
    }
    
    public String preOrden(Seis_NodoABBProductos p) {
        String cadena = "";

        if (p != null) {
            cadena = cadena + " - " + p.getProducto() + "\n";;
            cadena = cadena + preOrden(p.getIzq());
            cadena = cadena + preOrden(p.getDer());
        }
        return cadena;
    }

    public String inOrden(Seis_NodoABBProductos p) {
        String cadena = "";

        if (p != null) {
            cadena = cadena + inOrden(p.getIzq());
            cadena = cadena + " - " + p.getProducto() + "\n";;
            cadena = cadena + inOrden(p.getDer());
        }
        return cadena;
    }

    public String postOrden(Seis_NodoABBProductos p) {
        String cadena = "";

        if (p != null) {
            cadena = cadena + postOrden(p.getIzq());
            cadena = cadena + postOrden(p.getDer());
            cadena = cadena + " - " + p.getProducto() + "\n";;
        }
        return cadena;
    }

    public String muestraValores(int opcion) {
        p = raiz;
        String cadena = "";

        switch (opcion) {
            case 1:
                cadena = preOrden(p);
                break;
            case 2:
                cadena = inOrden(p);
                break;
            case 3:
                cadena = postOrden(p);
                break;
        }

        return cadena;
    }

//    public Producto buscarIndexada(String nombre) {
//        if (nombre == null || nombre.trim().isEmpty()) {
//            return null;
//        }
//
//        return buscarIndexadaRecursivo(raiz, nombre.trim());
//    }
//
//    private Producto buscarIndexadaRecursivo(Seis_NodoABBProductos p, String nombre) {
//        if (p == null) {
//            return null;
//        }
//
//        int comparacion = nombre.compareToIgnoreCase(
//                p.getProducto().getNombre());
//
//        if (comparacion == 0) {
//            return p.getProducto();
//        } else if (comparacion > 0) {
//            return buscarIndexadaRecursivo(p.getDer(), nombre);
//        } else {
//            return buscarIndexadaRecursivo(p.getIzq(), nombre);
//        }
//    }
//
//    public Producto buscarSecuencial(String nombre) {
//        if (nombre == null || nombre.trim().isEmpty()) {
//            return null;
//        }
//
//        return buscarSecuencialRecursivo(raiz, nombre.trim());
//    }
//
//    private Producto buscarSecuencialRecursivo(Seis_NodoABBProductos p, String nombre) {
//        if (p == null) {
//            return null;
//        }
//
//        if (p.getProducto().getNombre().equalsIgnoreCase(nombre)) {
//            return p.getProducto();
//        }
//
//        Producto encontrado = buscarSecuencialRecursivo(p.getIzq(), nombre);
//
//        if (encontrado == null) {
//            encontrado = buscarSecuencialRecursivo(p.getDer(), nombre);
//        }
//
//        return encontrado;
//    }
//
//    public String mostrarEnOrden() {
//        String cadena = muestraValores(2);
//
//        if (cadena.equals("")) {
//            return "El árbol está vacío.";
//        }
//
//        return cadena;
//    }
    
}