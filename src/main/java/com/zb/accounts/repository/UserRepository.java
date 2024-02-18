package com.zb.accounts.repository;

import com.zb.accounts.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);
  boolean existsByUsernameOrPhoneNumber(String username, String phoneNumber);

}
