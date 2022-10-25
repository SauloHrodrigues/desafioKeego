package desafioV2;

import java.util.ArrayList;
import java.util.List;

public class ClienteV2 {
		private String nomeCliente; 
		private List<CompraV2> compras = new ArrayList<>();
		
		public ClienteV2(String nome) {
			this.nomeCliente = nome;
		}
		
		public void addCompra(CompraV2 c) {
			this.compras.add(c);
		}
		
		public Double totalCompras() {
			double total = 0.0;
			
			for(CompraV2 c : compras) {
				total += c.valorTotalCompra();
			}
			
			
			return total;
			
		}


		public String getNomeCliente() {
			return nomeCliente;
		}


		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}


	
	
		
}
