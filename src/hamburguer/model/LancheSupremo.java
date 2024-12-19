package hamburguer.model;

public class LancheSupremo extends Lanche {

	private String bacon;
	private String cheddar;
	private String queijo;
	private String molhoCasa;
	private float valorAd;

	public LancheSupremo(String pao, String molho, String recheio, String quantidadeR, String salada, int tipo, float valor, String bacon, String cheddar, String queijo, String molhoCasa) {
		super(pao, molho, recheio, quantidadeR, salada, tipo, valor);
		this.bacon = bacon;
		this.cheddar = cheddar;
		this.queijo = queijo;
		this.molhoCasa = molhoCasa;

	}

	public String getMolhoCasa() {
		return molhoCasa;
	}

	public void setMolhoCasa(String molhoCasa) {
		this.molhoCasa = molhoCasa;
	}

	public float getValorAd() {
		return valorAd;
	}

	public void setValorAd(float valorAd) {
		this.valorAd = valorAd;
	}

	public String getBacon() {
		return bacon;
	}

	public void setBacon(String bacon) {
		this.bacon = bacon;
	}

	public String getCheddar() {
		return cheddar;
	}

	public void setCheddar(String cheddar) {
		this.cheddar = cheddar;
	}

	public String getQueijo() {
		return queijo;
	}

	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}
	@Override
	public float calcularValorTotal() {
		float valorTotal = this.valorAd;

	
		if (this.bacon != null && !this.bacon.isEmpty()) {
			valorTotal += 2.0; 
		}
		if (this.cheddar != null && !this.cheddar.isEmpty()) {
			valorTotal += 1.5; 
		}
		if (this.queijo != null && !this.queijo.isEmpty()) {
			valorTotal += 2.0; 
		}
		if (this.molhoCasa != null && !this.molhoCasa.isEmpty()) {
			valorTotal += 1.0; 
		}
		
		return super.calcularValorTotal();
	}

	@Override
	public void adicionarIngrediente(String ingrediente, float valorAdicional) {
		super.adicionarIngrediente(ingrediente, valorAdicional);
		switch (ingrediente.toLowerCase()) {
		case "bacon":
			this.bacon = "Sim";
			break;
		case "queijo":
			this.queijo = "Sim";
			break;
		case "cheddar":
			this.cheddar = "Sim";
			break;
		case "molhoCasa":
			this.molhoCasa = "Sim";
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
        case "bacon":
            this.bacon = null;
            break;
        case "queijo":
            this.queijo = null;
            break;
        case "cheddar":
            this.cheddar = null;
            break;
        case "molhoCasa":
            this.molhoCasa = null;
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
		 System.out.println("Bacon: " +this.bacon);
	        System.out.println("Cheddar: " + this.cheddar);
	        System.out.println("Queijo: " + this.queijo);
	        System.out.println("Moçho da Casa: " + this.molhoCasa);
	}

	
	
	

}
