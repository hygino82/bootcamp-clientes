package com.crudtask.clientmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudtask.clientmanager.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
