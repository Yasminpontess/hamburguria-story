package Lanches.model;

public abstract class Lanche {

	private String pao;
	private String molho;
	private String recheio;
	private String quantidadeR;
	private String salada;
	private int tipo;
	private float valor;

	public Lanche(String pao, String molho, String hamburguer, String quantidadeH, String salada, int tipo,
			float valor) {
		this.pao = pao;
		this.molho = molho;
		this.recheio = recheio;
		this.quantidadeR = quantidadeR;
		this.salada = salada;
		this.valor = valor;
	}

	public String getPao() {
		return pao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void setPao(String pao) {
		this.pao = pao;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getHamburguer() {
		return recheio;
	}

	public void setHamburguer(String hamburguer) {
		this.recheio = hamburguer;
	}

	public String getQuantidadeH() {
		return quantidadeR;
	}

	public void setQuantidadeH(String quantidadeR) {
		this.quantidadeR = quantidadeR;
	}

	public String getSalada() {
		return salada;
	}

	public void setSalada(String salada) {
		this.salada = salada;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float calcularValorTotal() {
		float valorTotal = this.valor;

		
		if (this.salada != null && !this.salada.isEmpty()) {
			valorTotal += 2.0; 
		}
		if (this.molho != null && !this.molho.isEmpty()) {
			valorTotal += 1.5; 
		}
		if (this.quantidadeR != null && !this.quantidadeR.isEmpty()) {
			int quantidade = Integer.parseInt(this.quantidadeR);
			valorTotal += quantidade * 5.0; 
		}

		return valorTotal;
	}

	
	public void adicionarIngrediente(String ingrediente, float valorAdicional) {
		switch (ingrediente.toLowerCase()) {
		case "salada":
			this.salada = "Sim";
			break;
		case "molho":
			this.molho = "Sim";
			break;
		case "recheio":
			this.quantidadeR = Integer.toString(Integer.parseInt(this.quantidadeR) + 1);
			break;
		default:
			System.out.println("Ingrediente desconhecido!");
			return;
		}
		this.valor += valorAdicional;
	}

	
	public void removerIngrediente(String ingrediente, float valorRemovido) {
		switch (ingrediente.toLowerCase()) {
		case "salada":
			this.salada = null;
			break;
		case "molho":
			this.molho = null;
			break;
		case "recheio":
			int quantidade = Integer.parseInt(this.quantidadeR);
			if (quantidade > 1) {
				this.quantidadeR = Integer.toString(quantidade - 1);
			} else {
				this.quantidadeR = "0";
			}
			break;
		default:
			System.out.println("Ingrediente desconhecido!");
			return;
		}
		this.valor -= valorRemovido;
	}

	public void excluirLanche() {
        this.pao = null;
        this.molho = null;
        this.recheio = null;
        this.quantidadeR = "0";
        this.salada = null;
        this.tipo = 0;
        this.valor = 0.0f;
	}
	
	public void visualizarHamburguer() {
		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Lanches";
			break;
		case 2:
			tipo = "Combo";
		}

		System.out.println("\nHambúrguer:");
		System.out.println("Tido do lanche: " + tipo);
		System.out.println("Pão: " + this.pao);
		System.out.println("Molho: " + this.molho);
		System.out.println("Hambúrguer: " + this.recheio);
		System.out.println("Quantidade de Hambúrgueres: " + this.quantidadeR);
		System.out.println("Salada: " + this.salada);
		System.out.println("Valor: R$" + this.calcularValorTotal());
	}

}
