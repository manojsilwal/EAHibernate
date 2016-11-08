package EA.service;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import EA.Main.HibernateUtil;
import EA.dao.VolunteerDao;
import EA.domain.Volunteers;

public class VolunteerService {
	Session session = HibernateUtil.getSession();
	VolunteerDao vd=new VolunteerDao();
	public void addProject(Volunteers v){
		session.beginTransaction().begin();
		
		vd.create(v);
		
		HibernateUtil.getSession().beginTransaction().commit();
		//tx.rollback();
	}
	
	public Volunteers find(int id){
		Transaction tx=session.beginTransaction();
		
		Volunteers volunteers= vd.find(id);
		tx.commit();
		return volunteers;
		
	}
	public List<Volunteers> findAll(){
		Transaction tx=session.beginTransaction();
		
		List<Volunteers> volunteers= vd.findAll();
		tx.commit();
		return volunteers;
	}
	public void delete(int id){
		Transaction tx=session.beginTransaction();
		
		vd.delete(id);
		tx.commit();
	}
	
	public void update(Volunteers p){
		Transaction tx=session.beginTransaction();
		
		vd.update(p);
		tx.commit();
	}
}
