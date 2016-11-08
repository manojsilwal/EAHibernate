package EA.dao;
import java.util.List;

import org.hibernate.Query;

import EA.Main.HibernateUtil;
import EA.domain.Task;

public class TaskDao {
	
	public void create(Task task){
		HibernateUtil.getSession().persist(task);
	}
	public void update(Task task){
		
		HibernateUtil.getSession().merge(task);
	}
	
	public void delete(int id){
		System.out.println("===========");
		Query query = HibernateUtil.getSession().createQuery("delete Task where id = :ID");
		query.setParameter("ID", id);
	}

	public Task find(int id){
		return HibernateUtil.getSession().get(Task.class, id);
	}
	
	public List<Task> findAll(){
		return  HibernateUtil.getSession().createQuery("SELECT t FROM Task t").list();
	}
}