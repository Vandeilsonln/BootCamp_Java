package part3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IngredienteDAO {

    // 1 - Consulta
    public List<Ingrediente> list(){

        List<Ingrediente> ingredientes = new ArrayList<>();

        try(Connection conn = ConnectionFactory.getConnection()){
            String sql = "SELECT * FROM tbl_ingredientes";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id_ingrediente = rs.getInt("id_ingrediente");
                String descricao = rs.getString("descricao");
                float preco = rs.getFloat("preco");
                int volume_peso = rs.getInt("volume_peso");
                String unidade_medida = rs.getString("unidade_medida");


                Ingrediente newIngrediente = new Ingrediente(
                        id_ingrediente,
                        descricao,
                        preco,
                        volume_peso,
                        unidade_medida
                        );

                ingredientes.add(newIngrediente);
            }
            System.out.println("Listagem deu certo");
        } catch (SQLException e) {
            System.out.println("Listagem de ingredientes falhou");
            e.printStackTrace();
        }
        return ingredientes;
    }

    // 1.1 - Consulta com filtro
    public Ingrediente getById(int id_ingrediente){
        return null;
    }

    // 2 - Inserção
    public void create(Ingrediente ingrediente){

    }

    // 3 - Delete
    public void delete(int id_ingrediente){

    }

    // 4 - Atualizar
    public void update(Ingrediente ingrediente){

    }
}


