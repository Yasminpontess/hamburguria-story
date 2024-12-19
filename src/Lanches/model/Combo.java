package Lanches.model;

public class Combo extends Lanche {

	private String batata;
	private String refrigerante;
	private String sobremesa;
	private float valorAd;

	public Combo(String pao, String molho, String recheio, String quantidadeR, String salada, int tipo,float valor, String batata, String refrigerante, String brownie) {
		super(pao, molho, recheio, quantidadeR, salada, tipo, valor);
		this.batata = batata;
		this.refrigerante = refrigerante;
		this.sobremesa = brownie;

	}

	public String getBatata() {
		return batata;
	}

	public void setBatata(String batata) {
		this.batata = batata;
	}

	public String getRefrigerante() {
		return refrigerante;
	}

	public void setRefrigerante(String refrigerante) {
		this.refrigerante = refrigerante;
	}

	public String getBrownie() {
		return sobremesa;
	}

	public void setBrownie(String brownie) {
		this.sobremesa = brownie;
	}

	@Override
	public float calcularValorTotal() {
		float valorTotal = this.valorAd;

		if (this.batata != null && !this.batata.isEmpty()) {
			valorTotal += 10.0;
		}
		if (this.refrigerante != null && !this.refrigerante.isEmpty()) {
			valorTotal += 8.5;
		}
		if (this.sobremesa != null && !this.sobremesa.isEmpty()) {
			valorTotal += 2.0;
		}

		return super.calcularValorTotal();
	}

	@Override
	public void adicionarIngrediente(String ingrediente, float valorAdicional) {
		super.adicionarIngrediente(ingrediente, valorAdicional);
		switch (ingrediente.toLowerCase()) {
		case "Batata":
			this.batata = "Sim";
			break;
		case "Refrigerante":
			this.refrigerante = "Sim";
			break;
		case "Brownie":
			this.sobremesa = "Sim";
			break;
		default:
			System.out.println("Ingrediente desconhecido!");
			return;
		}
		this.valorAd += valorAdicional;
	}

	@Override
	public void removerIngrediente(String ingrediente, float valorRemovido) {
		super.removerIngrediente(ingrediente, valorRemovido);
		switch (ingrediente.toLowerCase()) {
		case "Batata":
			this.batata = null;
			break;
		case "Refrigerante":
			this.refrigerante = null;
			break;
		case "Brownie":
			this.sobremesa = null;
			break;

		default:
			System.out.println("Ingrediente desconhecido para remoção!");
			return;
		}
		this.valorAd -= valorRemovido;
	}

	@Override
	public void visualizarHamburguer() {
		super.visualizarHamburguer();
		System.out.println("Batata: " + this.batata);
		System.out.println("Refrigerante: " + this.refrigerante);
		System.out.println("Brownie: " + this.sobremesa);
	}

}
