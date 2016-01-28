package com.syncinator.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String provider;
	
	@Column(nullable = false)
	private String name;
	
	@OneToOne
	@JoinColumn( name="access_token_id")
	private UserConnection accessToken;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserConnection getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(UserConnection accessToken) {
		this.accessToken = accessToken;
	}
}
