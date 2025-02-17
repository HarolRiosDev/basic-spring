package com.hrv.alpha.mapper;

import com.hrv.alpha.controller.dto.common.Status;
import com.hrv.alpha.controller.dto.common.User;
import com.hrv.alpha.repository.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "status", qualifiedByName = "getStatus", source = "status")
    @Mapping(target = "country.name", source = "country.name")
    @Mapping(target = "country.code", source = "country.codeTwo")
    User toUser(UserEntity entity);

    default List<User> toUserList(List<UserEntity> entityList) {
        return entityList.stream().map(this::toUser).toList();
    }

    @Named("getStatus")
    default Status getStatus(int status) {
        return Status.getStatusByType(status);
    }
}
