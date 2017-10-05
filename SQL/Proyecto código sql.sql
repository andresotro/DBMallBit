create database proyecto;
use proyecto;

create table cliente(
    IDCliente int(11) not null auto_increment, 
    Nombre varchar(50) not null, 
    Apellido varchar(50) not null,
    FechaNacimiento date not null, 
    Correo varchar(100) not null, 
    Identificacion bigint(11) not null unique, 
    IDGenero int(11), 
    Telefono bigint(10) not null, 
    Usuario varchar(50) not null, 
    Password varchar(50), 
    Primary Key(IDCliente)
);
create table genero(
    IDGenero int(11) not null, 
    Tipo varchar(100) not null, 
    Primary Key(IDGenero)
);
create table compra(
    IDCompra int(11) not null, 
    IDPago int(11), 
    IDCliente int(11),
    IDProducto int(11), 
    Primary Key(IDCompra)
);
create table producto(
    IDProducto int(11) not null, 
    Nombre varchar(100) not null,
    Precio int not null, 
    IDLocal int(11), 
    IDCategoria int(11),
    Descripcion varchar(100) not null, 
    Primary Key(IDProducto)
);
create table categoria(
    IDCategoria int(11) not null, 
    Categoria varchar(100) not null, 
    Primary Key(IDCategoria)
);
create table local(
    IDLocal int(11) not null, 
    Nombre varchar(100) not null, 
    IDVendedor int(11), 
    Descripcion varchar(100) not null, 
    Primary Key(IDLocal)
);
create table vendedor(
    IDVendedor int(11) not null, 
    Nombre varchar(100) not null, 
    FechaNacimiento date not null, 
    Email varchar(100) not null, 
    Identificacion bigint(11) not null unique, 
    Telefono bigint(10) not null, 
    Usuario varchar(50) not null, 
    Password varchar(50), 
    Primary Key(IDVendedor)
);
create table envio(
    IDEnvio int(11) not null, 
    FechaEnvio date not null, 
    Descripcion varchar(100) not null, 
    IDEstado int(11), 
    IDCompra int(11), 
    IDVendedor int(11), 
    Primary Key(IDEnvio)
);
create table estado(
    IDEstado int(11) not null, 
    Estado varchar(100) not null, 
    Primary Key(IDEstado)
);
create table pago(
    IDPago int(11) not null, 
    FechaPago date not null, 
    Primary Key(IDPago)
);
create table administrador(
    IDAdministrador int(11) not null, 
    Nombre varchar(100) not null, 
    Identificacion int(11) not null unique, 
    FechaNacimiento date not null, 
    Email varchar(100) not null, 
    Telefono int(10) not null, 
    Primary Key(IDAdministrador)
);
create table premio(
    IDPremio int(11) not null, 
    Nombre varchar(100) not null, 
    Descripcion varchar(100) not null, 
    IDAdministrador int(11), 
    Primary Key(IDPremio)
);
create table clientepremio(
    IDPremio int(11), 
    IDCliente int(11), 
    Primary Key(IDPremio, IDCliente)
);

alter table producto add foreign key(IDLocal) references local(IDLocal);
alter table producto add foreign key(IDCategoria) references categoria(IDCategoria);
alter table local add foreign key(IDVendedor) references vendedor(IDVendedor);
alter table compra add foreign key(IDPago) references pago(IDPago);
alter table compra add foreign key(IDCliente) references cliente(IDCliente);
alter table compra add foreign key(IDProducto) references producto(IDProducto);
alter table envio add foreign key(IDEstado) references estado(IDEstado);
alter table envio add foreign key(IDCompra) references compra(IDCompra);
alter table envio add foreign key(IDVendedor) references vendedor(IDVendedor);
alter table cliente add foreign key(IDGenero) references genero(IDGenero);
alter table premio add foreign key(IDAdministrador) references administrador(IDAdministrador);
alter table clientepremio add foreign key(IDCliente) references cliente(IDCliente);
alter table clientepremio add foreign key(IDPremio) references premio(IDPremio);
