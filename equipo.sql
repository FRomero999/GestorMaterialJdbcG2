create table equipo
(
    id         int auto_increment
        primary key,
    nombre     varchar(60) not null,
    categoria  varchar(32) null,
    disponible tinyint(1)  null
);

INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (1, 'Dell OptiPlex 70900', 'PC Sobremesa', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (2, 'HP ProDesk 400 G7', 'PC Sobremesa', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (3, 'Lenovo ThinkCentre M75s', 'PC Sobremesa', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (4, 'Acer Veriton X4660G', 'PC Sobremesa', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (5, 'ASUS ExpertCenter D5', 'PC Sobremesa', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (6, 'Dell Latitude 5420', 'Portátil', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (7, 'HP EliteBook 840 G8', 'Portátil', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (8, 'Lenovo ThinkPad E15', 'Portátil', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (9, 'Acer TravelMate P2', 'Portátil', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (10, 'ASUS ExpertBook B1', 'Portátil', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (11, 'MacBook Air M2', 'Portátil', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (12, 'MacBook Pro 14', 'Portátil', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (13, 'Surface Laptop 5', 'Portátil', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (14, 'Dell XPS 13', 'Portátil', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (15, 'HP ZBook Firefly', 'Portátil', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (16, 'Samsung Galaxy Tab S8', 'Tablet', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (17, 'iPad Air 5', 'Tablet', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (18, 'Lenovo Tab P11', 'Tablet', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (19, 'Xiaomi Pad 6', 'Tablet', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (20, 'Microsoft Surface Go 3', 'Tablet', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (21, 'Epson EB-X49', 'Proyector', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (22, 'BenQ MW550', 'Proyector', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (23, 'ViewSonic PA503S', 'Proyector', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (24, 'Optoma X400LVe', 'Proyector', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (25, 'Acer X1328WH', 'Proyector', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (26, 'TP-Link Archer AX55', 'Router', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (27, 'MikroTik hAP ac3', 'Router', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (28, 'ASUS RT-AX58U', 'Router', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (29, 'Cisco RV340', 'Router', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (30, 'Ubiquiti EdgeRouter X', 'Router', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (31, 'Cisco Catalyst 2960', 'Switch', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (32, 'TP-Link TL-SG1024', 'Switch', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (33, 'Netgear GS324', 'Switch', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (34, 'D-Link DGS-1210', 'Switch', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (35, 'Ubiquiti USW-24', 'Switch', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (36, 'Synology DS224+', 'NAS', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (37, 'QNAP TS-464', 'NAS', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (38, 'Synology DS923+', 'NAS', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (39, 'QNAP TS-233', 'NAS', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (40, 'Asustor Lockerstor 2', 'NAS', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (41, 'Logitech C920', 'Webcam', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (42, 'Logitech Brio 4K', 'Webcam', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (43, 'Trust Tyro', 'Webcam', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (44, 'Poly Studio P5', 'Webcam', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (45, 'Microsoft LifeCam HD-3000', 'Webcam', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (46, 'Brother HL-L2375DW', 'Impresora', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (47, 'HP LaserJet Pro M404', 'Impresora', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (48, 'Canon i-SENSYS MF275dw', 'Impresora', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (49, 'Epson EcoTank ET-2850', 'Impresora', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (52, 'Zelda: Ocarine of Time', 'categoria', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (53, 'GTA VI', 'VideoGame', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (54, 'GTA VI', 'VideoGame', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (55, 'GTA VI', 'VideoGame', 1);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (56, 'GTA VII', 'VideoGame', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (57, 'GTA', '(SELECT SLEEP(5))', 0);
INSERT INTO ad.equipo (id, nombre, categoria, disponible) VALUES (58, 'GTA', '(SELECT SLEEP(5))', 0);
