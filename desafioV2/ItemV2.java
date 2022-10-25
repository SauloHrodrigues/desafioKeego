package desafioV2;

public class ItemV2 {
	private ProdutoV2 produto;
	private int qtdeProduto;
	
	
	public ItemV2(String nomeProd, double valorProduto, int qtdeProduto) {
		this.produto = new ProdutoV2(nomeProd, valorProduto);
		this.qtdeProduto = qtdeProduto;
	}
	
	public double valorItens() {
		return this.qtdeProduto * this.produto.getPrecoProduto();
	}
	
	//****************************

	public ProdutoV2 getProduto() {
		return produto;
	}

	public void setProduto(ProdutoV2 produto) {
		this.produto = produto;
	}

	public double getQtdeProduto() {
		return qtdeProduto;
	}

	public void setQtdeProduto(int qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}

		
}
