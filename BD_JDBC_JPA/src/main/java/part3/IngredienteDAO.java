package part3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IngredienteDAO {

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

                ingredientes.add(new Ingrediente(
                        id_ingrediente,
                        descricao,
                        preco,
                        volume_peso,
                        unidade_medida
                        ));
            }
        } catch (SQLException e) {
            System.out.println("Listagem de ingredientes falhou");
            e.printStackTrace();
        }
    return ingredientes;
    }
}
