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
        Ingrediente ingrediente = new Ingrediente();

        try(Connection conn = ConnectionFactory.getConnection()){
            String sql = "SELECT * FROM tbl_ingredientes WHERE id_ingrediente = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_ingrediente);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                ingrediente.setId_ingrediente(rs.getInt("id_ingrediente"));
                ingrediente.setDescricao(rs.getString("descricao"));
                ingrediente.setPreco(rs.getFloat("preco"));
                ingrediente.setVolume_peso(rs.getInt("volume_peso"));
                ingrediente.setUnidade_medida(rs.getString("unidade_medida"));
            }
            System.out.println("Listagem deu certo");
        } catch (SQLException e) {
            System.out.println("Listagem do ingrediente falhou");
            e.printStackTrace();
        }

        return ingrediente;
    }

    // 2 - Inserção
    public void create(Ingrediente ingrediente){
        try(Connection conn = ConnectionFactory.getConnection()){

            String sql = "INSERT INTO tbl_ingredientes (descricao, preco, volume_peso, unidade_medida) VALUES(?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ingrediente.getDescricao());
            stmt.setFloat(2, ingrediente.getPreco());
            stmt.setInt(3, ingrediente.getVolume_peso());
            stmt.setString(4, ingrediente.getUnidade_medida());

            int rowsAffected = stmt.executeUpdate();

            System.out.println("Inserção BEM SUCEDIDA! Foi adicionada "+ rowsAffected + " linha.");
            } catch (SQLException e) {
            System.out.println("Inserção falhou");
            e.printStackTrace();
        }
    }

    // 3 - Delete
    public void delete(int id_ingrediente){
        try(Connection conn = ConnectionFactory.getConnection()){

            String sql = "DELETE FROM tbl_ingredientes WHERE id_ingrediente = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_ingrediente);

            int rowsAffected = stmt.executeUpdate();

            System.out.println("DELETE BEM SUCEDIDA! Foi removida "+ rowsAffected + " linha.");
        } catch (SQLException e) {
            System.out.println("Inserção falhou");
            e.printStackTrace();
        }
    }

    // 4 - Atualizar
    public void update(Ingrediente ingrediente){
        try(Connection conn = ConnectionFactory.getConnection()){

            String sql = "UPDATE tbl_ingredientes SET descricao = ?, preco = ?, volume_peso = ?, unidade_medida = ? WHERE id_ingrediente = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ingrediente.getDescricao());
            stmt.setFloat(2, ingrediente.getPreco());
            stmt.setInt(3, ingrediente.getVolume_peso());
            stmt.setString(4, ingrediente.getUnidade_medida());
            stmt.setInt(5, ingrediente.getId_ingrediente());

            int rowsAffected = stmt.executeUpdate();

            System.out.println("UPDATE BEM SUCEDIDA! Foi removida "+ rowsAffected + " linha.");
        } catch (SQLException e) {
            System.out.println("Update falhou");
            e.printStackTrace();
        }
    }
}


