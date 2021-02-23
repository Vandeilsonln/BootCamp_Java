package part1;

import classes.Aluno;
import classes.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ExecutionPart3 {
    public static void main(String[] args) {
        // 1 - Dados instanciados como exemplo
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Estado estadoParaAdicionar = new Estado("Teste");
        entityManager.persist(estadoParaAdicionar);
        entityManager.persist(new Estado("Sao Paulo"));
        entityManager.persist(new Aluno("Vandeilson", 20, estadoParaAdicionar));
        entityManager.persist(new Aluno("Aline", 25, estadoParaAdicionar));
        entityManager.persist(new Aluno("Joao", 40, estadoParaAdicionar));

        entityManager.getTransaction().commit();

        // SQL nativo
        String sqlList = "SELECT * FROM estado";
        List<Estado> estadosSQLlist = entityManager
                .createNativeQuery(sqlList, Estado.class)
                .getResultList();

//        System.out.println("Consulta" + estadosSQLlist);
//        estadosSQLlist.forEach(Estado -> System.out.println("Consulta estado: " + Estado));


        // JPQL
        String jpql = "select a from Estado a where a.nome_estado = :estadoNome";
        Estado estadoJpql = entityManager
                .createQuery(jpql,Estado.class)
                .setParameter("estadoNome", "Teste")
                .getSingleResult();

        // Trazendo uma lista como resultado
        String jpqlList = "select a from Estado a";
        List<Estado> alunosJpql = entityManager
                .createQuery(jpqlList, Estado.class)
                .getResultList();

        System.out.println("Consulta " + estadoJpql);
        alunosJpql.forEach(Estado -> System.out.println(Estado));

        // Fechando Entity manager
        entityManager.close();
        entityManagerFactory.close();


    }
}
