package com.example.bug.project.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Bug 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@NotNull
	@NotBlank(message = "Email cannot be Blank")
	private String emailAddress;
	private String description;

	private String priority;
	private STATUS status;
	private String ownerProject;
	private String owner;
	private boolean attachedFiles;
	
	private Date createDate;
	private Date completedDate;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public String getOwnerProject() {
		return ownerProject;
	}
	public void setOwnerProject(String ownerProject) {
		this.ownerProject = ownerProject;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public boolean isAttachedFiles() {
		return attachedFiles;
	}
	public void setAttachedFiles(boolean attachedFiles) {
		this.attachedFiles = attachedFiles;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}
	
	@Override
	public String toString() {
		return "BugRequest [id=" + id + ", name=" + name + ", emailAddress=" + emailAddress + ", description="
				+ description + ", priority=" + priority + ", status=" + status + ", ownerProject=" + ownerProject
				+ ", owner=" + owner + ", attachedFiles=" + attachedFiles + ", createDate=" + createDate
				+ ", completedDate=" + completedDate + "]";
	}
}