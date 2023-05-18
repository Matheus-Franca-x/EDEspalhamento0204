package controller;

import matheus.ListaObject.ListaObject;
import model.Loja;

public class TabelaLojaControlle 
{
	private ListaObject[] listaDep;
	
	
	public TabelaLojaControlle()
	{
		listaDep = new ListaObject[4];
		iniciaListaDep();
	}
	
	public void iniciaListaDep()
	{
		int tam = listaDep.length;
		
		for (int i = 0; i < tam; i++)
		{
			listaDep[i] = new ListaObject();
		}
	}
	
	public void addDep(Loja dep) throws Exception
	{
		int posit = dep.hashCode();
		
		if (listaDep[posit].isEmpty())
		{
			listaDep[posit].addFirst(dep);			
		}
		else
		{
			listaDep[posit].addLast(dep);
		}
	}
	
	public Loja consultDep(Loja dep) throws Exception
	{
		int tam = listaDep.length;
		
		for (int i = 0; i < tam; i++)
		{
			int tamDep = listaDep[i].size();
			for (int j = 0; j < tamDep; j++)
			{				
				Loja consultDep = (Loja) listaDep[i].get(j);
				if (consultDep.getNomeDep().equals( dep.getNomeDep()))
				{
					System.out.println(consultDep.toString());
					return dep;
				}
			}
		}
		
		return dep;
	}
	
	public Loja removerDep(Loja dep) throws Exception
	{
		int tam = listaDep.length;
		
		for (int i = 0; i < tam; i++)
		{
			int tamDep = listaDep[i].size();
			for (int j = 0; j < tamDep; j++)
			{				
				Loja removeDep = (Loja) listaDep[i].get(j);
				if (removeDep.getNomeDep().equals( dep.getNomeDep()))
				{
					listaDep[i].remove(j);
					return dep;
				}
			}
		}
		return dep;
	}
}
