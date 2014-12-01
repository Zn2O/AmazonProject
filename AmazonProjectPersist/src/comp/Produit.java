package comp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Produit 
{
	@javax.persistence.Id @GeneratedValue
	private int id;
	private String nom;
	private double prix;
	private int quantite;
	
	
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
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) 
	{
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite)
	{
		this.quantite = quantite;
	}


}
