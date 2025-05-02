package es.shehub.user_project_service.models.dtos.requests;

import java.util.HashSet;
import java.util.Set;

import es.shehub.user_project_service.models.dtos.SchoolDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SchoolRegisterRequestDTO {
    private String userId;
    private Set<SchoolDTO> schools = new HashSet<>();
}
