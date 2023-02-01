package com.demo.many2many;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.*;
@Entity
@Table(name = "p_table")
public class Project {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	private String projectName;

	
	@JoinTable(name = "emp_proj_table", joinColumns = @JoinColumn(name="pid_fk"), inverseJoinColumns = @JoinColumn(name="eid_fk"))
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Employee> employees = new ArrayList<Employee>();

	public void addEmployeeToProject(Employee employee){
		employees.add(employee);
		employee.getProjects().add(this);
	}
	
	public Project() {
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Project(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + "]";
	}

	
}
