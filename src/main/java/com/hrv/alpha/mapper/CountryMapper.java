package com.hrv.alpha.mapper;

import com.hrv.alpha.controller.dto.common.Country;
import com.hrv.alpha.repository.entity.CountryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "code", source = "codeTwo")
    Country toCountry(CountryEntity entity);

    default List<Country> toCountryList(List<CountryEntity> entityList) {
        return entityList.stream().map(this::toCountry).toList();
    }

}
