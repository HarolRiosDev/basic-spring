package com.hrv.alpha.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Table(name = "USERS")
@Getter
@Setter
@Builder
public class UserEntity {
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "STATUS")
    private int status;
    @Column(name = "COUNTRY")
    @OneToOne
    @JoinColumn(name="ID")
    private CountryEntity country;
}
