package comp;

import interf.ComposantPanierRemote;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful
@Remote(ComposantPanierRemote.class)
public class ComposantPanier implements ComposantPanierRemote
{
	@PersistenceContext (unitName = "AmazonProjectPersist")
	EntityManager em;

	@Override
	public void ajouterProduit() 
	{
		System.err.println("TEST Ajout Produit !");	
		
		Produit prod = new Produit();
		prod.setNom("Michel");
		prod.setPrix(150);
		
		em.persist(prod);
	}

}
