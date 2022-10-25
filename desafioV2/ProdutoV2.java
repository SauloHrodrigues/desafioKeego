package desafioV2;

public class ProdutoV2 {
	private String nomeProduto;
	private Double precoProduto;
	
	public ProdutoV2() {}
	
	public ProdutoV2(String nomeProduto, Double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	
	
}
