package es.shehub.user_project_service.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.shehub.user_project_service.config.ApiPaths;
import es.shehub.user_project_service.exceptions.ShehubException;
import es.shehub.user_project_service.models.dtos.SkillDTO;
import es.shehub.user_project_service.services.SkillService;

@RestController
@RequestMapping(ApiPaths.SKILLS)
public class SkillController {
    
    @Autowired SkillService skillService;

    //Get list of all registered skills
    @GetMapping
    public ResponseEntity<Set<SkillDTO>> getAllSkills () throws ShehubException {
        Set<SkillDTO> skills = skillService.getAllSkills();

        return ResponseEntity.ok(skills);
    }

    //Get a specific skill
    @GetMapping("/{id}")
    public ResponseEntity<SkillDTO> getSkillById(@PathVariable int id) throws ShehubException {
        SkillDTO skill = skillService.findSkillById(id);
        return ResponseEntity.ok(skill);
    }

    //Create a new skill
    @PostMapping
    public ResponseEntity<SkillDTO> createNewSkill (@RequestBody SkillDTO dto) throws ShehubException {
        SkillDTO newSkill = skillService.createNewSkill(dto);

        return ResponseEntity.ok(newSkill);
    }
}
