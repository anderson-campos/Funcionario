public class Funcionario {
    private double salario;

    public Funcionario(double salario){
        this.salario = salario;
    }

    public Funcionario() {
        this.salario = 0.0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public double calcularSalarioTotal(){
        return salario;
    }

    @Override
    public String toString(){
        return "Funcionario [salario = " + salario + "]";
    }

}
