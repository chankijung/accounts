package com.zb.accounts.controller;

import com.zb.accounts.dto.UserDto;
import com.zb.accounts.model.User;
import com.zb.accounts.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping("/signup")
  public ResponseEntity<?> registerUser(@RequestBody UserDto userDto){
    try{
    User user= userService.registerUser(userDto.getUsername(), userDto.getPassword(),
        userDto.getName(), userDto.getPhoneNumber());
    return ResponseEntity.ok(" 회원 가입이 됐습니다.");
  }catch (Exception e){
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
