package desafioV2;

public class SistemaV2 {

	public static void main(String[] args) {

		ClienteV2 cliente01 = new ClienteV2("Saulo H Rodrigues");
		CompraV2 compra1 = new CompraV2(cliente01);
		compra1.adicionarItem("caneta Bic", 5.00,10);//50,00
		compra1.adicionarItem("Lapis de cor", 10.00,20);//200
		compra1.adicionarItem("Lapiseira pentel", 25.00,4);//100
		
		CompraV2 compra2 = new CompraV2(cliente01);
		compra2.adicionarItem("caneta Bic", 5.00,20);//100,00
		compra2.adicionarItem("Lapis de cor", 10.00,40);//400
		compra2.adicionarItem("Lapiseira pentel", 25.00,4);//100
		System.out.println("Compra 01 = "+compra1.valorTotalCompra());
		System.out.println("Compra 02 = "+compra2.valorTotalCompra());
		System.out.println(cliente01.totalCompras());

	}

}
