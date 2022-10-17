package com.giolcs.userdepet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giolcs.userdepet.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
