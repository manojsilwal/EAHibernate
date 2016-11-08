package EA.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Project {
	@Id @GeneratedValue
	private int id;
	private String name;
	private String description;
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	@ElementCollection
	private List<Beneficieries> beneficiaries=new ArrayList<Beneficieries>();
	
	@OneToMany
	@JoinColumn(name="Project_id")
	private List<Task> tasks=new ArrayList<Task>();
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Beneficieries> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<Beneficieries> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
				+ ", beneficiaries=" + beneficiaries + ", endDate=" + endDate + "]";
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
