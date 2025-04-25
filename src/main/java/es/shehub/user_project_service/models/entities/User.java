package es.shehub.user_project_service.models.entities;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

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

    @Column(name = "availability_per_week", length = 2083)
    private int availabilityPerWeek;

    @Column(length = 3000)
    private String comments;

    @Column(name = "is_team_lead", nullable = false)
    private Boolean isTeamLead = false;

    @ManyToMany
    @JoinTable(name = "users_tech_roles", 
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "tech_role_id"))
    private Set<TechRole> techRoles = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "users_skills", 
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> skills = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "users_schools", 
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "school_id"))
    private Set<School> schools = new HashSet<>();
}
