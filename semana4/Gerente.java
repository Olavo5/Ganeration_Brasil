package semana4;

public class Gerente extends Funcionario {

	String hierarquia;
	int numeroFuncionarios;

	public String getHierarquia() {
		return hierarquia;
	}

	public void setHierarquia(String hieraquia) {
		this.hierarquia = hieraquia;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public void entrevistas() {
		System.out.println("Gerente " + getNome() + " está realizando uma reunião com a equipe da " + hierarquia);
	}

	@Override
	public void visualizar() {
		System.out.println("Nome: " + getNome());
		System.out.println("Cargo: " + getCargo());
		System.out.println("Área Responsável: " + this.hierarquia);
	}

}
