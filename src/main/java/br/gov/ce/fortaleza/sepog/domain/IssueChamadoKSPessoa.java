package br.gov.ce.fortaleza.sepog.domain;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IssueChamadoKSPessoa implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "idade")
	private java.lang.Integer idade;

	public IssueChamadoKSPessoa() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getIdade() {
		return this.idade;
	}

	public void setIdade(java.lang.Integer idade) {
		this.idade = idade;
	}

	public IssueChamadoKSPessoa(java.lang.String name, java.lang.Integer idade) {
		this.name = name;
		this.idade = idade;
	}

}