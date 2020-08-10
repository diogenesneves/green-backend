package com.br.green.Green.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.green.Green.model.Account;

public interface AccountRepository extends MongoRepository<Account, String> {
	public Account findByEmailAndPassword(String email, String password);
}
