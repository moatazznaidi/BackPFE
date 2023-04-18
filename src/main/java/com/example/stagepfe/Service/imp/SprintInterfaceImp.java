package com.example.stagepfe.Service.imp;
import com.example.stagepfe.Repository.SprintRepository;
import com.example.stagepfe.Service.SprintService;
import com.example.stagepfe.models.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class SprintInterfaceImp implements SprintService {
    @Autowired
    SprintRepository SprintRepository;
    public List<Sprint> getAllSprints() {
        return SprintRepository.findAll();
    }

    public Sprint getSprintsById(Long id) {
        return SprintRepository.findById(id).orElse(null);
    }

    public Sprint saveSprint(Sprint Sprint) {
        return SprintRepository.save(Sprint);
    }

    public void deleteSprint(Long id) {
        SprintRepository.deleteById(id);
    }

}
