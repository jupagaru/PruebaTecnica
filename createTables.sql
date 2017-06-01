CREATE TABLE Persona (id_persona   INTEGER       NOT NULL,
                      nombre       VARCHAR2(30)  NOT NULL,
                      apellido     VARCHAR2(30)  NOT NULL,
                      telefono     VARCHAR2(10)  NOT NULL,
                      id_direccion INTEGER       NOT NULL,
                      CONSTRAINT   pk_id_persona PRIMARY KEY (id_persona)
                     );
--
CREATE TABLE Direcciones (id_direccion  INTEGER       NOT NULL,
                          nom_direccion VARCHAR2(30)  NOT NULL,
                          id_ciudad     INTEGER       NOT NULL,
                          CONSTRAINT pk_id_direccion  PRIMARY KEY (id_direccion)
                          );
--
CREATE TABLE Domicilios (id_domicilio  INTEGER         NOT NULL,
                         id_persona    INTEGER         NOT NULL,
                         nom_persona   VARCHAR2 (30)   NOT NULL,
                         ape_persona   VARCHAR2 (30)   NOT NULL,
                         id_direccion  INTEGER         NOT NULL,
                         nom_direccion VARCHAR2 (30)   NOT NULL,
                         CONSTRAINT    pk_id_domicilio PRIMARY KEY (id_domicilio)
                         );
--
CREATE TABLE Ciudad (id_ciudad  INTEGER         NOT NULL,
                     nom_ciudad VARCHAR2 (30)   NOT NULL,
                     CONSTRAINT pk_id_ciudad    PRIMARY KEY (id_ciudad)
                     );
