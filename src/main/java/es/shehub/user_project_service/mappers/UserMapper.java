package es.shehub.user_project_service.mappers;

import org.mapstruct.Mapper;

import es.shehub.user_project_service.models.dtos.UserDTO;
import es.shehub.user_project_service.models.entities.User;

@Mapper(componentModel = "spring", uses = {TechRoleMapper.class, SkillMapper.class, SchoolMapper.class})
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO dto);
}
