package tienda;

// Tema: Dato almacenado en la cola de prioridad. (Semana 10 - Recuperación)

public class Cuatro_SolicitudAtencion {
    private final int id;
    private final String descripcion;
    private final int prioridad;

    public Cuatro_SolicitudAtencion(int id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        String textoPrioridad;

        switch (prioridad) {
            case 1:
                textoPrioridad = "Alta";
                break;
            case 2:
                textoPrioridad = "Media";
                break;
            case 3:
                textoPrioridad = "Baja";
                break;
            default:
                textoPrioridad = "No válida";
        }

        return "Solicitud " + id
                + " | Prioridad: " + textoPrioridad
                + " | " + descripcion;
    }
}