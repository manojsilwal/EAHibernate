package EA.dao;
import java.util.List;

import org.hibernate.Query;

import EA.Main.HibernateUtil;
import EA.domain.Project;
import EA.domain.Volunteers;
public class VolunteerDao {
	public void create(Volunteers v){
		HibernateUtil.getSession().persist(v);
	}
	
	public void update(Volunteers v){
		
		HibernateUtil.getSession().merge(v);
	}
	
	public void delete(int id){
		System.out.println("===========");
		Query query = HibernateUtil.getSession().createQuery("delete Volunteers where id = :ID");
		query.setParameter("ID", id);
	}

	public Volunteers find(int id){
		return HibernateUtil.getSession().get(Volunteers.class, id);
	}
	
	public List<Volunteers> findAll(){
		return  HibernateUtil.getSession().createQuery("SELECT t FROM Volunteers t").list();
	}
}
