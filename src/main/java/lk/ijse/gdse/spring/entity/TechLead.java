package lk.ijse.gdse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class TechLead implements SuperEntity{
    @Id
    private String techId;
    @Column(nullable = false)
    private String techName;
    @Column(nullable = false)
    private String techAddress;
    @Column(nullable = false)
    private String techMail;

}
