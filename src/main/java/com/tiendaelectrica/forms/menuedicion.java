/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tiendaelectrica.forms;
import com.tiendaelectrica.cruds.bodega.application.CreateBodegaUseCase;
import com.tiendaelectrica.cruds.bodega.domain.service.BodegaService;
import com.tiendaelectrica.cruds.bodega.infrastructure.in.BodegaController;
import com.tiendaelectrica.cruds.bodega.infrastructure.out.BodegaRepository;
import com.tiendaelectrica.cruds.categorias.application.CreateCategoriaUseCase;
import com.tiendaelectrica.cruds.categorias.domain.service.CategoriaService;
import com.tiendaelectrica.cruds.categorias.infrastructure.in.CategoriaController;
import com.tiendaelectrica.cruds.categorias.infrastructure.out.CategoriaRepository;
import com.tiendaelectrica.cruds.ciudad.application.CreateCiudadUseCase;
import com.tiendaelectrica.cruds.ciudad.domain.service.CiudadService;
import com.tiendaelectrica.cruds.ciudad.infrastructure.in.CiudadController;
import com.tiendaelectrica.cruds.ciudad.infrastructure.out.CiudadRepository;
import com.tiendaelectrica.cruds.clientes.application.CreateClientesUseCase;
import com.tiendaelectrica.cruds.clientes.domain.service.ClientesService;
import com.tiendaelectrica.cruds.clientes.infrastructure.in.ClientesController;
import com.tiendaelectrica.cruds.clientes.infrastructure.out.ClientesRepository;
import com.tiendaelectrica.cruds.compra.application.CreateCompraUseCase;
import com.tiendaelectrica.cruds.compra.domain.service.CompraService;
import com.tiendaelectrica.cruds.compra.infrastructure.in.CompraController;
import com.tiendaelectrica.cruds.compra.infrastructure.out.CompraRepository;
import com.tiendaelectrica.cruds.detallescompra.application.CreateDetallesCompraUseCase;
import com.tiendaelectrica.cruds.detallescompra.domain.service.DetallesCompraService;
import com.tiendaelectrica.cruds.detallescompra.infrastructure.in.DetallesCompraController;
import com.tiendaelectrica.cruds.detallescompra.infrastructure.out.DetallesCompraRepository;
import com.tiendaelectrica.cruds.detallespedidos.application.CreateDetallesPedidosUseCase;
import com.tiendaelectrica.cruds.detallespedidos.domain.service.DetallesPedidosService;
import com.tiendaelectrica.cruds.detallespedidos.infrastructure.in.DetallesPedidosController;
import com.tiendaelectrica.cruds.detallespedidos.infrastructure.out.DetallesPedidosRepository;
import com.tiendaelectrica.cruds.detallesventas.application.CreateDetallesVentasUseCase;
import com.tiendaelectrica.cruds.detallesventas.domain.service.DetallesVentasService;
import com.tiendaelectrica.cruds.detallesventas.infrastructure.in.DetallesVentasController;
import com.tiendaelectrica.cruds.detallesventas.infrastructure.out.DetallesVentasRepository;
import com.tiendaelectrica.cruds.direccioncliente.application.CreateDireccionUseCase;
import com.tiendaelectrica.cruds.direccioncliente.domain.service.DireccionService;
import com.tiendaelectrica.cruds.direccioncliente.infrastructure.in.DireccionController;
import com.tiendaelectrica.cruds.direccioncliente.infrastructure.out.DireccionRepository;
import com.tiendaelectrica.cruds.inventario.application.CreateInventarioUseCase;
import com.tiendaelectrica.cruds.inventario.domain.service.InventarioService;
import com.tiendaelectrica.cruds.inventario.infrastructure.in.InventarioController;
import com.tiendaelectrica.cruds.inventario.infrastructure.out.InventarioRepository;
import com.tiendaelectrica.cruds.pais.application.CreatePaisUseCase;
import com.tiendaelectrica.cruds.pais.domain.service.PaisService;
import com.tiendaelectrica.cruds.pais.infrastructure.in.PaisController;
import com.tiendaelectrica.cruds.pais.infrastructure.out.PaisRepository;
import com.tiendaelectrica.cruds.pedido.application.CreatePedidoUseCase;
import com.tiendaelectrica.cruds.pedido.domain.service.PedidoService;
import com.tiendaelectrica.cruds.pedido.infrastructure.in.PedidoController;
import com.tiendaelectrica.cruds.pedido.infrastructure.out.PedidoRepository;
import com.tiendaelectrica.cruds.productoproveedor.application.CreateProductoProveedorUseCase;
import com.tiendaelectrica.cruds.productoproveedor.domain.service.ProductoProveedorService;
import com.tiendaelectrica.cruds.productoproveedor.infrastructure.in.ProductoProveedorController;
import com.tiendaelectrica.cruds.productoproveedor.infrastructure.out.ProductoProveedorRepository;
import com.tiendaelectrica.cruds.productos.application.CreateProductosUseCase;
import com.tiendaelectrica.cruds.productos.domain.service.ProductosService;
import com.tiendaelectrica.cruds.productos.infrastructure.in.ProductosController;
import com.tiendaelectrica.cruds.productos.infrastructure.out.ProductosRepository;
import com.tiendaelectrica.cruds.proveedor.application.CreateProveedoresUseCase;
import com.tiendaelectrica.cruds.proveedor.domain.service.ProveedoresService;
import com.tiendaelectrica.cruds.proveedor.infrastructure.in.ProveedoresController;
import com.tiendaelectrica.cruds.proveedor.infrastructure.out.ProveedoresRepository;
import com.tiendaelectrica.cruds.sucursal.application.CreateSucursalUseCase;
import com.tiendaelectrica.cruds.sucursal.domain.service.SucursalService;
import com.tiendaelectrica.cruds.sucursal.infrastructure.in.SucursalController;
import com.tiendaelectrica.cruds.sucursal.infrastructure.out.SucursalRepository;
import com.tiendaelectrica.cruds.ventas.application.CreateVentaUseCase;
import com.tiendaelectrica.cruds.ventas.infrastructure.in.VentaController;
import com.tiendaelectrica.cruds.ventas.infrastructure.out.VentaRepository;
import com.tiendaelectrica.menuprincipal.menuprincipal;
/**
 *
 * @author camper
 */
