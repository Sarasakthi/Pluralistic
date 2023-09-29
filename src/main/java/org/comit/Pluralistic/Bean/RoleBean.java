package org.comit.Pluralistic.Bean;

public class RoleBean {
	
	int idRole;
	String nameRole;
	String descRole;
	String status;
	
	public RoleBean() {
		super();
	}

	public RoleBean(int idRole, String nameRole, String descRole, String status) {
		super();
		this.idRole = idRole;
		this.nameRole = nameRole;
		this.descRole = descRole;
		this.status = status;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	public String getDescRole() {
		return descRole;
	}

	public void setDescRole(String descRole) {
		this.descRole = descRole;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RoleBean [idRole=" + idRole + ", nameRole=" + nameRole + ", descRole=" + descRole + ", status=" + status
				+ "]";
	}
	
	
}
