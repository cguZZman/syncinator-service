package com.syncinator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.syncinator.model.UserConnection;

@RepositoryRestResource
interface UserConnectionRepository extends CrudRepository<UserConnection, Long>{}
