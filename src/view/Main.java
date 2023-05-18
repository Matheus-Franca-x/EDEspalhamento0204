package view;

import controller.TabelaLojaControlle;
import model.Loja;

public class Main {

	public static void main(String[] args) 
	{
		
		TabelaLojaControlle controllDep = new TabelaLojaControlle();
		
		
		Loja l = new Loja(0, "ElectricDesire", "Venda de servicos tecnicos");
		Loja cL = new Loja(0, "ElectricDesire", null);
		try {
			controllDep.addDep(l);
			controllDep.consultDep(cL);
			controllDep.removerDep(cL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
