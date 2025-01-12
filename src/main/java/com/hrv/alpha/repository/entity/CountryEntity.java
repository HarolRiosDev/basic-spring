package com.hrv.alpha.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Table(name = "COUNTRY")
@Getter
@Setter
@Builder
public class CountryEntity {

    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODE_2")
    private String codeTwo;
    @Column(name = "CODE_3")
    private String codeThree;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NATIONALITY")
    private String nationality;
}
