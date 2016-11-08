package EA.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import EA.Main.HibernateUtil;
import EA.dao.ProjectDao;
import EA.domain.Project;
import EA.domain.Task;

public class ProjectService {
	ProjectDao project=new ProjectDao();
	Session session = HibernateUtil.getSession();
	
	public void addProject(Project p){
		Transaction tx=session.beginTransaction();
		project.create(p);
		
		tx.commit();
		//tx.rollback();
	}
	
	public Project find(int id){
		Transaction tx=session.beginTransaction();
		
		Project project1= project.find(id);
		tx.commit();
		return project1;
		
	}
	public List<Project> findAll(){
		Transaction tx=session.beginTransaction();
		
		List<Project> projects= project.findAll();
		tx.commit();
		return projects;
	}
	public void delete(int id){
		Transaction tx=session.beginTransaction();
		
		project.delete(id);
		tx.commit();
	}
	
	public void update(Project p){
		Transaction tx=session.beginTransaction();
		
		project.update(p);
		tx.commit();
	}
	
}
