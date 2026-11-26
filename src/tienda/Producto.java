package tienda; // Define el paquete al que pertenece la clase.

// Tema: Arreglos de objetos. Esta clase representa cada producto del arreglo. (Semanas 1, 2 y 3)

public class Producto { // Define la clase que almacena los datos de un producto.
    private int codigo; // Almacena el código del producto.
    private String nombre; // Almacena el nombre del producto.
    private String categoria; // Almacena la categoría del producto.
    private double precio; // Almacena el precio unitario.
    private int stock; // Almacena la cantidad de unidades disponibles.

    public Producto(int codigo, String nombre, String categoria, double precio, int stock) {
        this.codigo = codigo; // Inicializa el código.
        this.nombre = nombre; // Inicializa el nombre.
        this.categoria = categoria; // Inicializa la categoría.
        this.precio = precio; // Inicializa el precio.
        this.stock = stock; // Inicializa el stock.
    }

    public int getCodigo() { // Obtiene el código del producto.
        return codigo; // Devuelve el código.
    }

    public void setCodigo(int codigo) { // Modifica el código del producto.
        this.codigo = codigo; // Actualiza el código.
    }

    public String getNombre() { // Obtiene el nombre del producto.
        return nombre; // Devuelve el nombre.
    }

    public void setNombre(String nombre) { // Modifica el nombre del producto.
        this.nombre = nombre; // Actualiza el nombre.
    }

    public String getCategoria() { // Obtiene la categoría del producto.
        return categoria; // Devuelve la categoría.
    }

    public void setCategoria(String categoria) { // Modifica la categoría del producto.
        this.categoria = categoria; // Actualiza la categoría.
    }

    public double getPrecio() { // Obtiene el precio unitario.
        return precio; // Devuelve el precio.
    }

    public void setPrecio(double precio) { // Modifica el precio unitario.
        this.precio = precio; // Actualiza el precio.
    }

    public int getStock() { // Obtiene la cantidad disponible.
        return stock; // Devuelve el stock.
    }

    public void setStock(int stock) { // Modifica la cantidad disponible.
        this.stock = stock; // Actualiza el stock.
    }

    public double calculaSubtotal() { // Calcula el subtotal de este producto.
        return precio * stock; // Multiplica el precio por la cantidad disponible.
    }

    @Override
    public String toString() { // Devuelve los datos del producto como texto.
        return "Código: " + codigo
                + " | Nombre: " + nombre
                + " | Categoría: " + categoria
                + " | Precio: S/ " + String.format("%.2f", precio)
                + " | Stock: " + stock
                + " | Subtotal: S/ " + String.format("%.2f", calculaSubtotal());
    }
}