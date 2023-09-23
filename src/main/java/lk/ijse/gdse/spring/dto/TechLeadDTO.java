package lk.ijse.gdse.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TechLeadDTO {
    private String techId;
    private String techName;
    private String techAddress;
    private String techMail;
}
