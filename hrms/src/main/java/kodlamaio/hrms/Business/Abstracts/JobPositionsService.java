package kodlamaio.hrms.Business.Abstracts;
import kodlamaio.hrms.Entities.Concretes.JobPositions;

import java.util.List;

public interface JobPositionsService {
    List<JobPositions> getAll();
}
