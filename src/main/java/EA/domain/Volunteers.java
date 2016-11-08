package EA.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Volunteers {
	@Override
	public String toString() {
		return "Volunteers [id=" + id + ", name=" + name + ", task=" + task + "]";
	}
	@Id @GeneratedValue
	private int id;
	private String name;
	@OneToOne
	@JoinColumn(name="task_id")
	private Task task;
	public int getId() {
		return id;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}	
