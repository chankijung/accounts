package com.zb.accounts.service;

import com.zb.accounts.model.User;
import com.zb.accounts.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  public User registerUser(String username, String password, String name, String phoneNumber) {
    if (userRepository.existsByUsernameOrPhoneNumber(username, phoneNumber)) {
      throw new RuntimeException("사용자 이름 또는 핸드폰 번호가 이미 존재합니다.");
    }
    User user = new User();
    user.setUsername(username);
    user.setPassword(passwordEncoder.encode(password));
    user.setName(name);
    user.setPhoneNumber(phoneNumber);
    return userRepository.save(user);
  }

}
