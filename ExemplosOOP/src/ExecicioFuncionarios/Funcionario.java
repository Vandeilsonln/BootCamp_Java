package ExecicioFuncionarios;

public class Funcionario {
    private int salario;

    public int getSalario() {return salario;}
    public void setSalario(int salario) {this.salario = salario;}

    public double calculaImposto(){
        return this.getSalario() * 0.1;
    }
}
