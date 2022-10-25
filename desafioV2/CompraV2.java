package desafioV2;

import java.util.ArrayList;
import java.util.List;

public class CompraV2 {
	private ClienteV2 cliente;
	private List<ItemV2> items = new ArrayList<>();
	
	
	
	public CompraV2(ClienteV2 cliente) {
		this.cliente = cliente;
	}

	public void adicionarItem(String nomeProduto, double preco, int qtde) {
		this.items.add(new ItemV2(nomeProduto, preco, qtde));
		
	}
	
	public double valorTotalCompra() {
		double total =0.0;
		
		for(ItemV2 itemV2 : items) {
			total += itemV2.valorItens();
		}
		
		
		return total;
	}
	
	
}
