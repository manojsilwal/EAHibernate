package EA.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Task {
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status
				+ ", volunteer=" + volunteer + ", resources=" + resources + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	@Id @GeneratedValue
	private int id;
	private String name;
	private String description;
	private String status;
	@OneToOne(mappedBy="task")
	private Volunteers volunteer;
	public Volunteers getVolunteer() {
		return volunteer;
	}
	public void setVolunteer(Volunteers volunteer) {
		this.volunteer = volunteer;
	}
	@Embedded
	private List<Resource> resources;
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	public int getId() {
		return id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
}
