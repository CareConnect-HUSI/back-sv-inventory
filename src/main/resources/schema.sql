CREATE TABLE IF NOT EXISTS Insumos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    cantidad VARCHAR(50) NOT NULL,
    fecha VARCHAR(50) NOT NULL,
    encargado_registro VARCHAR(255) NOT NULL
);


CREATE TABLE IF NOT EXISTS insumos_paciente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    paciente_id BIGINT NOT NULL,
    insumo_id BIGINT NOT NULL,
    cantidad VARCHAR(50) NOT NULL,
    fecha VARCHAR(50) NOT NULL,
    encargado_registro VARCHAR(255) NOT NULL
);
