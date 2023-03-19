package entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Laborant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ad;
    private String soyad;
    private String telefon;

    // getter ve setter metotları
}
