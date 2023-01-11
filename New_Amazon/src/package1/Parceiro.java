package package1;

import java.util.*;

public class Parceiro {
	
	private String NOME;
	private int cnpj;
	private String telefone;
	
	public Parceiro(String nOME, int cnpj, String telefone) {
		super();
		NOME = nOME;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}
	
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nOME) {
		NOME = nOME;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
