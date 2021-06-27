package HRMSDemo.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "languages")
@JsonIgnoreProperties({
        "hibernateLazyInitializer","handler","cvLanguages"
})
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int lngId;

    @Column(name = "name")
    private String lngName;

    @OneToMany(mappedBy = "languages")
    private List<CvLanguage> cvLanguages;
}
