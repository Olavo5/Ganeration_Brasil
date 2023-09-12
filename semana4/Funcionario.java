package semana4;

public class Funcionario {

	private String nome;
	private int idFuncionario;
	private String cargo;
    private double salario;
    private String departamento;
    
	
    public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	 public void visualizar() {
	        System.out.println("ID do Funcionário: " + this.idFuncionario);
	        System.out.println("Nome: " + this.nome);
	        System.out.println("Cargo: " + this.cargo);
	        System.out.println("Salário: " + this.salario);
	        System.out.println("Departamento: " + this.departamento);
	    }
}
