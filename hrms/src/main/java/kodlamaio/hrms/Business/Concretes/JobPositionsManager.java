package kodlamaio.hrms.Business.Concretes;

import kodlamaio.hrms.Business.Abstracts.JobPositionsService;
import kodlamaio.hrms.Entities.Concretes.JobPositions;
import kodlamaio.hrms.dataAccess.Abstracts.JobPositionsDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobPositionsManager  implements JobPositionsService {

    @Autowired
    private JobPositionsDao jobPositionsDao;

    @Override
    public List<JobPositions> getAll() {
        return jobPositionsDao.findAll() ;
    }
}
