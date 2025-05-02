package es.shehub.user_project_service.mappers;

import java.util.Set;

import org.mapstruct.Mapper;

import es.shehub.user_project_service.models.dtos.TechRoleDTO;
import es.shehub.user_project_service.models.entities.TechRole;

@Mapper(componentModel = "spring")
public interface TechRoleMapper {
    TechRoleDTO toDTO(TechRole techRole);
    TechRole toEntity(TechRoleDTO dto);

    Set<TechRoleDTO> toDTOSet(Set<TechRole> techRoles);
    Set<TechRole> toEntitySet(Set<TechRoleDTO> dtos);
}
