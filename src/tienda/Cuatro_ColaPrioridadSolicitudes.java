package tienda;

// Tema: Cola de prioridad implementada mediante un arreglo. (Semana 10 - Recuperación)

public class Cuatro_ColaPrioridadSolicitudes {
    private final Cuatro_SolicitudAtencion cola[];
    private int first, last, tamaño;

    public Cuatro_ColaPrioridadSolicitudes() {
        cola = new Cuatro_SolicitudAtencion[100];
        tamaño = 100;
        colaVacia();
    }

    public void colaVacia() {
        first = -1;
        last = -1;
    }

    public boolean insertar(Cuatro_SolicitudAtencion solicitud) {
        boolean insertado = false;

        if (solicitud != null && solicitud.getPrioridad() >= 1
                && solicitud.getPrioridad() <= 2 && !existeId(solicitud.getId())) {
            if (last < tamaño - 1) {
                int i = last;

                while (i >= 0 && cola[i].getPrioridad() > solicitud.getPrioridad()) {
                    cola[i + 1] = cola[i];
                    i--;
                }

                last++;
                cola[i + 1] = solicitud;

                if (first == -1) {
                    first = 0;
                }

                insertado = true;
            }
        }

        return insertado;
    }

    public Cuatro_SolicitudAtencion atender() {
        Cuatro_SolicitudAtencion atendida = null;

        if (first >= 0) {
            atendida = cola[first];

            for (int i = first; i < last; i++) {
                cola[i] = cola[i + 1];
            }

            cola[last] = null;
            last--;

            if (first > last) {
                colaVacia();
            }
        }

        return atendida;
    }

    public Cuatro_SolicitudAtencion consultarSiguiente() {
        Cuatro_SolicitudAtencion solicitud = null;

        if (first >= 0) {
            solicitud = cola[first];
        }

        return solicitud;
    }

    private boolean existeId(int id) {
        boolean existe = false;

        if (first >= 0) {
            for (int i = first; i <= last; i++) {
                if (cola[i].getId() == id) {
                    existe = true;
                }
            }
        }

        return existe;
    }

    public String mostrar() {
        String cadena = "";

        if (first >= 0) {
            for (int i = first; i <= last; i++) {
                cadena += cola[i] + "\n";
            }
        } else {
            cadena = "No hay solicitudes pendientes.";
        }

        return cadena;
    }

    public int getCantidad() {
        int cantidad = 0;

        if (first >= 0) {
            cantidad = last - first + 1;
        }

        return cantidad;
    }
}