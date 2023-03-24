package com.shinhands.mu.Stationary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Role")
@SequenceGenerator(name= "ROLE_SEQUENCE", sequenceName = "ROLE_SEQ", allocationSize = 1)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROLE_SEQUENCE")
    @Column(name="id",nullable = false)
    private Long id;

    @Column(name="name_role",length = 50)
    private String nameRole;

    @Column(name = "deleted")
    private Long deleted = 0L;
}
