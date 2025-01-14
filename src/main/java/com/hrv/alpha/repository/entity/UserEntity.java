package com.hrv.alpha.repository.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Table(name = "USERS")
@Getter
@Setter
@Entity
public class UserEntity {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "STATUS")
    private int status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "COUNTRY",referencedColumnName = "ID")
    private CountryEntity country;
}
