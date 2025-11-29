/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.Vehiculo;

/**
 *
 * @author Gladys
 */
public class GestionVehiculo {
    private Vehiculo[] vehiculos;
    private int totalVehiculos;

    public GestionVehiculo() {
        vehiculos = new Vehiculo[50];
        totalVehiculos = 0;

        // Ejemplo: inicializamos algunos vehículos (puedes cambiarlos a tu caso real)
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Cayenne", "Juan Pérez", "Carlos Gómez", 100000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911", "María López", "Ana Torres", 500000);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Macan", "Luis Sánchez", "Pedro Ruiz", 400000);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Taycan", "Empresa X", "Lucía Rivas", 300000);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Cayenne Turbo GT", "Juan Pérez", "Carlos Gómez", 189900.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 Turbo S", "María López", "Ana Torres", 245000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Macan GTS", "Luis Sánchez", "Pedro Ruiz", 105000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Taycan Turbo S", "Empresa X", "Lucía Rivas", 215000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Panamera Turbo S E-Hybrid", "Gabriel Ramos", "Sandra Paredes", 205900.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 718 Cayman GT4 RS", "Ricardo Méndez", "Fabiola Hurtado", 160000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 Carrera GTS", "Eduardo Valverde", "Diego Prado", 165000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Boxster GTS 4.0", "Lucero Vela", "Paola Quispe", 140000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 GT3 RS", "Empresa Y", "Roberto Dueñas", 250000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Macan Turbo", "Marco Polo", "Ernesto Villalba", 98000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Cayenne S", "Empresa Z", "Camila Ríos", 130000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Taycan 4 Cross Turismo", "Alonso Vega", "María Castañeda", 120000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 Carrera 4S", "Kevin Huamán", "Mario Acuña", 155000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Panamera 4S", "Jazmín Calderón", "Carlos Soria", 145000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Cayenne GTS", "Javier Muñoz", "Karina Rojas", 150000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Panamera Turbo S", "Roberto Medina", "Sofía Villar", 650000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 Turbo S Cabriolet", "Valeria Ríos", "Marco Quinteros", 750000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 918 Spyder", "Empresa Elite Motors", "Daniel Gamarra", 1500000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 GT3 RS", "Andrés Calderón", "Karen Salas", 900000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Cayman GT4 RS", "Esteban Huerta", "Ricardo Poma", 650000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 Carrera GTS", "Fernanda Prado", "Julio Mena", 520000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 Speedster", "Coleccionista Privado", "Mario Paredes", 1200000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Taycan Turbo S", "Empresa GreenTech", "Andrea Molina", 480000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Macan GTS", "Eduardo Vargas", "Claudia Rey", 350000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Cayenne Turbo GT", "Ismael Torres", "Diego Valdivia", 580000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 Carrera 4S", "Paola Ramírez", "Gabriel Rojas", 540000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Carrera GT", "Colección Real Motors", "Natalia Vega", 2500000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 935 (Edición Limitada)", "MegaCorp Industrial", "Alejandro Vela", 1800000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche 911 Targa 4 GTS", "Xavier Soto", "Milagros León", 620000.0);
        vehiculos[totalVehiculos++] = new Vehiculo("Porsche Boxster 718 GTS", "Rodrigo Escalante", "Tomás Jurado", 420000.0);

        // Agrega más si quieres...
    }

    // Buscar vehículo por nombre / identificador (campo vehiculo)
    public Vehiculo buscarPorVehiculo(String nombreVehiculo) {
        for (int i = 0; i < totalVehiculos; i++) {
            if (vehiculos[i].getVehiculo().equalsIgnoreCase(nombreVehiculo)) {
                return vehiculos[i];
            }
        }
        return null;
    }

    // Registrar nuevo vehículo
    public boolean registrar(Vehiculo vehiculo) {
        // Verificar si el arreglo está lleno
        if (totalVehiculos == vehiculos.length) {
            return false;
        }

        // Evitar duplicados (mismo nombre/identificador de vehículo)
        if (buscarPorVehiculo(vehiculo.getVehiculo()) != null) {
            return false;
        }

        vehiculos[totalVehiculos] = vehiculo;
        totalVehiculos++;
        return true;
    }

    // Actualizar datos de un vehículo existente
    public boolean actualizar(Vehiculo vehiculo) {
        for (int i = 0; i < totalVehiculos; i++) {
            if (vehiculos[i].getVehiculo().equalsIgnoreCase(vehiculo.getVehiculo())) {
                // Actualizamos cliente, empleados y promociones
                vehiculos[i].setCliente(vehiculo.getCliente());
                vehiculos[i].setEmpleado(vehiculo.getEmpleado());
                vehiculos[i].setPromocion(vehiculo.getPromocion());
                return true;
            }
        }
        return false;
    }

    // Eliminar vehículo
    public boolean eliminar(String nombreVehiculo) {
        for (int i = 0; i < totalVehiculos; i++) {
            if (vehiculos[i].getVehiculo().equalsIgnoreCase(nombreVehiculo)) {

                // Correr los demás elementos una posición a la izquierda
                for (int j = i; j < totalVehiculos - 1; j++) {
                    vehiculos[j] = vehiculos[j + 1];
                }

                // Limpiar el último casillero
                vehiculos[totalVehiculos - 1] = null;
                totalVehiculos--;

                return true;
            }
        }
        return false;
    }

    // Obtener arreglo completo (para llenar tablas, combos, etc.)
    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }

    public int obtenerTotalVehiculos() {
        return totalVehiculos;
    }
}
    

