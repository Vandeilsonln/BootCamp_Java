package ExecicioFuncionarios;

public class ProgramaPrincipal {
    public static void main(String[] args){
        Gerente gerente = new Gerente();
        gerente.setSalario(10000);
        System.out.println(gerente.calculaImposto());

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(6800);
        System.out.println(supervisor.calculaImposto());

        Atendente atendente = new Atendente();
        atendente.setSalario(3500);
        System.out.println(atendente.calculaImposto());
    }
}
