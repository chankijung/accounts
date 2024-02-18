package com.zb.accounts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long accountId;
  private String name;
  private double balance;

  @Column(nullable = false)
  private boolean deleted =false;
}
