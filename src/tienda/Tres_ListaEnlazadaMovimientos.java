package tienda;

// Tema: Operaciones con una lista enlazada simple. (Semanas 6 y 7)

public class Tres_ListaEnlazadaMovimientos {
    private Tres_NodoListaMovimientos inicio, nuevo, p, q; // Referencias para crear y recorrer nodos.
    private int cantidad; // Cuenta los movimientos de la lista.

    public Tres_ListaEnlazadaMovimientos() { // Constructor de la lista.
        inicio = null; // Inicializa la lista como vacía.
        cantidad = 0; // Inicializa la cantidad de movimientos.
    }

    public boolean insertar(Tres_RegistroMovimiento movimiento) { // Inserta al final de la lista.
        if (movimiento == null || buscar(movimiento.getId()) != null) { // Verifica el registro y evita IDs repetidos.
            return false; // Indica que no se pudo insertar.
        }

        nuevo = new Tres_NodoListaMovimientos(movimiento); // Crea el nodo que se insertará.

        if (inicio == null) { // Comprueba si la lista está vacía.
            inicio = nuevo; // El nuevo nodo se convierte en el primero.
        } else {
            p = inicio; // Comienza el recorrido desde el inicio.

            while (p.getSgte() != null) { // Busca el último nodo.
                p = p.getSgte(); // Avanza al siguiente nodo.
            }

            p.setSgte(nuevo); // Enlaza el último nodo con el nuevo.
        }

        cantidad++; // Actualiza la cantidad de registros.
        return true; // Indica que se insertó correctamente.
    }

    public boolean eliminar(int id) { // Elimina un registro según su ID.
        p = inicio; // Comienza la búsqueda desde el primer nodo.
        q = null; // Inicializa la referencia al nodo anterior.

        while (p != null && p.getDato().getId() != id) { // Busca el nodo con el ID indicado.
            q = p; // Guarda el nodo anterior.
            p = p.getSgte(); // Avanza al siguiente nodo.
        }

        if (p != null) { // Comprueba que se encontró el registro.
            if (p == inicio) { // Comprueba si se eliminará el primer nodo.
                inicio = inicio.getSgte(); // Actualiza el inicio.
            } else {
                q.setSgte(p.getSgte()); // Enlaza el nodo anterior con el siguiente.
            }

            p.setSgte(null); // Desconecta el nodo eliminado.
            cantidad--; // Actualiza la cantidad de registros.
            return true; // Indica que se eliminó correctamente.
        }

        return false; // Indica que no se encontró el registro.
    }

    public boolean actualizar(int id, String tipo, String detalle,
            int cantidadNueva, double precioUnitario) { // Actualiza un registro.
        Tres_RegistroMovimiento movimiento = buscar(id); // Busca el registro por su ID.

        if (movimiento != null && tipo != null && !tipo.trim().equals("")
                && detalle != null && !detalle.trim().equals("")
                && cantidadNueva >= 0 && precioUnitario >= 0) { // Comprueba que los datos sean válidos.
            movimiento.setTipo(tipo.trim()); // Actualiza el tipo.
            movimiento.setDetalle(detalle.trim()); // Actualiza el detalle.
            movimiento.setCantidad(cantidadNueva); // Actualiza la cantidad.
            movimiento.setPrecioUnitario(precioUnitario); // Actualiza el precio.
            return true; // Indica que se actualizó correctamente.
        }

        return false; // Indica que el registro o los datos no son válidos.
    }

    public Tres_RegistroMovimiento buscar(int id) { // Busca un registro por su ID.
        p = inicio; // Comienza desde el primer nodo.

        while (p != null) { // Recorre la lista hasta el final.
            if (p.getDato().getId() == id) { // Comprueba si coincide el ID.
                return p.getDato(); // Devuelve el registro encontrado.
            }

            p = p.getSgte(); // Avanza al siguiente nodo.
        }

        return null; // Indica que no se encontró el registro.
    }

    public String mostrar() { // Devuelve los registros de la lista como texto.
        String cadena = ""; // Inicializa la cadena de salida.

        if (inicio == null) { // Comprueba si la lista está vacía.
            return "No hay movimientos registrados."; // Devuelve el mensaje correspondiente.
        }

        p = inicio; // Comienza el recorrido desde el primer nodo.

        while (p != null) { // Recorre la lista hasta el final.
            cadena += p.getDato().toString() + "\n"; // Añade el registro actual.
            p = p.getSgte(); // Avanza al siguiente nodo.
        }

        return cadena; // Devuelve los registros.
    }

    public double calcularTotal() { // Suma los importes de todos los movimientos.
        double total = 0; // Inicializa el acumulador.
        p = inicio; // Comienza el recorrido desde el primer nodo.

        while (p != null) { // Recorre todos los nodos.
            total += p.getDato().calcularTotal(); // Acumula el importe del movimiento.
            p = p.getSgte(); // Avanza al siguiente nodo.
        }

        return total; // Devuelve el total acumulado.
    }

    public int getCantidad() { // Obtiene la cantidad de registros.
        return cantidad; // Devuelve el contador.
    }
}