package es.shehub.user_project_service.models.entities;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    private UUID id;

    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 40, nullable = false)
    private String lastName;

    @Column(name = "avatar_link", length = 2083)
    private String avatarLink;

    @Column(name = "linkedin_link", length = 2083)
    private String linkedinLink;

    @Column(name = "github_link", length = 2083)
    private String githubLink;

    @Column(name = "portfolio_link", length = 2083)
    private String portfolioLink;

    @Column(name = "availability_per_week")
    private int availabilityPerWeek;

    @Column(length = 3000)
    private String comments;

    @Column(name = "is_team_lead", nullable = false)
    private Boolean teamLead = false;

    @ManyToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinTable(name = "users_tech_roles", 
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "tech_role_id"))
    private Set<TechRole> techRoles = new HashSet<>();

    @ManyToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinTable(name = "users_skills", 
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> skills = new HashSet<>();

    @ManyToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinTable(name = "users_schools", 
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "school_id"))
    private Set<School> schools = new HashSet<>();

    //Skills
    public void addSkill(Skill skill) {
        this.skills.add(skill);
        skill.getUsers().add(this);
    }
    
    public void removeSkill(Skill skill) {
        this.skills.remove(skill);
        skill.getUsers().remove(this);
    }
    
    // Schools
    public void addSchool(School school) {
        this.schools.add(school);
        school.getUsers().add(this);
    }
    
    public void removeSchool(School school) {
        this.schools.remove(school);
        school.getUsers().remove(this);
    }
    
    // TechRoles
    public void addTechRole(TechRole techRole) {
        this.techRoles.add(techRole);
        techRole.getUsers().add(this);
    }
    
    public void removeTechRole(TechRole techRole) {
        this.techRoles.remove(techRole);
        techRole.getUsers().remove(this);
    }
}
