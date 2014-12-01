package comp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Produit 
{
	@javax.persistence.Id @GeneratedValue
	private int id;
	private String nom;
	private int prix;
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	public int getPrix() 
	{
		return prix;
	}
	public void setPrix(int prix)
	{
		this.prix = prix;
	}

}
