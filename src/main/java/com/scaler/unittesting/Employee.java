package com.scaler.unittesting;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(name = "first_name",nullable = false)
    private String firstname;
    @Column(name = "last_nae",nullable = false)
    private String lastname;
    @Column(name = "email", nullable = false)
    private String email;
}
