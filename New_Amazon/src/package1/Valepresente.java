package package1;

import java.util.*;

public class Valepresente {
	
	private float valor;
	private Date datexpiraçao;
	private String descricao;
	private String destinatario;
	
	public Valepresente(float valor, Date datexpiraçao, String descricao, String destinatario) {
		super();
		this.valor = valor;
		this.datexpiraçao = datexpiraçao;
		this.descricao = descricao;
		this.destinatario = destinatario;
	}
	
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getDatexpiraçao() {
		return datexpiraçao;
	}
	public void setDatexpiraçao(Date datexpiraçao) {
		this.datexpiraçao = datexpiraçao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	
	
}
