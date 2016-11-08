package EA.dao;
import java.util.List;

import org.hibernate.Query;

import EA.Main.HibernateUtil;
import EA.domain.Project;
import EA.domain.Task;
public class ProjectDao {
	
	public void create(Project project){
		HibernateUtil.getSession().persist(project);
	}
	public void update(Project project){
		
		HibernateUtil.getSession().merge(project);
	}
	
	public void delete(int id){
		System.out.println("===========");
		Query query = HibernateUtil.getSession().createQuery("delete Project where id = :ID");
		query.setParameter("ID", id);
	}

	public Project find(int id){
		return HibernateUtil.getSession().get(Project.class, id);
	}
	
	public List<Project> findAll(){
		return  HibernateUtil.getSession().createQuery("SELECT t FROM Project t").list();
	}
	
}
