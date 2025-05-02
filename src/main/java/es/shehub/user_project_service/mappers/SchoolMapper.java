package es.shehub.user_project_service.mappers;

import java.util.Set;

import org.mapstruct.Mapper;

import es.shehub.user_project_service.models.dtos.SchoolDTO;
import es.shehub.user_project_service.models.entities.School;

@Mapper(componentModel = "spring")
public interface SchoolMapper {
    SchoolDTO toDTO(School school);
    School toEntity(SchoolDTO dto);

    Set<SchoolDTO> toDTOSet(Set<School> schools);
    Set<School> toEntitySet(Set<SchoolDTO> dtos);
}