public class menuedicion extends javax.swing.JFrame {

    /**
     * Creates new form menuedicion
     */
    public menuedicion() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        categorias = new javax.swing.JButton();
        proveedores = new javax.swing.JButton();
        ciudad = new javax.swing.JButton();
        bodega = new javax.swing.JButton();
        detallesventa = new javax.swing.JButton();
        sucursal = new javax.swing.JButton();
        paises = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        compra = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        pedidos = new javax.swing.JButton();
        direccioncliente = new javax.swing.JButton();
        productos = new javax.swing.JButton();
        detallescompra = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        detallespedidos = new javax.swing.JButton();
        productosproveedores = new javax.swing.JButton();
        regresarmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Modo de Edicion Avanzado");

        categorias.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        categorias.setForeground(new java.awt.Color(0, 153, 153));
        categorias.setText("Categorias");
        categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasActionPerformed(evt);
            }
        });

        proveedores.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        proveedores.setForeground(new java.awt.Color(0, 153, 153));
        proveedores.setText("Proveedores");
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });

        ciudad.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        ciudad.setForeground(new java.awt.Color(0, 153, 153));
        ciudad.setText("Ciudad");
        ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadActionPerformed(evt);
            }
        });

        bodega.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        bodega.setForeground(new java.awt.Color(0, 153, 153));
        bodega.setText("Bodega");
        bodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodegaActionPerformed(evt);
            }
        });

        detallesventa.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        detallesventa.setForeground(new java.awt.Color(0, 153, 153));
        detallesventa.setText("Detalles de Venta");
        detallesventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesventaActionPerformed(evt);
            }
        });

        sucursal.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        sucursal.setForeground(new java.awt.Color(0, 153, 153));
        sucursal.setText("Sucursal");
        sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalActionPerformed(evt);
            }
        });

        paises.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        paises.setForeground(new java.awt.Color(0, 153, 153));
        paises.setText("Paises");
        paises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisesActionPerformed(evt);
            }
        });

        clientes.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        clientes.setForeground(new java.awt.Color(0, 153, 153));
        clientes.setText("Clientes");
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });

        compra.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        compra.setForeground(new java.awt.Color(0, 153, 153));
        compra.setText("Compra");
        compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraActionPerformed(evt);
            }
        });

        inventario.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        inventario.setForeground(new java.awt.Color(0, 153, 153));
        inventario.setText("inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });

        pedidos.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        pedidos.setForeground(new java.awt.Color(0, 153, 153));
        pedidos.setText("Pedidos");
        pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosActionPerformed(evt);
            }
        });

        direccioncliente.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        direccioncliente.setForeground(new java.awt.Color(0, 153, 153));
        direccioncliente.setText("Direccion del Cliente");
        direccioncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionclienteActionPerformed(evt);
            }
        });

        productos.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        productos.setForeground(new java.awt.Color(0, 153, 153));
        productos.setText("Productos");
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });

        detallescompra.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        detallescompra.setForeground(new java.awt.Color(0, 153, 153));
        detallescompra.setText("Detalles de compra");
        detallescompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallescompraActionPerformed(evt);
            }
        });

        ventas.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        ventas.setForeground(new java.awt.Color(0, 153, 153));
        ventas.setText("Ventas");
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });

        detallespedidos.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        detallespedidos.setForeground(new java.awt.Color(0, 153, 153));
        detallespedidos.setText("Detalles de Pedidos");
        detallespedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallespedidosActionPerformed(evt);
            }
        });

        productosproveedores.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        productosproveedores.setForeground(new java.awt.Color(0, 153, 153));
        productosproveedores.setText("Productos Proveedores");
        productosproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosproveedoresActionPerformed(evt);
            }
        });

        regresarmenu.setFont(new java.awt.Font("Liberation Sans", 2, 24)); // NOI18N
        regresarmenu.setForeground(new java.awt.Color(153, 0, 51));
        regresarmenu.setText("Menu Principal");
        regresarmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(detallespedidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(compra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pedidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detallesventa, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detallescompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productosproveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(proveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regresarmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bodega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paises, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccioncliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detallespedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(compra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detallescompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ventas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detallesventa))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bodega)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ciudad))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(proveedores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productosproveedores)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(productos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inventario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paises)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sucursal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categorias)
                            .addComponent(clientes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regresarmenu)
                            .addComponent(direccioncliente))))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarmenuActionPerformed
        this.dispose();
        menuprincipal MenuPrincipal = new menuprincipal();
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_regresarmenuActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        VentaRepository ventaRepository = new VentaRepository();
        CreateVentaUseCase createVentaUseCase = new CreateVentaUseCase(ventaRepository);
        VentaController ventaController = new VentaController(createVentaUseCase, ventaRepository);
        ventaController.tabla_Ventas();
    }//GEN-LAST:event_ventasActionPerformed

    private void detallesventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesventaActionPerformed
        DetallesVentasRepository detallesVentasRepository = new DetallesVentasRepository();
        DetallesVentasService detallesVentasService = detallesVentasRepository;
        CreateDetallesVentasUseCase createDetallesVentasUseCase = new CreateDetallesVentasUseCase(detallesVentasService);
        DetallesVentasController detallesVentasController = new DetallesVentasController(createDetallesVentasUseCase,detallesVentasService);

        detallesVentasController.tabla_DetallesVentas();
    }//GEN-LAST:event_detallesventaActionPerformed

    private void bodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodegaActionPerformed
        BodegaService bodegaService = new BodegaRepository();
        CreateBodegaUseCase createBodegaUseCase = new CreateBodegaUseCase(bodegaService);
        BodegaController bodegaController = new BodegaController(createBodegaUseCase, bodegaService);
        bodegaController.tabla_Bodega();
    }//GEN-LAST:event_bodegaActionPerformed

    private void detallespedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallespedidosActionPerformed
        DetallesPedidosService detallesPedidosRepository = new DetallesPedidosRepository();
        CreateDetallesPedidosUseCase createDetallesPedidosUseCase = new CreateDetallesPedidosUseCase(detallesPedidosRepository);
        DetallesPedidosController detallesPedidosController = new DetallesPedidosController(createDetallesPedidosUseCase, detallesPedidosRepository);
        detallesPedidosController.tabla_DetallesPedidos();
    }//GEN-LAST:event_detallespedidosActionPerformed

    private void sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalActionPerformed
        SucursalService sucursalService = new SucursalRepository();
        CreateSucursalUseCase createSucursalUseCase = new CreateSucursalUseCase(sucursalService);
        SucursalController sucursalController = new SucursalController(createSucursalUseCase, sucursalService);
        sucursalController.tabla_Sucursal();
    }//GEN-LAST:event_sucursalActionPerformed

    private void productosproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosproveedoresActionPerformed
        ProductoProveedorService productoProveedorService = new ProductoProveedorRepository();
        CreateProductoProveedorUseCase createProductoProveedorUseCase = new CreateProductoProveedorUseCase(productoProveedorService);
        ProductoProveedorController productoProveedorController = new ProductoProveedorController(createProductoProveedorUseCase, productoProveedorService);
        productoProveedorController.tabla_ProductoProveedor();
    }//GEN-LAST:event_productosproveedoresActionPerformed

    private void categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasActionPerformed
        CategoriaService categoriaService = new CategoriaRepository(); 
        CreateCategoriaUseCase createCategoriaUseCase = new CreateCategoriaUseCase(categoriaService);
        CategoriaController categoriaController = new CategoriaController(createCategoriaUseCase, categoriaService);
        categoriaController.tabla_RespondeQuestion();
    }//GEN-LAST:event_categoriasActionPerformed

    private void detallescompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallescompraActionPerformed
        DetallesCompraService detallesCompraService = new DetallesCompraRepository();
        CreateDetallesCompraUseCase createDetallesCompraUseCase = new CreateDetallesCompraUseCase(detallesCompraService);
        DetallesCompraController detallesCompraController = new DetallesCompraController(createDetallesCompraUseCase,detallesCompraService);
        detallesCompraController.tabla_DetallesCompra(); 
    }//GEN-LAST:event_detallescompraActionPerformed

    private void paisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisesActionPerformed
        PaisService paisService = new PaisRepository();
        CreatePaisUseCase createPaisUseCase = new CreatePaisUseCase(paisService);
        PaisController paisController = new PaisController(createPaisUseCase);
        paisController.tabla_pais();
    }//GEN-LAST:event_paisesActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        ClientesService clientesService = new ClientesRepository();
        CreateClientesUseCase createClientesUseCase = new CreateClientesUseCase(clientesService);
        ClientesController clientesController = new ClientesController(createClientesUseCase, clientesService);
        clientesController.tabla_Clientes();
    }//GEN-LAST:event_clientesActionPerformed

    private void direccionclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionclienteActionPerformed
        DireccionService direccionService = new DireccionRepository();
        CreateDireccionUseCase createDireccionUseCase = new CreateDireccionUseCase(direccionService);
        DireccionController direccionController = new DireccionController(createDireccionUseCase);
        direccionController.tabla_direccioncliente();        
    }//GEN-LAST:event_direccionclienteActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
        ProveedoresService proveedoresService = new ProveedoresRepository();
        CreateProveedoresUseCase createProveedoresUseCase = new CreateProveedoresUseCase(proveedoresService);
        ProveedoresController proveedoresController = new ProveedoresController(createProveedoresUseCase,proveedoresService);
        proveedoresController.tabla_proveedor();
    }//GEN-LAST:event_proveedoresActionPerformed

    private void ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadActionPerformed
        CiudadService ciudadService = new CiudadRepository();
        CreateCiudadUseCase createCiudadUseCase = new CreateCiudadUseCase(ciudadService);
        CiudadController ciudadController = new CiudadController(createCiudadUseCase, ciudadService);
        ciudadController.tabla_Ciudad();
    }//GEN-LAST:event_ciudadActionPerformed

    private void compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraActionPerformed
        CompraService compraService = new CompraRepository();
        CreateCompraUseCase createCompraUseCase = new CreateCompraUseCase(compraService); 
        CompraController compraController = new CompraController(createCompraUseCase, compraService);
        compraController.tabla_Compra();
    }//GEN-LAST:event_compraActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        ProductosService productosService = new ProductosRepository(); 
        CreateProductosUseCase createProductosUseCase = new CreateProductosUseCase(productosService);
        ProductosController productosController = new ProductosController(createProductosUseCase, productosService);
        productosController.tabla_Productos();
    }//GEN-LAST:event_productosActionPerformed

    private void pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosActionPerformed
        PedidoService pedidoService = new PedidoRepository();
        CreatePedidoUseCase createPedidoUseCase = new CreatePedidoUseCase(pedidoService);
        PedidoController pedidoController = new PedidoController(createPedidoUseCase, pedidoService);
        pedidoController.tabla_Pedido();
    }//GEN-LAST:event_pedidosActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        InventarioService inventarioService = new InventarioRepository();
        CreateInventarioUseCase createInventarioUseCase = new CreateInventarioUseCase(inventarioService);
        InventarioController inventarioController = new InventarioController(createInventarioUseCase,inventarioService);
        inventarioController.tabla_Inventario();
    }//GEN-LAST:event_inventarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuedicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuedicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuedicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuedicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuedicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bodega;
    private javax.swing.JButton categorias;
    private javax.swing.JButton ciudad;
    private javax.swing.JButton clientes;
    private javax.swing.JButton compra;
    private javax.swing.JButton detallescompra;
    private javax.swing.JButton detallespedidos;
    private javax.swing.JButton detallesventa;
    private javax.swing.JButton direccioncliente;
    private javax.swing.JButton inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton paises;
    private javax.swing.JButton pedidos;
    private javax.swing.JButton productos;
    private javax.swing.JButton productosproveedores;
    private javax.swing.JButton proveedores;
    private javax.swing.JButton regresarmenu;
    private javax.swing.JButton sucursal;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
