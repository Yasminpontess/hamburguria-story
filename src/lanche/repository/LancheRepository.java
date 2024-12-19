package lanche.repository;

public interface LancheRepository {
	
	float calcularValorTotal();

	public void adicionarIngrediente(String ingrediente, float valorAdicional);

	public void removerIngrediente(String ingrediente, float valorRemovido);

	public void visualizarHamburguer();

}
