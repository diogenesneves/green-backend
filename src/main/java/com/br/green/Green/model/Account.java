package com.br.green.Green.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Account {
	@Id
	public String id;
	private String name;
	private String email;
	private String password;
	private String displayName;
	private String homes;
	private String lastLogin;
	private String sessionCountTotal;
	private String sessionTimeTotal;
	private String online;
	private String metaData;
}
