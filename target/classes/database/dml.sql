-- **************************************** --
-- * INSERTS GENERADOS EN TIENDAELECTRICA * --
-- **************************************** --

-- Insertar datos en categorias
INSERT INTO categorias (id_categoria, nombre_categoria) VALUES
(1, 'Iluminación'),
(2, 'Electrodomésticos'),
(3, 'Herramientas Eléctricas'),
(4, 'Componentes Electrónicos');

-- Insertar datos en productos
INSERT INTO productos (id_producto, nombre_producto, descripcion_producto, precio_producto, id_categoria) VALUES
(1, 'Bombilla LED', 'Bombilla LED de alta eficiencia', 5.99, 1),
(2, 'Lámpara de Mesa', 'Lámpara de mesa con diseño moderno', 29.99, 1),
(3, 'Licuadora', 'Licuadora de alta potencia para cocina', 49.99, 2),
(4, 'Taladro Eléctrico', 'Taladro eléctrico de alta velocidad', 79.99, 3),
(5, 'Resistencia 1KΩ', 'Resistencia de 1KΩ para circuitos electrónicos', 0.99, 4),
(6, 'Condensador 10uF', 'Condensador de 10uF para circuitos electrónicos', 1.99, 4);

-- Insertar datos en inventario
INSERT INTO inventario (id_inventario, id_producto, cantidad_inventario, fecha_ultimo_ingreso, fecha_ultimo_egreso) VALUES
(1, 1, 100, '2022-01-01 00:00:00', NULL),
(2, 2, 50, '2022-01-15 00:00:00', NULL),
(3, 3, 20, '2022-02-01 00:00:00', NULL),
(4, 4, 30, '2022-03-01 00:00:00', NULL),
(5, 5, 500, '2022-01-01 00:00:00', NULL),
(6, 6, 200, '2022-02-15 00:00:00', NULL);

-- Insertar datos en clientes
INSERT INTO clientes (id_cliente, nombre_cliente, apellido_cliente, email_cliente, telefono_cliente, direccion_cliente) VALUES
(1, 'Juan', 'Pérez', 'jperez@example.com', '555-1234', 'Av. Principal 123'),
(2, 'María', 'Rodríguez', 'mrodriguez@example.com', '555-5678', 'Calle 2 #45'),
(3, 'Carlos', 'Gómez', 'cgomez@example.com', '555-9012', 'Av. Independencia 678');

-- Insertar datos en ventas
INSERT INTO ventas (id_venta, id_cliente, fecha_venta, total_venta) VALUES
(1, 1, '2022-01-20 00:00:00', 29.99),
(2, 2, '2022-02-10 00:00:00', 49.99),
(3, 3, '2022-03-15 00:00:00', 79.99);

-- Insertar datos en detalles_ventas
INSERT INTO detalles_ventas (id_detalle_venta, id_venta, id_producto, cantidad_detalle_venta, precio_detalle_venta) VALUES
(1, 1, 2, 1, 29.99),
(2, 2, 3, 1, 49.99),
(3, 3, 4, 1, 79.99);

-- Insertar datos en pedidos
INSERT INTO pedidos (id_pedido, id_cliente, fecha_pedido, estado_pedido) VALUES
(1, 1, '2022-01-25 00:00:00', 'Pendiente'),
(2, 2, '2022-02-20 00:00:00', 'En curso'),
(3, 3, '2022-03-20 00:00:00', 'Entregado');

-- Insertar datos en detalles_pedidos
INSERT INTO detalles_pedidos (id_detalle_pedido, id_pedido, id_producto, cantidad_detalle_pedido, precio_detalle_pedido) VALUES
(1, 1, 1, 2, 5.99),
(2, 2, 5, 10, 0.99),
(3, 3, 6, 5, 1.99);

-- Insertar datos en proveedores
INSERT INTO proveedores (id_proveedor, nombre_proveedor, direccion_proveedor, telefono_proveedor, email_proveedor)
VALUES
    (1, 'Proveedor 1', 'Calle 1, Ciudad 1', '1234567890', 'proveedor1@email.com'),
    (2, 'Proveedor 2', 'Calle 2, Ciudad 2', '9876543210', 'proveedor2@email.com'),
    (3, 'Proveedor 3', 'Calle 3, Ciudad 3', '5551234567', 'proveedor3@email.com');

-- Insertar datos en compras
INSERT INTO compras (id_compra, id_proveedor, fecha_compra, total_compra)
VALUES
    (1, 1, '2022-01-01 10:00:00', 1000.00),
    (2, 2, '2022-01-15 14:00:00', 500.00),
    (3, 3, '2022-02-01 12:00:00', 2000.00),
    (4, 1, '2022-03-01 11:00:00', 800.00);

-- Insertar datos en detalles de compras
INSERT INTO detalles_compras (id_detalle_compra, id_compra, id_producto, cantidad_detalle_compra, precio_detalle_compra)
VALUES
    (1, 1, 1, 10, 50.00),
    (2, 1, 2, 20, 25.00),
    (3, 2, 3, 5, 100.00),
    (4, 3, 1, 15, 60.00),
    (5, 4, 2, 30, 30.00);