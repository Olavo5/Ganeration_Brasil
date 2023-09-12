package semana4;

public class TestarFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();

		funcionario1.setIdFuncionario(1);
		funcionario1.setNome("João");
		funcionario1.setCargo("Dev Java");
		funcionario1.setSalario(10.000);
		funcionario1.setDepartamento("TI");

		funcionario2.setIdFuncionario(2);
		funcionario2.setNome("Ana Alice");
		funcionario2.setCargo("Data Analyst");
		funcionario2.setSalario(15.000);
		funcionario2.setDepartamento("TI");

		
		funcionario1.visualizar();
		System.out.println("******************************************");
		System.out.println("******************************************");
		funcionario2.visualizar();
	}
}
