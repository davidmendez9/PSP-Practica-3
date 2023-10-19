/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mendezdavidp03;

/**
 *
 * @author David
 */
public class Empleado {
    
    int num;
    String nombre;
    Fecha fechaAlta;
    int sueldo;
    int edad;

    public Empleado(int num, String nombre, int dia, int mes, int anio) {
        this.num = num;
        this.nombre = nombre;
        this.fechaAlta = new Fecha(dia, mes, anio);
        this.sueldo = 0;
        this.edad = 0;
    }

    public Empleado(int num, String nombre, int dia, int mes, int anio, int sueldo, int edad) {
        this(num, nombre, dia, mes, anio);
        this.sueldo = sueldo;
        this.edad = edad;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Fecha fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
