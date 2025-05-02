package es.shehub.user_project_service.models.dtos;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String avatarLink;
    private String linkedinLink;
    private String githubLink;
    private String portfolioLink;
    private int availabilityPerWeek;
    private String comments;
    private boolean teamLead;
    private Set<TechRoleDTO> techRoles =  new HashSet<>();
    private Set<SkillDTO> skills =  new HashSet<>();
    private Set<SchoolDTO> schools =  new HashSet<>();

}
