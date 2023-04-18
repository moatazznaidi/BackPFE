package com.example.stagepfe.Service;
import com.example.stagepfe.models.Sprint;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface SprintService {
    public List<Sprint> getAllSprints();
    public Sprint getSprintsById(Long id);

    public Sprint saveSprint(Sprint sprints);

    public void deleteSprint(Long id);}