package utilMaps;
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args){
        Map<String, Integer> campeoesFifa = new HashMap<>();

        // add data
        campeoesFifa.put("Brasil", 5);
        campeoesFifa.put("Alemanha", 4);
        campeoesFifa.put("Itália", 4);
        campeoesFifa.put("Uruguai", 2);
        campeoesFifa.put("Argentina", 2);
        campeoesFifa.put("França", 2);
        campeoesFifa.put("Inglaterra", 1);
        campeoesFifa.put("Espanha", 1);

        System.out.println(campeoesFifa);

        // atualiza valor Brasil
        campeoesFifa.put("Brasil", 6);
        System.out.println(campeoesFifa);

        // retorna value de Argentina
        System.out.println(campeoesFifa.get("Argentina"));

        // Retorna se existe ou não a chave França
        System.out.println(campeoesFifa.containsKey("França"));

        // remove chave França
        campeoesFifa.remove("França");

        // Retorna se existe ou não o value 6
        System.out.println(campeoesFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(campeoesFifa.size());

        System.out.println(campeoesFifa);

        // Navega nos registros do mapa
        for(Map.Entry<String, Integer> entry : campeoesFifa.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        // Navega nos registros do mapa de outra forma
        for(String key : campeoesFifa.keySet()){
            System.out.println(key + " --- " + campeoesFifa.get(key));
        }
    }
}
