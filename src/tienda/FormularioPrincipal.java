package tienda;

public class FormularioPrincipal extends javax.swing.JFrame {

    public FormularioPrincipal() {
        initComponents();
        DatosProductos.datosIniciales();

        areaProductos.setText(DatosProductos.inventario.mostrar());
        areaMovimientos.setText(DatosProductos.listaMovimientos.mostrar());
        areaCola.setText(DatosProductos.colaPrioridad.mostrar());
        areaArbolABB.setText("Recorrido inorden:\n" + DatosProductos.arbol.muestraValores(2));
        areaMatriz.setText(DatosProductos.matriz.mostrar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIntegrantes = new javax.swing.JLabel();
        tabsPrincipal = new javax.swing.JTabbedPane();
        Inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEmoji = new javax.swing.JLabel();
        Arreglo = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnActualizarPrecio = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaProductos = new javax.swing.JTextArea();
        btnActualizarStock = new javax.swing.JButton();
        ListaEnlazada = new javax.swing.JPanel();
        lblIdMovimiento = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblDetalle = new javax.swing.JLabel();
        lblCantidadMovimiento = new javax.swing.JLabel();
        lblPrecioUnitario = new javax.swing.JLabel();
        txtIdMovimiento = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtDetalle = new javax.swing.JTextField();
        txtCantidadMovimiento = new javax.swing.JTextField();
        txtPrecioUnitario = new javax.swing.JTextField();
        btnInsertarMovimiento = new javax.swing.JButton();
        btnActualizarMovimiento = new javax.swing.JButton();
        btnEliminarMovimiento = new javax.swing.JButton();
        btnMostrarMovimientos = new javax.swing.JButton();
        btnTotalMovimientos = new javax.swing.JButton();
        btnLimpiarMovimiento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMovimientos = new javax.swing.JTextArea();
        ColaPrioridad = new javax.swing.JPanel();
        lblIdSolicitud = new javax.swing.JLabel();
        lblDescripcionSolicitud = new javax.swing.JLabel();
        lblPrioridad = new javax.swing.JLabel();
        txtIdSolicitud = new javax.swing.JTextField();
        txtDescripcionSolicitud = new javax.swing.JTextField();
        txtPrioridad = new javax.swing.JTextField();
        btnRegistrarSolicitud = new javax.swing.JButton();
        btnAtenderSiguiente = new javax.swing.JButton();
        btnMostrarCola = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaCola = new javax.swing.JTextArea();
        Pila = new javax.swing.JPanel();
        btnActualizarPila = new javax.swing.JButton();
        btnDesapilarOperacion = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaPila = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtIdProductoPila = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProductoPila = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCostoProductoPila = new javax.swing.JTextField();
        ArbolABB = new javax.swing.JPanel();
        lblCodigoABB = new javax.swing.JLabel();
        lblNombreABB = new javax.swing.JLabel();
        lblCategoriaABB = new javax.swing.JLabel();
        lblPrecioABB = new javax.swing.JLabel();
        lblStockABB = new javax.swing.JLabel();
        txtCodigoABB = new javax.swing.JTextField();
        txtNombreABB = new javax.swing.JTextField();
        txtCategoriaABB = new javax.swing.JTextField();
        txtPrecioABB = new javax.swing.JTextField();
        txtStockABB = new javax.swing.JTextField();
        btnInsertarABB = new javax.swing.JButton();
        btnMostrarPreOrdenABB = new javax.swing.JButton();
        btnMostrarInOrdenABB = new javax.swing.JButton();
        btnMostrarPostOrdenABB = new javax.swing.JButton();
        lblBuscarNombreABB = new javax.swing.JLabel();
        txtBuscarNombreABB = new javax.swing.JTextField();
        btnBuscarSecuencialABB = new javax.swing.JButton();
        btnBuscarIndexadaABB = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        areaArbolABB = new javax.swing.JTextArea();
        Matriz = new javax.swing.JPanel();
        lblZona = new javax.swing.JLabel();
        lblEstante = new javax.swing.JLabel();
        lblCantidadUnidades = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        txtEstante = new javax.swing.JTextField();
        txtCantidadUnidades = new javax.swing.JTextField();
        btnActualizarCelda = new javax.swing.JButton();
        btnMostrarMatriz = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        areaMatriz = new javax.swing.JTextArea();
        IblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Productos y Ventas");

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblTitulo.setText("SISTEMA DE GESTIÓN DE PRODUCTOS Y VENTAS");

        lblIntegrantes.setFont(new java.awt.Font("Courier New", 1, 15)); // NOI18N
        lblIntegrantes.setText("Integrantes: [Josue Orbegoso] | [Patrick Quispe] | [Liliana Paredes] | [Gerardo Guerra] | [Claudio Flores] [Abel Muñoz]");

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(lblIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Seleccione una pestaña para ingresar a cada módulo del sistema.");

        lblEmoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda_imagenes/emoji.png"))); // NOI18N

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1))
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(lblEmoji)))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEmoji, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        tabsPrincipal.addTab("a) Inicio", Inicio);

        lblCodigo.setText("Código:");

        lblNombre.setText("Nombre:");

        lblCategoria.setText("Categoría:");

        lblPrecio.setText("Precio unitario (S/):");

        lblStock.setText("Stock:");

        txtCodigo.addActionListener(this::txtCodigoActionPerformed);

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(this::btnInsertarActionPerformed);

        btnEliminar.setText("Eliminar por código");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnMostrar.setText("Mostrar productos");
        btnMostrar.addActionListener(this::btnMostrarActionPerformed);

        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnActualizarPrecio.setText("Actualizar Precio");
        btnActualizarPrecio.addActionListener(this::btnActualizarPrecioActionPerformed);

        btnTotal.setText("Valor total del inventario");
        btnTotal.addActionListener(this::btnTotalActionPerformed);

        areaProductos.setEditable(false);
        areaProductos.setColumns(20);
        areaProductos.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        areaProductos.setLineWrap(true);
        areaProductos.setRows(5);
        areaProductos.setText("No hay productos registrados.");
        areaProductos.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaProductos);

        btnActualizarStock.setText("Actualizar Stock");
        btnActualizarStock.addActionListener(this::btnActualizarStockActionPerformed);

        javax.swing.GroupLayout ArregloLayout = new javax.swing.GroupLayout(Arreglo);
        Arreglo.setLayout(ArregloLayout);
        ArregloLayout.setHorizontalGroup(
            ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArregloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArregloLayout.createSequentialGroup()
                        .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                        .addGap(164, 164, 164)
                        .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ArregloLayout.createSequentialGroup()
                                .addComponent(btnActualizarPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                        .addGap(178, 178, 178)
                        .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)))
                    .addGroup(ArregloLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ArregloLayout.createSequentialGroup()
                        .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblPrecio)
                            .addComponent(lblCategoria)
                            .addComponent(lblStock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        ArregloLayout.setVerticalGroup(
            ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArregloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ArregloLayout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addGap(18, 18, 18))
                    .addGroup(ArregloLayout.createSequentialGroup()
                        .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(18, 18, 18)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addGap(18, 18, 18)
                .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStock))
                .addGap(18, 18, 18)
                .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizarPrecio)
                    .addComponent(btnActualizarStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(btnTotal)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        tabsPrincipal.addTab("b) Arreglo de objetos", Arreglo);

        lblIdMovimiento.setText("ID del movimiento:");

        lblTipo.setText("Tipo (Venta/Compra):");

        lblDetalle.setText("Detalle");

        lblCantidadMovimiento.setText("Cantidad:");

        lblPrecioUnitario.setText("Precio unitario (S/):");

        txtIdMovimiento.addActionListener(this::txtIdMovimientoActionPerformed);

        btnInsertarMovimiento.setText("Insertar");
        btnInsertarMovimiento.addActionListener(this::btnInsertarMovimientoActionPerformed);

        btnActualizarMovimiento.setText("Actualizar");
        btnActualizarMovimiento.addActionListener(this::btnActualizarMovimientoActionPerformed);

        btnEliminarMovimiento.setText("Eliminar por ID");
        btnEliminarMovimiento.addActionListener(this::btnEliminarMovimientoActionPerformed);

        btnMostrarMovimientos.setText("Mostrar lista");
        btnMostrarMovimientos.addActionListener(this::btnMostrarMovimientosActionPerformed);

        btnTotalMovimientos.setText("Total de movimientos");
        btnTotalMovimientos.addActionListener(this::btnTotalMovimientosActionPerformed);

        btnLimpiarMovimiento.setText("Limpiar campos");
        btnLimpiarMovimiento.addActionListener(this::btnLimpiarMovimientoActionPerformed);

        areaMovimientos.setEditable(false);
        areaMovimientos.setColumns(20);
        areaMovimientos.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        areaMovimientos.setLineWrap(true);
        areaMovimientos.setRows(5);
        areaMovimientos.setText("No hay movimientos registrados.");
        areaMovimientos.setWrapStyleWord(true);
        jScrollPane2.setViewportView(areaMovimientos);

        javax.swing.GroupLayout ListaEnlazadaLayout = new javax.swing.GroupLayout(ListaEnlazada);
        ListaEnlazada.setLayout(ListaEnlazadaLayout);
        ListaEnlazadaLayout.setHorizontalGroup(
            ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaEnlazadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListaEnlazadaLayout.createSequentialGroup()
                        .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListaEnlazadaLayout.createSequentialGroup()
                                .addComponent(lblIdMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14))
                            .addGroup(ListaEnlazadaLayout.createSequentialGroup()
                                .addComponent(lblDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(79, 79, 79))
                            .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ListaEnlazadaLayout.createSequentialGroup()
                                .addComponent(lblCantidadMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(64, 64, 64))
                            .addGroup(ListaEnlazadaLayout.createSequentialGroup()
                                .addComponent(lblPrecioUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)))
                        .addGap(489, 489, 489)
                        .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                            .addComponent(txtCantidadMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                            .addComponent(txtDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                            .addComponent(txtIdMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)))
                    .addGroup(ListaEnlazadaLayout.createSequentialGroup()
                        .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertarMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarMovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                        .addGap(164, 164, 164)
                        .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTotalMovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(btnActualizarMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(178, 178, 178)
                        .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarMovimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(btnEliminarMovimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        ListaEnlazadaLayout.setVerticalGroup(
            ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaEnlazadaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdMovimiento))
                .addGap(18, 18, 18)
                .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addGap(18, 18, 18)
                .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDetalle))
                .addGap(14, 14, 14)
                .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadMovimiento))
                .addGap(18, 18, 18)
                .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioUnitario))
                .addGap(18, 18, 18)
                .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarMovimiento)
                    .addComponent(btnEliminarMovimiento)
                    .addComponent(btnActualizarMovimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ListaEnlazadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarMovimientos)
                    .addComponent(btnTotalMovimientos)
                    .addComponent(btnLimpiarMovimiento))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        tabsPrincipal.addTab("c) Lista enlazada", ListaEnlazada);

        lblIdSolicitud.setText("ID de solicitud:");

        lblDescripcionSolicitud.setText("Descripción:");

        lblPrioridad.setText("Prioridad (1 alta, 2 baja):");

        txtIdSolicitud.addActionListener(this::txtIdSolicitudActionPerformed);

        txtDescripcionSolicitud.addActionListener(this::txtDescripcionSolicitudActionPerformed);

        txtPrioridad.addActionListener(this::txtPrioridadActionPerformed);

        btnRegistrarSolicitud.setText("Registrar solicitud");
        btnRegistrarSolicitud.addActionListener(this::btnRegistrarSolicitudActionPerformed);

        btnAtenderSiguiente.setText("Atender siguiente");
        btnAtenderSiguiente.addActionListener(this::btnAtenderSiguienteActionPerformed);

        btnMostrarCola.setText("Mostrar cola");
        btnMostrarCola.addActionListener(this::btnMostrarColaActionPerformed);

        areaCola.setEditable(false);
        areaCola.setColumns(20);
        areaCola.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        areaCola.setLineWrap(true);
        areaCola.setRows(5);
        areaCola.setText("No hay solicitudes registradas.");
        areaCola.setWrapStyleWord(true);
        jScrollPane3.setViewportView(areaCola);

        javax.swing.GroupLayout ColaPrioridadLayout = new javax.swing.GroupLayout(ColaPrioridad);
        ColaPrioridad.setLayout(ColaPrioridadLayout);
        ColaPrioridadLayout.setHorizontalGroup(
            ColaPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColaPrioridadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ColaPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ColaPrioridadLayout.createSequentialGroup()
                        .addGroup(ColaPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ColaPrioridadLayout.createSequentialGroup()
                                .addComponent(lblIdSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(97, 97, 97))
                            .addComponent(lblPrioridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ColaPrioridadLayout.createSequentialGroup()
                                .addComponent(lblDescripcionSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(110, 110, 110)))
                        .addGap(429, 429, 429)
                        .addGroup(ColaPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdSolicitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                            .addComponent(txtDescripcionSolicitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                            .addComponent(txtPrioridad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColaPrioridadLayout.createSequentialGroup()
                        .addComponent(btnRegistrarSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addGap(164, 164, 164)
                        .addComponent(btnAtenderSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                        .addGap(178, 178, 178)
                        .addComponent(btnMostrarCola, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        ColaPrioridadLayout.setVerticalGroup(
            ColaPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColaPrioridadLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ColaPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ColaPrioridadLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblIdSolicitud))
                    .addComponent(txtIdSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColaPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ColaPrioridadLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblDescripcionSolicitud))
                    .addComponent(txtDescripcionSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ColaPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ColaPrioridadLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPrioridad))
                    .addComponent(txtPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ColaPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarSolicitud)
                    .addComponent(btnMostrarCola)
                    .addComponent(btnAtenderSiguiente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabsPrincipal.addTab("d) Cola de prioridad", ColaPrioridad);

        btnActualizarPila.setText("Actualizar contenido de la pila");
        btnActualizarPila.addActionListener(this::btnActualizarPilaActionPerformed);

        btnDesapilarOperacion.setText("Desapilar última operación");
        btnDesapilarOperacion.addActionListener(this::btnDesapilarOperacionActionPerformed);

        areaPila.setEditable(false);
        areaPila.setColumns(20);
        areaPila.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        areaPila.setLineWrap(true);
        areaPila.setRows(5);
        areaPila.setText("La pila está vacía.");
        areaPila.setWrapStyleWord(true);
        jScrollPane4.setViewportView(areaPila);

        jLabel2.setText("ID del Producto:");

        txtIdProductoPila.addActionListener(this::txtIdProductoPilaActionPerformed);

        jLabel3.setText("Nombre del Producto:");

        txtNombreProductoPila.addActionListener(this::txtNombreProductoPilaActionPerformed);

        jLabel4.setText("Costo del Producto:");

        txtCostoProductoPila.addActionListener(this::txtCostoProductoPilaActionPerformed);

        javax.swing.GroupLayout PilaLayout = new javax.swing.GroupLayout(Pila);
        Pila.setLayout(PilaLayout);
        PilaLayout.setHorizontalGroup(
            PilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PilaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161)
                .addGroup(PilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdProductoPila, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtNombreProductoPila)
                    .addComponent(txtCostoProductoPila))
                .addGap(132, 132, 132)
                .addGroup(PilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizarPila)
                    .addComponent(btnDesapilarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(492, Short.MAX_VALUE))
            .addGroup(PilaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addGap(100, 100, 100))
        );
        PilaLayout.setVerticalGroup(
            PilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PilaLayout.createSequentialGroup()
                .addGroup(PilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PilaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(PilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdProductoPila))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProductoPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCostoProductoPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE))
                    .addGroup(PilaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnActualizarPila, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDesapilarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabsPrincipal.addTab("e) Pila", Pila);

        lblCodigoABB.setText("Código:");

        lblNombreABB.setText("Nombre (clave del ABB):");

        lblCategoriaABB.setText("Categoria:");

        lblPrecioABB.setText("Precio unitario (S/):");

        lblStockABB.setText("Stock:");

        txtCodigoABB.addActionListener(this::txtCodigoABBActionPerformed);

        btnInsertarABB.setText("Insertar producto");
        btnInsertarABB.addActionListener(this::btnInsertarABBActionPerformed);

        btnMostrarPreOrdenABB.setText("Mostrar preorden");
        btnMostrarPreOrdenABB.addActionListener(this::btnMostrarPreOrdenABBActionPerformed);

        btnMostrarInOrdenABB.setText("Mostrar inorden");
        btnMostrarInOrdenABB.addActionListener(this::btnMostrarInOrdenABBActionPerformed);

        btnMostrarPostOrdenABB.setText("Mostrar postorden");
        btnMostrarPostOrdenABB.addActionListener(this::btnMostrarPostOrdenABBActionPerformed);

        lblBuscarNombreABB.setText("Nombre a buscar:");

        txtBuscarNombreABB.addActionListener(this::txtBuscarNombreABBActionPerformed);

        btnBuscarSecuencialABB.setText("Búsqueda secuencial");
        btnBuscarSecuencialABB.addActionListener(this::btnBuscarSecuencialABBActionPerformed);

        btnBuscarIndexadaABB.setText("Búsqueda indexada (ABB)");
        btnBuscarIndexadaABB.addActionListener(this::btnBuscarIndexadaABBActionPerformed);

        areaArbolABB.setEditable(false);
        areaArbolABB.setColumns(20);
        areaArbolABB.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        areaArbolABB.setLineWrap(true);
        areaArbolABB.setRows(5);
        areaArbolABB.setText("El árbol está vacío.");
        areaArbolABB.setWrapStyleWord(true);
        jScrollPane6.setViewportView(areaArbolABB);

        javax.swing.GroupLayout ArbolABBLayout = new javax.swing.GroupLayout(ArbolABB);
        ArbolABB.setLayout(ArbolABBLayout);
        ArbolABBLayout.setHorizontalGroup(
            ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArbolABBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArbolABBLayout.createSequentialGroup()
                        .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ArbolABBLayout.createSequentialGroup()
                                .addComponent(lblCodigoABB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14))
                            .addGroup(ArbolABBLayout.createSequentialGroup()
                                .addComponent(lblCategoriaABB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(79, 79, 79))
                            .addComponent(lblNombreABB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ArbolABBLayout.createSequentialGroup()
                                .addComponent(lblPrecioABB, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addGap(64, 64, 64))
                            .addGroup(ArbolABBLayout.createSequentialGroup()
                                .addComponent(lblStockABB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)))
                        .addGap(489, 489, 489)
                        .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStockABB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                            .addComponent(txtPrecioABB, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                            .addComponent(txtCategoriaABB, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                            .addComponent(txtNombreABB, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                            .addComponent(txtCodigoABB, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)))
                    .addComponent(btnInsertarABB, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
                    .addGroup(ArbolABBLayout.createSequentialGroup()
                        .addComponent(btnMostrarPreOrdenABB, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                        .addGap(164, 164, 164)
                        .addComponent(btnMostrarInOrdenABB, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addGap(178, 178, 178)
                        .addComponent(btnMostrarPostOrdenABB, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                    .addGroup(ArbolABBLayout.createSequentialGroup()
                        .addComponent(lblBuscarNombreABB, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarNombreABB, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ArbolABBLayout.createSequentialGroup()
                        .addComponent(btnBuscarSecuencialABB, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBuscarIndexadaABB, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ArbolABBLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1352, Short.MAX_VALUE)))
        );
        ArbolABBLayout.setVerticalGroup(
            ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArbolABBLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoABB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoABB))
                .addGap(18, 18, 18)
                .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreABB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreABB))
                .addGap(18, 18, 18)
                .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoriaABB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoriaABB))
                .addGap(14, 14, 14)
                .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioABB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioABB))
                .addGap(18, 18, 18)
                .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockABB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStockABB))
                .addGap(18, 18, 18)
                .addComponent(btnInsertarABB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarPreOrdenABB)
                    .addComponent(btnMostrarPostOrdenABB)
                    .addComponent(btnMostrarInOrdenABB))
                .addGap(18, 18, 18)
                .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarNombreABB)
                    .addComponent(lblBuscarNombreABB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarIndexadaABB)
                    .addComponent(btnBuscarSecuencialABB))
                .addContainerGap(436, Short.MAX_VALUE))
            .addGroup(ArbolABBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArbolABBLayout.createSequentialGroup()
                    .addGap(397, 397, 397)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        tabsPrincipal.addTab("f) Árbol ABB", ArbolABB);

        lblZona.setText("Zona (1 a 3):");

        lblEstante.setText("Estante (1 a 4):");

        lblCantidadUnidades.setText("Cantidad de unidades:");

        txtZona.addActionListener(this::txtZonaActionPerformed);

        btnActualizarCelda.setText("Actualizar celda de la matriz");
        btnActualizarCelda.addActionListener(this::btnActualizarCeldaActionPerformed);

        btnMostrarMatriz.setText("Mostrar matriz");
        btnMostrarMatriz.addActionListener(this::btnMostrarMatrizActionPerformed);

        areaMatriz.setEditable(false);
        areaMatriz.setColumns(20);
        areaMatriz.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        areaMatriz.setLineWrap(true);
        areaMatriz.setRows(5);
        areaMatriz.setText("Unidades por zona y estante:\nEstantes: [1, 2, 3, 4]\nZona 1: [0, 0, 0, 0]\nZona 2: [0, 0, 0, 0]\nZona 3: [0, 0, 0, 0]");
        areaMatriz.setWrapStyleWord(true);
        jScrollPane5.setViewportView(areaMatriz);

        javax.swing.GroupLayout MatrizLayout = new javax.swing.GroupLayout(Matriz);
        Matriz.setLayout(MatrizLayout);
        MatrizLayout.setHorizontalGroup(
            MatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatrizLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatrizLayout.createSequentialGroup()
                        .addGroup(MatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MatrizLayout.createSequentialGroup()
                                .addComponent(lblZona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(97, 97, 97))
                            .addComponent(lblCantidadUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MatrizLayout.createSequentialGroup()
                                .addComponent(lblEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(110, 110, 110)))
                        .addGap(429, 429, 429)
                        .addGroup(MatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                            .addComponent(txtEstante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                            .addComponent(txtCantidadUnidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)))
                    .addGroup(MatrizLayout.createSequentialGroup()
                        .addComponent(btnActualizarCelda, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(btnMostrarMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        MatrizLayout.setVerticalGroup(
            MatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatrizLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatrizLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblZona))
                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatrizLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblEstante))
                    .addComponent(txtEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatrizLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCantidadUnidades))
                    .addComponent(txtCantidadUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarMatriz)
                    .addComponent(btnActualizarCelda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsPrincipal.addTab("Matriz", Matriz);

        IblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tienda_imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabsPrincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(IblLogo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IblLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabsPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            String nombre = txtNombre.getText().trim();
            String categoria = txtCategoria.getText().trim();
            double precio = Double.parseDouble(txtPrecio.getText().trim());
            int stock = Integer.parseInt(txtStock.getText().trim());

            if (nombre.equals("") || categoria.equals("") || precio < 0 || stock < 0) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Complete los campos. Precio y stock no pueden ser negativos.");
                return;
            } 
            if (DatosProductos.buscarProducto(codigo) != null) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "El codigo ya existe.");
                return;
            }

            Producto producto = new Producto(codigo, nombre, categoria, precio, stock);

            if (DatosProductos.inventario.insertar(producto)) {
                DatosProductos.pila.apilar("Se insertó el producto " + nombre + " (código " + codigo + ").");
                areaProductos.setText(DatosProductos.inventario.mostrar());
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Producto insertado correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No se pudo insertar. Revise el código y el espacio disponible.");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Código, precio y stock deben ser valores numéricos.");
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPrecioActionPerformed

        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            double precio = Double.parseDouble(txtPrecio.getText().trim());

            if (DatosProductos.inventario.actualizar(codigo, precio)) {
                DatosProductos.pila.apilar("Se actualizó el producto con código " + codigo + ".");
                areaProductos.setText(DatosProductos.inventario.mostrar());
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Producto actualizado correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No se actualizó. Compruebe el código y los datos ingresados.");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese código, precio y stock con valores numéricos válidos.");
        }
    }//GEN-LAST:event_btnActualizarPrecioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try {
            int codigo = Integer.parseInt(txtCodigo.getText().trim());

            if (DatosProductos.inventario.eliminar(codigo)) {
                DatosProductos.pila.apilar("Se eliminó el producto con código " + codigo + ".");
                areaProductos.setText(DatosProductos.inventario.mostrar());
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Producto eliminado correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No existe un producto con ese código.");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese el código del producto que desea eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        areaProductos.setText(DatosProductos.inventario.mostrar());
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        double total = DatosProductos.inventario.calcularValorTotal();
        areaProductos.setText("Valor total del inventario: S/ " + total);
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCategoria.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtIdMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMovimientoActionPerformed

    private void btnInsertarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarMovimientoActionPerformed
        try {
            int id = Integer.parseInt(txtIdMovimiento.getText().trim());
            String tipo = txtTipo.getText().trim();
            String detalle = txtDetalle.getText().trim();
            int cantidad = Integer.parseInt(txtCantidadMovimiento.getText().trim());
            double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText().trim());

            if (tipo.equals("") || detalle.equals("")
                    || cantidad < 0 || precioUnitario < 0) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Complete los campos. Cantidad y precio no pueden ser negativos.");
                return;
            }

            Tres_RegistroMovimiento movimiento = new Tres_RegistroMovimiento(
                    id, tipo, detalle, cantidad, precioUnitario);

            if (DatosProductos.listaMovimientos.insertar(movimiento)) {
                // pila.apilar("Se insertó el movimiento con ID " + id + ".");
                areaMovimientos.setText(DatosProductos.listaMovimientos.mostrar());
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Movimiento insertado correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No se pudo insertar. Verifique que el ID no esté repetido.");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "ID, cantidad y precio deben ser valores numéricos.");
        }
    }//GEN-LAST:event_btnInsertarMovimientoActionPerformed

    private void btnActualizarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMovimientoActionPerformed

        try {
            int id = Integer.parseInt(txtIdMovimiento.getText().trim());
            String tipo = txtTipo.getText().trim();
            String detalle = txtDetalle.getText().trim();
            int cantidad = Integer.parseInt(txtCantidadMovimiento.getText().trim());
            double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText().trim());

            if (DatosProductos.listaMovimientos.actualizar(
                    id, tipo, detalle, cantidad, precioUnitario)) {
                // pila.apilar("Se actualizó el movimiento con ID " + id + ".");
                areaMovimientos.setText(DatosProductos.listaMovimientos.mostrar());
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Movimiento actualizado correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No se actualizó. Compruebe el ID y los datos ingresados.");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "ID, cantidad y precio deben ser valores numéricos.");
        }

    }//GEN-LAST:event_btnActualizarMovimientoActionPerformed

    private void btnEliminarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMovimientoActionPerformed

        try {
            int id = Integer.parseInt(txtIdMovimiento.getText().trim());

            if (DatosProductos.listaMovimientos.eliminar(id)) {
                // pila.apilar("Se eliminó el movimiento con ID " + id + ".");
                areaMovimientos.setText(DatosProductos.listaMovimientos.mostrar());
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Movimiento eliminado correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No existe un movimiento con ese ID.");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese un ID numérico válido.");
        }

    }//GEN-LAST:event_btnEliminarMovimientoActionPerformed

    private void btnMostrarMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMovimientosActionPerformed
        areaMovimientos.setText(DatosProductos.listaMovimientos.mostrar());
    }//GEN-LAST:event_btnMostrarMovimientosActionPerformed

    private void btnTotalMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalMovimientosActionPerformed
        double total = DatosProductos.listaMovimientos.calcularTotal();
        areaMovimientos.setText("Total de movimientos: S/ " + total);
    }//GEN-LAST:event_btnTotalMovimientosActionPerformed

    private void btnLimpiarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarMovimientoActionPerformed
        txtIdMovimiento.setText("");
        txtTipo.setText("");
        txtDetalle.setText("");
        txtCantidadMovimiento.setText("");
        txtPrecioUnitario.setText("");
        txtIdMovimiento.requestFocus();
    }//GEN-LAST:event_btnLimpiarMovimientoActionPerformed

    private void txtIdSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSolicitudActionPerformed

    private void btnRegistrarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSolicitudActionPerformed

        try {
            int id = Integer.parseInt(txtIdSolicitud.getText().trim());
            String descripcion = txtDescripcionSolicitud.getText().trim();
            int prioridad = Integer.parseInt(txtPrioridad.getText().trim());

            if (descripcion.equals("") || prioridad < 1 || prioridad > 2) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Ingrese una descripción y una prioridad: 1 (alta) o 2 (baja).");
                return;
            }

            Cuatro_SolicitudAtencion solicitud = new Cuatro_SolicitudAtencion(id, descripcion, prioridad);

            if (DatosProductos.colaPrioridad.insertar(solicitud)) {
                // pila.apilar("Se registró la solicitud " + id + " con prioridad " + prioridad + ".");
                areaCola.setText(DatosProductos.colaPrioridad.mostrar());
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Solicitud registrada correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No se pudo registrar. Verifique que el ID no esté repetido.");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El ID y la prioridad deben ser valores numéricos.");
        }
    }//GEN-LAST:event_btnRegistrarSolicitudActionPerformed

    private void btnAtenderSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderSiguienteActionPerformed
        Cuatro_SolicitudAtencion atendida = DatosProductos.colaPrioridad.atender();

        if (atendida != null) {
            // pila.apilar("Se atendió la solicitud " + atendida.getId() + ".");
            areaCola.setText(DatosProductos.colaPrioridad.mostrar());
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Solicitud atendida:\n" + atendida.toString());
        } else {
            areaCola.setText(DatosProductos.colaPrioridad.mostrar());
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No hay solicitudes pendientes.");
        }
    }//GEN-LAST:event_btnAtenderSiguienteActionPerformed

    private void btnMostrarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarColaActionPerformed
        areaCola.setText(DatosProductos.colaPrioridad.mostrar());
    }//GEN-LAST:event_btnMostrarColaActionPerformed

    private void btnActualizarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPilaActionPerformed
        String id = txtIdProductoPila.getText().trim();
        String nombre = txtNombreProductoPila.getText().trim();
        String costo = txtCostoProductoPila.getText().trim();

        if (id.equals("") || nombre.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese el ID y presione Enter para ver el producto.");
            return;
        }

        if (DatosProductos.pila.apilar("Producto ID " + id + " - " + nombre + " - S/ " + costo)) {
            areaPila.setText(DatosProductos.pila.mostrar());
            txtIdProductoPila.setText("");
            txtNombreProductoPila.setText("");
            txtCostoProductoPila.setText("");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No se pudo apilar. La pila está llena.");
        }
    }//GEN-LAST:event_btnActualizarPilaActionPerformed

    private void btnDesapilarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesapilarOperacionActionPerformed
        String operacion = DatosProductos.pila.desapilar();

        if (operacion != null) {
            areaPila.setText(DatosProductos.pila.mostrar());
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Operación retirada:\n" + operacion);
        } else {
            areaPila.setText(DatosProductos.pila.mostrar());
            javax.swing.JOptionPane.showMessageDialog(this,
                    "La pila está vacía.");
        }
    }//GEN-LAST:event_btnDesapilarOperacionActionPerformed

    private void txtZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZonaActionPerformed

    private void btnActualizarCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCeldaActionPerformed

        try {
            int zona = Integer.parseInt(txtZona.getText().trim());
            int estante = Integer.parseInt(txtEstante.getText().trim());
            int cantidad = Integer.parseInt(txtCantidadUnidades.getText().trim());

            if (DatosProductos.matriz.actualizar(zona - 1, estante - 1, cantidad)) {
                DatosProductos.pila.apilar("Se actualizaron " + cantidad + " unidades en zona "
                        + zona + ", estante " + estante + ".");
                areaMatriz.setText(DatosProductos.matriz.mostrar());
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Celda de la matriz actualizada.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Ingrese zona del 1 al 3, estante del 1 al 4 y una cantidad no negativa.");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Zona, estante y cantidad deben ser números enteros.");
        }
    }//GEN-LAST:event_btnActualizarCeldaActionPerformed

    private void btnMostrarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMatrizActionPerformed
        areaMatriz.setText(DatosProductos.matriz.mostrar());
    }//GEN-LAST:event_btnMostrarMatrizActionPerformed

    private void txtCodigoABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoABBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoABBActionPerformed

    private void btnInsertarABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarABBActionPerformed
        try {
            int codigo = Integer.parseInt(txtCodigoABB.getText().trim());
            String nombre = txtNombreABB.getText().trim();
            String categoria = txtCategoriaABB.getText().trim();
            double precio = Double.parseDouble(txtPrecioABB.getText().trim());
            int stock = Integer.parseInt(txtStockABB.getText().trim());

            if (nombre.equals("") || categoria.equals("") || precio < 0 || stock < 0) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Completa los campos. Precio y stock no pueden ser negativos.");
                return;
            }

            Producto producto = new Producto(codigo, nombre, categoria, precio, stock);
            DatosProductos.arbol.insertar(producto);

            areaArbolABB.setText(DatosProductos.arbol.muestraValores(2));

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Producto insertado correctamente.");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Código, precio y stock deben ser valores numéricos.");
        }
    }//GEN-LAST:event_btnInsertarABBActionPerformed

    private void btnMostrarPreOrdenABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPreOrdenABBActionPerformed
        String cadena = DatosProductos.arbol.muestraValores(1);

        if (cadena.equals("")) {
            cadena = "El árbol está vacío.";
        }

        areaArbolABB.setText("Recorrido preorden:\n" + cadena);
    }//GEN-LAST:event_btnMostrarPreOrdenABBActionPerformed

    private void btnMostrarInOrdenABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInOrdenABBActionPerformed
        String cadena = DatosProductos.arbol.muestraValores(2);

        if (cadena.equals("")) {
            cadena = "El árbol está vacío.";
        }

        areaArbolABB.setText("Recorrido inorden:\n" + cadena);
    }//GEN-LAST:event_btnMostrarInOrdenABBActionPerformed

    private void btnMostrarPostOrdenABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPostOrdenABBActionPerformed
        String cadena = DatosProductos.arbol.muestraValores(3);

        if (cadena.equals("")) {
            cadena = "El árbol está vacío.";
        }

        areaArbolABB.setText("Recorrido postorden:\n" + cadena);
    }//GEN-LAST:event_btnMostrarPostOrdenABBActionPerformed

    private void txtBuscarNombreABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreABBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreABBActionPerformed

    private void btnBuscarSecuencialABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSecuencialABBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarSecuencialABBActionPerformed

    private void btnBuscarIndexadaABBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIndexadaABBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarIndexadaABBActionPerformed

    private void txtPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrioridadActionPerformed

    private void txtDescripcionSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionSolicitudActionPerformed

    private void txtIdProductoPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoPilaActionPerformed
        try {
            int id = Integer.parseInt(txtIdProductoPila.getText().trim());
            Producto p = DatosProductos.buscarProducto(id);

            if (p == null) {
                txtNombreProductoPila.setText("");
                txtCostoProductoPila.setText("");
                javax.swing.JOptionPane.showMessageDialog(this, "No existe un producto con ese ID.");
            } else {
                txtNombreProductoPila.setText(p.getNombre());
                txtCostoProductoPila.setText(String.format("%.2f", p.getPrecio()));
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "El ID debe ser numérico.");
        }
    }//GEN-LAST:event_txtIdProductoPilaActionPerformed

    private void txtNombreProductoPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoPilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoPilaActionPerformed

    private void txtCostoProductoPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoProductoPilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoProductoPilaActionPerformed

    private void btnActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarStockActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormularioPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ArbolABB;
    private javax.swing.JPanel Arreglo;
    private javax.swing.JPanel ColaPrioridad;
    private javax.swing.JLabel IblLogo;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel ListaEnlazada;
    private javax.swing.JPanel Matriz;
    private javax.swing.JPanel Pila;
    private javax.swing.JTextArea areaArbolABB;
    private javax.swing.JTextArea areaCola;
    private javax.swing.JTextArea areaMatriz;
    private javax.swing.JTextArea areaMovimientos;
    private javax.swing.JTextArea areaPila;
    private javax.swing.JTextArea areaProductos;
    private javax.swing.JButton btnActualizarCelda;
    private javax.swing.JButton btnActualizarMovimiento;
    private javax.swing.JButton btnActualizarPila;
    private javax.swing.JButton btnActualizarPrecio;
    private javax.swing.JButton btnActualizarStock;
    private javax.swing.JButton btnAtenderSiguiente;
    private javax.swing.JButton btnBuscarIndexadaABB;
    private javax.swing.JButton btnBuscarSecuencialABB;
    private javax.swing.JButton btnDesapilarOperacion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarMovimiento;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnInsertarABB;
    private javax.swing.JButton btnInsertarMovimiento;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarMovimiento;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarCola;
    private javax.swing.JButton btnMostrarInOrdenABB;
    private javax.swing.JButton btnMostrarMatriz;
    private javax.swing.JButton btnMostrarMovimientos;
    private javax.swing.JButton btnMostrarPostOrdenABB;
    private javax.swing.JButton btnMostrarPreOrdenABB;
    private javax.swing.JButton btnRegistrarSolicitud;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnTotalMovimientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblBuscarNombreABB;
    private javax.swing.JLabel lblCantidadMovimiento;
    private javax.swing.JLabel lblCantidadUnidades;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoriaABB;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoABB;
    private javax.swing.JLabel lblDescripcionSolicitud;
    private javax.swing.JLabel lblDetalle;
    private javax.swing.JLabel lblEmoji;
    private javax.swing.JLabel lblEstante;
    private javax.swing.JLabel lblIdMovimiento;
    private javax.swing.JLabel lblIdSolicitud;
    private javax.swing.JLabel lblIntegrantes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreABB;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioABB;
    private javax.swing.JLabel lblPrecioUnitario;
    private javax.swing.JLabel lblPrioridad;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblStockABB;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblZona;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JTabbedPane tabsPrincipal;
    private javax.swing.JTextField txtBuscarNombreABB;
    private javax.swing.JTextField txtCantidadMovimiento;
    private javax.swing.JTextField txtCantidadUnidades;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCategoriaABB;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoABB;
    private javax.swing.JTextField txtCostoProductoPila;
    private javax.swing.JTextField txtDescripcionSolicitud;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtEstante;
    private javax.swing.JTextField txtIdMovimiento;
    private javax.swing.JTextField txtIdProductoPila;
    private javax.swing.JTextField txtIdSolicitud;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreABB;
    private javax.swing.JTextField txtNombreProductoPila;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioABB;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtPrioridad;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtStockABB;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
}
