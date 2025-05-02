package es.shehub.user_project_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.shehub.user_project_service.models.entities.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{
    Boolean existsByName(String name);
}
