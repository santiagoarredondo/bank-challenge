package com.endava.bank;

public class Role {
    private String nombre;
    private int priority;

    public Role(String nombre, int priority) {
        this.nombre = nombre;
        this.priority = priority;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Role{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
