package part1;

import classes.Aluno;
import classes.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutionPart2 {
    public static void main(String[] args) {

        // 1 - Criar gerenciador de banco de dados
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // 2.1 - Criar instâncias para serem adicionadas no banco de dados
        Estado estadoParaAdicionar = new Estado("Goiás");
        Aluno alunoParaAdicionar = new Aluno("Aline", 27, estadoParaAdicionar);

        // 2.2 - Iniciar uma transação para adicionar as instâncias no banco de dados
        entityManager.getTransaction().begin();

        entityManager.persist(estadoParaAdicionar);
        entityManager.persist(alunoParaAdicionar);

        entityManager.getTransaction().commit();

        // 3 - Resgatar instâncias no banco de dados
        Estado estadoEncontrado = entityManager.find(Estado.class, 1);
        Aluno alunoEncontrado = entityManager.find(Aluno.class, 1);

        System.out.println(estadoEncontrado);
        System.out.println(alunoEncontrado);

        // 4 - Alterar uma entidade
        entityManager.getTransaction().begin();

        alunoEncontrado.setNome("Karam");
        alunoEncontrado.setIdade(47);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
