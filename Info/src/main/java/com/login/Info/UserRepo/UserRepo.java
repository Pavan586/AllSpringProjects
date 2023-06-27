package com.login.Info.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.Info.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User,String>{

	User findByUserId(String userId);

}
