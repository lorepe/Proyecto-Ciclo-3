--
-- Base de datos: `typicalfood`
--

CREATE DATABASE typicalfood;
USE typicalfood;

-- --------------------------------------------------------

--
-- Estructura de tabla `categoria`
--

CREATE TABLE
    `categoria` (
        `id` int(10) NOT NULL,
        `nombre` varchar(100) NOT NULL,
        `descripcion` varchar(255) DEFAULT NULL
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla `pedido`
--

CREATE TABLE
    `pedido` (
        `id` int(10) NOT NULL,
        `id_usuario` int(10) NOT NULL,
        `id_platillo` int(10) NOT NULL,
        `cantidad` tinyint(4) NOT NULL,
        `valor_total` decimal(10, 2) NOT NULL,
        `tipo_entrega` varchar(20) NOT NULL,
        `direccion` varchar(100) DEFAULT NULL,
        `estado` tinyint(4) NOT NULL
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla `platillo`
--

CREATE TABLE
    `platillo` (
        `id` int(10) NOT NULL,
        `id_restaurante` int(10) NOT NULL,
        `id_categoria` int(10) NOT NULL,
        `nombre_platillo` varchar(100) NOT NULL,
        `descripcion` varchar(255) DEFAULT NULL,
        `valor` double(10, 2) DEFAULT NULL,
        `imagen` varchar(255) DEFAULT NULL
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla `restaurante`

--

CREATE TABLE
    `restaurante` (
        `id` int(10) NOT NULL,
        `id_usuario` int(10) NOT NULL,
        `nombre_restaurante` varchar(150) NOT NULL,
        `direccion` varchar(100) NOT NULL,
        `departamento` varchar(100) NOT NULL,
        `municipio` varchar(100) NOT NULL,
        `telefono` varchar(10) DEFAULT NULL,
        `celular` varchar(10) NOT NULL,
        `imagen` varchar(255) DEFAULT NULL
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE
    `usuario` (
        `id` int(10) NOT NULL,
        `tipo_documento` varchar(100) NOT NULL,
        `documento` varchar(20) NOT NULL,
        `nombres` varchar(100) NOT NULL,
        `apellidos` varchar(100) NOT NULL,
        `email` varchar(100) NOT NULL,
        `celular` varchar(10) NOT NULL,
        `contrasena` varchar(255) NOT NULL,
        `rol` varchar(50) NOT NULL
    ) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

-- --------------------------------------------------------

--
-- Índices para tablas de typicalfood
--

-- --------------------------------------------------------

--
-- Indices de la tabla `categoria`
--

ALTER TABLE `categoria` ADD PRIMARY KEY (`id`);

-- --------------------------------------------------------

--
-- Indices de la tabla `pedido`
--

ALTER TABLE `pedido`
ADD PRIMARY KEY (`id`),
ADD
    KEY `FK_platillo_pedido` (`id_platillo`),
ADD
    KEY `FK_usuario_pedido` (`id_usuario`);

-- --------------------------------------------------------

--
-- Indices de la tabla `platillo`
--

ALTER TABLE `platillo`
ADD
    PRIMARY KEY (`id`) USING BTREE,
ADD
    KEY `FK_restaurante_platillo` (`id_restaurante`),
ADD
    KEY `FK_categoria_platillo` (`id_categoria`);

-- --------------------------------------------------------

--
-- Indices de la tabla `restaurante`
--

ALTER TABLE `restaurante`
ADD PRIMARY KEY (`id`),
ADD
    KEY `FK_usuario_restaurante` (`id_usuario`);

-- --------------------------------------------------------

--
-- Indices de la tabla `usuario`
--

ALTER TABLE `usuario` ADD PRIMARY KEY (`id`);

-- --------------------------------------------------------

--
-- AUTO_INCREMENT de las tablas typicalfood
--

-- --------------------------------------------------------

--
-- AUTO_INCREMENT de la tabla `categoria`
--

ALTER TABLE
    `categoria` MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

-- --------------------------------------------------------

--
-- AUTO_INCREMENT de la tabla `platillo`
--

ALTER TABLE `platillo` MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

-- --------------------------------------------------------

--
-- AUTO_INCREMENT de la tabla `restaurante`
--

ALTER TABLE
    `restaurante` MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

-- --------------------------------------------------------

--
-- AUTO_INCREMENT de la tabla `usuario`
--

ALTER TABLE `usuario` MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

-- --------------------------------------------------------

--
-- Foreign key para tablas typicalfood
--

-- --------------------------------------------------------

--
-- Foreign key para la tabla `pedido`
--

ALTER TABLE `pedido`
ADD
    CONSTRAINT `FK_platillo_pedido` FOREIGN KEY (`id_platillo`) REFERENCES `platillo` (`id`),
ADD
    CONSTRAINT `FK_usuario_pedido` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

-- --------------------------------------------------------

--
-- Foreign key para la tabla `platillo`
--

ALTER TABLE `platillo`
ADD
    CONSTRAINT `FK_categoria_platillo` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`),
ADD
    CONSTRAINT `FK_restaurante_platillo` FOREIGN KEY (`id_restaurante`) REFERENCES `restaurante` (`id`);

-- --------------------------------------------------------

--
-- Foreign key para la tabla `restaurante`
--

ALTER TABLE `restaurante`
ADD
    CONSTRAINT `FK_usuario_restaurante` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

-- --------------------------------------------------------

COMMIT;