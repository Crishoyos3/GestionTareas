package Clases;

import java.util.ArrayList;

public class GestorTareas {


    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }
    //agregamos una tarea a la ultima posicion de la lista O(1)
    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    //recorremos toda la lista para mostrar todas las tareas 0(n)
    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (Tarea t : listaTareas) {
            System.out.println(t.toString());
        }
    }

    //Recorremos la lista hasta encontrar la tarea que buscamos O(n)
    public void buscarPorId(int id){
        for (Tarea t : listaTareas) {
            if(t.getId()== id){
                System.out.println(t.toString());

            }
        }
    }

    //Recorremos la lista buscando la tarea que buscamos y que no esté completada O(n)
    public void marcarCompletada(int id){
        for (Tarea t : listaTareas) {
            if(t.getId()== id && t.isCompletada() == false){
                t.setCompletada(true);

            }
        }
    }

    //Eliminamos una tarea con el ID que buscamos O(1)
    public void eliminarTarea(int id){


                listaTareas.removeIf(tarea -> tarea.getId() == id );


    }

    //Se recorre toda la lista buscando tareas que no estén completadas O(n)
    public void obtenerTareasPendientes(){
        for (Tarea t : listaTareas) {
            if(t.isCompletada() == false){
                System.out.println(t.toString());

            }
        }
    }

    //Se recorre toda la lista buscando las tareas con la prioridad que buscamos O(n)
    public void obtenerTareasPrioridad(int prioridad){
        for (Tarea t : listaTareas) {
            if(t.getPrioridad() == prioridad){
                System.out.println(t.toString());

            }
        }
    }

}
