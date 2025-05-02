package es.shehub.user_project_service.models.dtos.requests;

import java.util.Set;

import es.shehub.user_project_service.models.dtos.SkillDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SkillRegisterRequestDTO {
    private String userId;
    private Set<SkillDTO> skills; 
}
