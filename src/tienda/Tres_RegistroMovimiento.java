package tienda;

// Tema: Registro almacenado en la lista enlazada. (Semanas 6 y 7)

public class Tres_RegistroMovimiento {
    private final int id; // Identifica el movimiento.
    private String tipo; // Almacena el tipo de movimiento.
    private String detalle; // Describe el movimiento.
    private int cantidad; // Almacena la cantidad de productos.
    private double precioUnitario; // Almacena el precio por unidad.

    public Tres_RegistroMovimiento(int id, String tipo, String detalle,
            int cantidad, double precioUnitario) {
        this.id = id; // Inicializa el identificador.
        this.tipo = tipo; // Inicializa el tipo.
        this.detalle = detalle; // Inicializa el detalle.
        this.cantidad = cantidad; // Inicializa la cantidad.
        this.precioUnitario = precioUnitario; // Inicializa el precio unitario.
    }

    public int getId() { // Obtiene el identificador.
        return id; // Devuelve el ID.
    }

    public String getTipo() { // Obtiene el tipo de movimiento.
        return tipo; // Devuelve el tipo.
    }

    public void setTipo(String tipo) { // Modifica el tipo de movimiento.
        this.tipo = tipo; // Actualiza el tipo.
    }

    public String getDetalle() { // Obtiene la descripción.
        return detalle; // Devuelve el detalle.
    }

    public void setDetalle(String detalle) { // Modifica la descripción.
        this.detalle = detalle; // Actualiza el detalle.
    }

    public int getCantidad() { // Obtiene la cantidad.
        return cantidad; // Devuelve la cantidad.
    }

    public void setCantidad(int cantidad) { // Modifica la cantidad.
        this.cantidad = cantidad; // Actualiza la cantidad.
    }

    public double getPrecioUnitario() { // Obtiene el precio unitario.
        return precioUnitario; // Devuelve el precio.
    }

    public void setPrecioUnitario(double precioUnitario) { // Modifica el precio unitario.
        this.precioUnitario = precioUnitario; // Actualiza el precio.
    }

    public double calcularTotal() { // Calcula el importe del movimiento.
        return cantidad * precioUnitario; // Multiplica precio por cantidad.
    }

    @Override
    public String toString() { // Devuelve los datos como texto.
        return "ID: " + id
                + " | Tipo: " + tipo
                + " | Detalle: " + detalle
                + " | Cantidad: " + cantidad
                + " | Precio unitario: S/ " + precioUnitario
                + " | Total: S/ " + calcularTotal();
    }
}