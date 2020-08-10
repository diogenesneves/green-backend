package com.br.green.Green.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.green.Green.model.Account;
import com.br.green.Green.repository.AccountRepository;
import com.br.green.Green.resource.AccountResource;

@RestController
@RequestMapping("/v1/api")
public class AccountController {

	@Autowired
	private AccountRepository repository;

	@PostMapping("/login")
	public Account login(@RequestBody AccountResource accountResource) {
		Account account = repository.findByEmailAndPassword(accountResource.getEmail(), accountResource.getPassword());
		return account;
	}

	@PostMapping("/create")
	public Account create(@RequestBody AccountResource accountResource) {
		Account account = new Account();
		account.setEmail(accountResource.getEmail());
		account.setPassword(accountResource.getPassword());
		account.setDisplayName(accountResource.getDisplayName());
		Account accountSaved = repository.save(account);
		
		return accountSaved;
	}
}
