package entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Rapor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String raporNo;
    private Date  olusturmaTarihi;
    private String laborant;
    private String hasta;

    // getter ve setter metotları
}

