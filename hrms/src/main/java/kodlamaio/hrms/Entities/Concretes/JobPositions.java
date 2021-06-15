package kodlamaio.hrms.Entities.Concretes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@Table(name = "JobPositions")
@AllArgsConstructor
@NoArgsConstructor

public class JobPositions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private  int id;

    @Column(name = "name")
    private String name;
}
