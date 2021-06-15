package kodlamaio.hrms.dataAccess.Abstracts;

import kodlamaio.hrms.Entities.Concretes.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionsDao extends JpaRepository<JobPositions ,Integer> {
}
