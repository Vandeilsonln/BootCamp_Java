package part3;

import java.util.List;

public class QueriesExecution {
    public static void main(String[] args) {
        IngredienteDAO ingredienteDAO = new IngredienteDAO();

        // 1 - Consulta
        List<Ingrediente> ingredientes = ingredienteDAO.list();

        ingredientes.stream().forEach(System.out::println);
    }
}
