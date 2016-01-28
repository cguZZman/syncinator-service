package com.syncinator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.syncinator.model.Account;

@RepositoryRestResource
public interface AccountRepository extends CrudRepository<Account, Long>{}
