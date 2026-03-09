package Clases;

import java.util.ArrayList;

public class Tarea {

    private int id;
    private String descripcion;
    private int prioridad;
    private boolean completada;


    public Tarea(int id, String descripcion, int prioridad, boolean completada) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = completada;
    }


    public Tarea() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        String estado = completada ? "[Completada]" : "[Pendiente]";
        return "ID: " + id + " | Prioridad: " + prioridad + " | " + estado + " | " + descripcion;
    }





}
