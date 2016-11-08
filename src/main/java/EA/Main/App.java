package EA.Main;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import EA.domain.*;
import EA.service.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{
    		ProjectService ps=new ProjectService();
    		Project p=new Project();
    		p.setName("Manish");
    		
    		
    		Beneficieries b1=new Beneficieries();
    		b1.setName("Manoj");
    		
    		Beneficieries b2=new Beneficieries();
    		b2.setName("saroj");
    		
    		b1.setName("Manoj");
    		p.setBeneficiaries(Arrays.asList(b1,b2));
    		p.setEndDate(new Date());
    		p.setStartDate(new Date());
    		p.setDescription("this project is for all");
    		
    		
    		
    		TaskService ts=new TaskService();
    		Task t=new Task();
    		t.setDescription("library mgmt");
    		t.setName("task1");
    		t.setStatus("running");
    		t.setEndDate(new Date());
    		t.setStartDate(new Date());
    		Resource r=new Resource();
    		r.setName("Develper");
    		r.setName("Manoj");
    		
    		Resource r1=new Resource();
    		r.setName("manager");
    		r.setName("Sanzeev");
    		t.setResources(Arrays.asList(r,r1));
    		
    		
    		
    		
    		VolunteerService vs=new VolunteerService();
    		Volunteers v=new Volunteers();
    		v.setName("sanzeev");
    		
    		v.setTask(t);
    		
    		t.setVolunteer(v);
    		
    		ts.addProject(t);
    		vs.addProject(v);
    		
    		
    	//nt.setName("new task");
    	//ts.update(nt);
    	//ts.delete(1);
    	//System.out.println(ts.find(2).getName());
    	
    	//problem 1)See information about projects and their beneficiaries
    	
    	
    	//problem2)List tasks for a project
    	
    	p.setTasks(Arrays.asList(t));
    	ps.addProject(p);
    	System.out.println(ps.find(3).getTasks().get(0).getName());
    	List<Project> project=ps.findAll();
    	System.out.println("All project:"+"\n"+ project);
    	
    	
    	}	
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
