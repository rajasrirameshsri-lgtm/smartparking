CREATE DATABASE parkingslotdb;

USE parkingslotdb;

CREATE TABLE vehicle (
    id INT PRIMARY KEY AUTO_INCREMENT,
    vehicle_number VARCHAR(20),
    owner_name VARCHAR(50),
    vehicle_type VARCHAR(20)
);

CREATE TABLE parking_slot (
    slot_id INT PRIMARY KEY AUTO_INCREMENT,
    slot_number INT,
    vehicle_number VARCHAR(20),
    status VARCHAR(20),
    entry_time VARCHAR(30),
    exit_time VARCHAR(30),
    amount DOUBLE
);