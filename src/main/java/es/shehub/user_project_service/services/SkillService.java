package es.shehub.user_project_service.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import es.shehub.user_project_service.exceptions.ShehubException;
import es.shehub.user_project_service.mappers.SkillMapper;
import es.shehub.user_project_service.models.dtos.SkillDTO;

import es.shehub.user_project_service.models.entities.Skill;
import es.shehub.user_project_service.repositories.SkillRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SkillService {
    private final SkillRepository skillRepository;
    private final SkillMapper skillMapper;

    public Set<SkillDTO> getAllSkills() throws ShehubException {
        Set<Skill> skills =  new HashSet<>(skillRepository.findAll());
        return skillMapper.toDTOSet(skills);
    }

    public SkillDTO createNewSkill(SkillDTO dto) throws ShehubException{
        if (skillRepository.existsByName(dto.getName())) {
            throw new ShehubException("Skill with name '" + dto.getName() + "' already exists.", HttpStatus.CONFLICT);
        }

        Skill newSkill = skillMapper.toEntity(dto);
        Skill savedSkill = skillRepository.save(newSkill);
        return skillMapper.toDTO(savedSkill);
        
    }

    public SkillDTO findSkillById(int id) throws ShehubException{
        Skill skill = skillRepository.findById(id).orElseThrow(() -> new ShehubException("Skill with id " + id + " not found", HttpStatus.NOT_FOUND));
        return skillMapper.toDTO(skill);
    }
}
