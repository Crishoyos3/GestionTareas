import Clases.GestorTareas;
import Clases.Tarea;

import java.util.Objects;
import java.util.Scanner;

void main() {


    Scanner entrada = new Scanner(System.in);
    //Instacia de la clase con los metodos
    GestorTareas gestor = new GestorTareas();
    //Variables
    int opcion;
    int id;
    String nombreTarea,estado;
    int prioridad;
    boolean completada;


    //Condicion para que no se cierre el sistema sin una orden
    do {
        System.out.println("1. Ingresar tarea");
        System.out.println("2. Ver todas las tareas");
        System.out.println("3. Ver tarea por id");
        System.out.println("4. Ver tareas por prioridad");
        System.out.println("5. ver tareas pendientes");
        System.out.println("6. Marcar como completada");
        System.out.println("7. Eliminar tarea");
        System.out.println("0. Salir del sistema");
        opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Inserte id de la tarea: ");
                id = entrada.nextInt();
                System.out.println("Inserte nombre de la tarea: ");
                entrada.nextLine();
                nombreTarea = entrada.nextLine();
                System.out.println("Inserte prioridad de la tarea (1-5):");
                prioridad = entrada.nextInt();
                System.out.println("Inserte estado de la tarea (Completada-Pendiente): ");
                estado = entrada.next();

                if (Objects.equals(estado, "Completada")){
                    completada = true;
                }else {
                    completada = false;
                }
                gestor.agregarTarea(new Tarea(id,nombreTarea,prioridad,completada));
                System.out.println("Se inserto correctamente la tarea");
                break;

            case 2:
                gestor.listarTareas();
                break;

            case 3:
                System.out.println("Ingrese el id de la tarea que desea buscar: ");
                id = entrada.nextInt();
                gestor.buscarPorId(id);
                break;

            case 4:
                System.out.println("Inserte prioridad de las tareas que desea ver (1-5):");
                prioridad = entrada.nextInt();
                gestor.obtenerTareasPrioridad(prioridad);
                break;


            case 5:
                gestor.obtenerTareasPendientes();
                break;

            case 6:
                System.out.println("Ingrese el id de la tarea que desea marcar como completada: ");
                id = entrada.nextInt();
                gestor.marcarCompletada(id);
                break;

            case 7:
                System.out.println("Ingrese el id de la tarea que desea eliminar: ");
                id = entrada.nextInt();
                gestor.eliminarTarea(id);
                break;

        }




    }while(opcion != 0);




}
