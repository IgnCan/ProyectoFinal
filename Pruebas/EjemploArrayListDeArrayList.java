package Pruebas;

import java.util.ArrayList;
// para sacar elemento especifico
public class EjemploArrayListDeArrayList {
    public static void main(String[] args) {
        // Crear el ArrayList principal que contiene arr1 y arr2
        ArrayList<ArrayList<Object>> listaPrincipal = new ArrayList<>();

        // Crear arr1 y arr2 y agregarlos al ArrayList principal
        ArrayList<Object> arr1 = new ArrayList<>();
        arr1.add("acb");

        ArrayList<Object> arr2 = new ArrayList<>();
        arr2.add("basd");

        listaPrincipal.add(arr1);
        listaPrincipal.add(arr2);

        // Buscar la letra 'a' y obtener la ArrayList correspondiente
        String IdViajeCompleto = "acb";
        ArrayList<Object> elementoObjetivo = BuscarRecorrido(listaPrincipal, IdViajeCompleto);

        // Verificar si se encontró la letra y mostrar el resultado
        if (elementoObjetivo != null) {
            System.out.println("Letra encontrada en el ArrayList: " + elementoObjetivo);
        } else {
            System.out.println("Letra no encontrada en ningún ArrayList.");
        }
    }

    // Método para buscar la letra en los ArrayLists internos
    public static ArrayList<Object> BuscarRecorrido (ArrayList<ArrayList<Object>> listaPrincipal, String letra) {
        for (ArrayList<Object> arrayObjetivo : listaPrincipal) {
            if (arrayObjetivo.contains(letra)) {
                return arrayObjetivo; // Se encontró la letra, devolver el ArrayList correspondiente
            }
        }
        return null; // No se encontró la letra en ningún ArrayList
    }
}
