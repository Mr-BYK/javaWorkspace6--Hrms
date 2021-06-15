package kodlamaio.hrms.Api.Controlllers;
import kodlamaio.hrms.Business.Abstracts.JobPositionsService;
import kodlamaio.hrms.Entities.Concretes.JobPositions;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/JobPositions")
@AllArgsConstructor


public class JobPositionsContoller {
    @Autowired
    private JobPositionsService jobPositionsService;

    @GetMapping("/getall")
    public List<JobPositions> getAll() {
        return jobPositionsService.getAll();
    }

}
