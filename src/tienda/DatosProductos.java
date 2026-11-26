package tienda;

public class DatosProductos {

    public static Uno_ArregloProductos inventario = new Uno_ArregloProductos();
    public static Dos_MatrizInventario matriz = new Dos_MatrizInventario();
    public static Tres_ListaEnlazadaMovimientos listaMovimientos = new Tres_ListaEnlazadaMovimientos();
    public static Cuatro_ColaPrioridadSolicitudes colaPrioridad = new Cuatro_ColaPrioridadSolicitudes();
    public static Cinco_PilaOperaciones pila = new Cinco_PilaOperaciones();
    public static Seis_ABBProductos arbol = new Seis_ABBProductos();
    private static boolean inicializado = false;

    public static void datosIniciales() {
        if (!inicializado) {
            inicializado = true;

            Producto p1 = new Producto(101, "Arroz", "Abarrotes", 4.50, 50);
            Producto p2 = new Producto(102, "Leche", "Lácteos", 3.80, 30);
            Producto p3 = new Producto(103, "Azúcar", "Abarrotes", 3.20, 40);
            Producto p4 = new Producto(104, "Aceite", "Abarrotes", 9.90, 20);

            inventario.insertar(p1);
            inventario.insertar(p2);
            inventario.insertar(p3);
            inventario.insertar(p4);

            arbol.insertar(p1);
            arbol.insertar(p2);
            arbol.insertar(p3);
            arbol.insertar(p4);

            listaMovimientos.insertar(new Tres_RegistroMovimiento(1, "Compra", "Arroz al por mayor", 50, 4.00));
            listaMovimientos.insertar(new Tres_RegistroMovimiento(2, "Venta", "Leche a cliente", 5, 3.80));

            colaPrioridad.insertar(new Cuatro_SolicitudAtencion(1, "Reposición de leche", 2));
            colaPrioridad.insertar(new Cuatro_SolicitudAtencion(2, "Cliente con reclamo", 1));

            matriz.actualizar(0, 0, 20);
            matriz.actualizar(1, 2, 30);
        }
    }
    
    public static Producto buscarProducto(int codigo) {
        return inventario.buscarPorCodigo(codigo);
    }
}
