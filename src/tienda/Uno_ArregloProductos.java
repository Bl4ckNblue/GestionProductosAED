package tienda; // Define el paquete al que pertenece la clase.

// Tema: Arreglos de objetos. Administra el arreglo de productos. (Semanas 1, 2 y 3)

public class Uno_ArregloProductos {
    private final Producto productos[]; // Almacena los productos.
    private int indUlt; // Guarda el índice del último producto ocupado.

    public Uno_ArregloProductos() { // Constructor del inventario.
        productos = new Producto[100]; // Crea un arreglo con capacidad para cien productos.
        indUlt = -1; // Indica que inicialmente no hay productos.
    }

    public boolean insertar(Producto producto) { // Inserta un producto al final de los ocupados.
        int indMax = productos.length - 1; // Obtiene el índice máximo del arreglo.

        if (producto != null && indUlt < indMax && buscarIndice(producto.getCodigo()) == -1) { // Comprueba que haya espacio y el código no se repita.
            indUlt++; // Avanza a la siguiente posición libre.
            productos[indUlt] = producto; // Guarda el producto.
            return true; // Indica que se insertó correctamente.
        }

        return false; // Indica que no se pudo insertar.
    }

    public boolean eliminar(int codigo) { // Elimina un producto por su código.
        boolean valido = false;
        int indice = buscarIndice(codigo); // Busca la posición del producto.

        if (indice != -1) { // Comprueba que el producto exista.
            for (int i = indice; i < indUlt; i++) { // Recorre los productos posteriores.
                productos[i] = productos[i + 1]; // Desplaza cada producto una posición a la izquierda.
            }

            productos[indUlt] = null; // Limpia la última posición ocupada.
            indUlt--; // Actualiza el índice del último producto.
            valido = true; // Indica que se eliminó correctamente.
        }

        return valido;
    }

    public boolean actualizar(int codigo, double precio) {
        boolean valido = false;
        int indice = buscarIndice(codigo); // Busca la posición del producto.

        if (indice != -1 && precio >= 0 ) { // Comprueba que el producto y los datos sean válidos.
            productos[indice].setPrecio(precio); // Actualiza el precio.
            valido = true; // Indica que se actualizó correctamente.
        }

        return valido; // Indica que el producto o los datos no son válidos.
    }

    public Producto buscarPorCodigo(int codigo) { // Busca y devuelve un producto por su código.
        Producto p = null;
        int indice = buscarIndice(codigo); // Busca la posición del producto.

        if (indice != -1) { // Comprueba que se haya encontrado.
            p = productos[indice]; // Devuelve el producto.
        }

        return p;
    }

    private int buscarIndice(int codigo) { // Busca el índice de un producto por su código.
        for (int i = 0; i <= indUlt; i++) { // Recorre las posiciones ocupadas.
            if (productos[i].getCodigo() == codigo) { // Compara los códigos.
                return i; // Devuelve el índice encontrado.
            }
        }

        return -1; // Indica que el código no está en el arreglo.
    }

    public String mostrar() { // Devuelve los productos ocupados como texto.
        String cadena = ""; // Inicializa la cadena de salida.

        if (indUlt == -1) { // Comprueba si el arreglo está vacío.
            cadena =  "No hay productos registrados."; // Devuelve el mensaje correspondiente.
        }

        for (int i = 0; i <= indUlt; i++) { // Recorre los productos ocupados.
            cadena += productos[i].toString() + "\n"; // Añade cada producto a la cadena.
        }

        return cadena; // Devuelve la información de los productos.
    }

    public double calcularValorTotal() { // Calcula el valor total del inventario.
        double total = 0; // Inicializa el acumulador.

        for (int i = 0; i <= indUlt; i++) { // Recorre los productos ocupados.
            total += productos[i].calculaSubtotal(); // Acumula el subtotal de cada producto.
        }

        return total; // Devuelve el total del inventario.
    }

    public int getCantidad() { // Devuelve la cantidad de productos registrados.
        return indUlt + 1; // Convierte el último índice en cantidad.
    }

    public Producto obtenerEn(int indice) { // Devuelve el producto de un índice ocupado.
        Producto p = null;
        if (indice >= 0 && indice <= indUlt) { // Comprueba que el índice sea válido.
            p = productos[indice]; // Devuelve el producto.
        }

        return p; // Indica que el índice no está ocupado.
    }
}