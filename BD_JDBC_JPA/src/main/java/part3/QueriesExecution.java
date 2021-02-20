package part3;

import java.util.List;

public class QueriesExecution {
    public static void main(String[] args) {
        IngredienteDAO ingredienteDAO = new IngredienteDAO();

//        // 1 - Consulta
//        List<Ingrediente> ingredientes = ingredienteDAO.list();
//        ingredientes.stream().forEach(System.out::println);
//
//        // 2 - Consulta por ID
//        System.out.println("----------------------------------");
//        Ingrediente ingredienteId = ingredienteDAO.getById(5);
//        System.out.println(ingredienteId);

        // 3 - Inserção
//        System.out.println("----------------------------------");
//        Ingrediente insertIngrediente = new Ingrediente(
//                "Granulado",
//                4.5f,
//                100,
//                "g"
//        );
//
//        ingredienteDAO.create(insertIngrediente);

        // 4 - Deletar
        System.out.println("----------------------------------");
        // ingredienteDAO.delete(25);

        // 5 - Atualizar
        System.out.println("----------------------------------");
        Ingrediente updateIngrediente = ingredienteDAO.getById(9);
        System.out.println(updateIngrediente);

        updateIngrediente.setDescricao("Chantilly");
        updateIngrediente.setPreco(10f);

        ingredienteDAO.update(updateIngrediente);
         //ingredienteDAO.list().stream().forEach(System.out::println);
    }
}
