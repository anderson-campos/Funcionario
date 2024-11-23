public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(3000);

        System.out.println(funcionario);
        System.out.println("Salário total do Funcionario: " + funcionario.calcularSalarioTotal());

        Gerente gerente = new Gerente(5000, 2000);
        System.out.println(gerente);
        System.out.println("Salário total do Gerente: " + gerente.calcularSalarioTotal());
    }
}