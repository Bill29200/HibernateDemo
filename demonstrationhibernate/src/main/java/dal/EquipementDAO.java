package dal;

import java.util.List;

import javax.persistence.RollbackException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import bo.Equipement;



public class EquipementDAO {
	
	private Session session;
	
	public EquipementDAO() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
				                        .configure("hibernate.cfg.xml")
				                        .build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		session = factory.openSession();
		session = factory.openSession();
	}
//........................................................................
	public List<Equipement> selectAll(){
		return session.createQuery("from Equipement", Equipement.class).list();
		
	}
	//........................................................................
	public Equipement selectById(int id)
	{
		return session.find(Equipement.class, id);
		
	}
	//........................................................................
	public Equipement selectByName(String nom){
		return session.createQuery("from Equipement where nom = : param_nom", Equipement.class)
				.setParameter("param_nom", nom)
				.getSingleResult();
		
	} 
	//........................................................................
	public void insert(Equipement equipement)
	{
		//session.save(equipement);
		
		  Transaction t = session.beginTransaction();
		  try { 
			  session.save(equipement); // inserer 
			  session.flush(); // 
			  t.commit();
			  
		  }
		  catch (RollbackException rbe) { t.rollback();
		  System.out.println(rbe.getMessage()); }
		 
	}
	//........................................................................
	public void update(Equipement equipement)
	{
		//session.save(equipement);
		
		  Transaction t = session.beginTransaction();
		  try { 
			  session.update(equipement); // inserer 
			  session.flush(); // 
			  t.commit();
			  
		  }
		  catch (RollbackException rbe) { t.rollback();
		  System.out.println(rbe.getMessage()); }
		 
	}
	//........................................................................
	public void delete(Equipement equipement)
	{
		//session.save(equipement);
		
		  Transaction t = session.beginTransaction();
		  try { 
			  session.delete(equipement); // inserer 
			  session.flush(); // 
			  t.commit();
			  
		  }
		  catch (RollbackException rbe) { t.rollback();
		  System.out.println(rbe.getMessage()); }
		 
	}
}
