package com.PlacementManagement2.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PlacementManagement2.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
