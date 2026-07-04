package com.ilearn.auth_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userdetail")
public class UserModel {

    @Id
    private Long id;
    private String userName;
    private String password;
    
    public UserModel() {
    }
    
	public UserModel(Long id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}

}
