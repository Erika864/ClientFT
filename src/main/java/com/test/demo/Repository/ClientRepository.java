package com.test.demo.Repository;

import com.test.demo.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface  ClientRepository extends JpaRepository<Client,Integer> {
}
