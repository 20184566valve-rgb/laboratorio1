/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Gladys
 */
public class Vehiculo {

   private String vehiculo;   // modelo/nombre del auto
    private String cliente;    // nombre del cliente
    private String empleado;   // asesor/empleado
    private double promocion;  // precio o promoción

    public Vehiculo(String vehiculo, String cliente, String empleado, double promocion) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.promocion = promocion;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public double getPromocion() {
        return promocion;
    }

    public void setPromocion(double promocion) {
        this.promocion = promocion;
    }
}


   
