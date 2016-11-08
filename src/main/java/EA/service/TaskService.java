package EA.service;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import EA.Main.HibernateUtil;
import EA.dao.TaskDao;
import EA.domain.Task;
public class TaskService {
	TaskDao td=new TaskDao();
	Session session = HibernateUtil.getSession();
	
	public void addProject(Task task){
		Transaction tx=session.beginTransaction();
		
		td.create(task);
		
		tx.commit();
		//tx.rollback();
	}
	public Task find(int id){
		Transaction tx=session.beginTransaction();
		
		Task task= td.find(id);
		tx.commit();
		return task;
		
	}
	public List<Task> findAll(){
		Transaction tx=session.beginTransaction();
		
		List<Task> task= td.findAll();
		tx.commit();
		return task;
	}
	public void delete(int id){
		Transaction tx=session.beginTransaction();
		
		td.delete(id);
		tx.commit();
	}
	
	public void update(Task task){
		Transaction tx=session.beginTransaction();
		
		td.update(task);
		tx.commit();
	}
}

