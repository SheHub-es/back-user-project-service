package es.shehub.user_project_service.mappers;

import java.util.Set;

import org.mapstruct.Mapper;

import es.shehub.user_project_service.models.dtos.SkillDTO;
import es.shehub.user_project_service.models.entities.Skill;

@Mapper(componentModel = "spring")
public interface SkillMapper {
    SkillDTO toDTO(Skill skill);
    Skill toEntity(SkillDTO dto);

    Set<SkillDTO> toDTOSet(Set<Skill> skills);
    Set<Skill> toEntitySet(Set<SkillDTO> dtos);
}
