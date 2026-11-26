package tienda;

import java.util.Arrays; // Permite mostrar cada fila de la matriz.

// Tema: Matrices bidimensionales. (Semanas 4 y 5)

public class Dos_MatrizInventario {
    private final int unidades[][]; // Almacena las unidades por zona y estante.
    private final int indMaxF; // Guarda el índice máximo de las filas.
    private final int indMaxC; // Guarda el índice máximo de las columnas.

    public Dos_MatrizInventario() { // Constructor de la matriz del inventario.
        unidades = new int[3][4]; // Crea una matriz para tres zonas y cuatro estantes.
        indMaxF = unidades.length - 1; // Obtiene el índice de la última fila.
        indMaxC = unidades[0].length - 1; // Obtiene el índice de la última columna.
    }

    public boolean actualizar(int fila, int columna, int cantidad) { // Actualiza las unidades de una ubicación.
        if (fila >= 0 && fila <= indMaxF
                && columna >= 0 && columna <= indMaxC
                && cantidad >= 0) { // Comprueba que los índices y la cantidad sean válidos.
            unidades[fila][columna] = cantidad; // Guarda la cantidad en la matriz.
            return true; // Indica que la actualización se realizó.
        }

        return false; // Indica que los datos no son válidos.
    }

    public int consultar(int fila, int columna) { // Consulta las unidades de una ubicación.
        if (fila >= 0 && fila <= indMaxF
                && columna >= 0 && columna <= indMaxC) { // Comprueba que los índices sean válidos.
            return unidades[fila][columna]; // Devuelve la cantidad almacenada.
        }

        return -1; // Indica que la ubicación no es válida.
    }

    public String mostrar() { // Devuelve la matriz con sus zonas y estantes.
        String cadena = "Unidades por zona y estante:\n"; // Inicializa el título.
        cadena += "Estantes: [1, 2, 3, 4]\n"; // Identifica las columnas.

        for (int i = 0; i <= indMaxF; i++) { // Recorre las filas de la matriz.
            cadena += "Zona " + (i + 1) + ": "
                    + Arrays.toString(unidades[i]) + "\n"; // Añade una zona y sus cantidades.
        }

        return cadena; // Devuelve la matriz en formato de texto.
    }
}