package model;

import java.util.Objects;

public class Loja 
{
	private int andar;
	private String nomeDep;
	private String descDep;
	
	public Loja(int andar, String nomeDep, String descDep) 
	{
		this.andar = andar;
		this.nomeDep = nomeDep;
		this.descDep = descDep;
	}

	public int getAndar() {
		return andar;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public String getDescDep() {
		return descDep;
	}

	@Override
	public String toString() {
		return "Loja [andar=" + andar + ", nomeDep=" + nomeDep + ", descDep=" + descDep + "]";
	}

	@Override
	public int hashCode() {
		return andar;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		return andar == other.andar && Objects.equals(descDep, other.descDep) && Objects.equals(nomeDep, other.nomeDep);
	}
	
	
	
}
