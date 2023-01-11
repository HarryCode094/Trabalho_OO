package package1;

import java.util.*;

public class reembolso {

	
		private float valorproduto;
		private String estadopedido;
		
		public reembolso(float valorproduto, String estadopedido) {
			super();
			this.valorproduto = valorproduto;
			this.estadopedido = estadopedido;
		}
		
		public float getValorproduto() {
			return valorproduto;
		}
		public void setValorproduto(float valorproduto) {
			this.valorproduto = valorproduto;
		}
		public String getEstadopedido() {
			return estadopedido;
		}
		public void setEstadopedido(String estadopedido) {
			this.estadopedido = estadopedido;
		}
		
		public void extornarpedido() {
			
		}
		
}
