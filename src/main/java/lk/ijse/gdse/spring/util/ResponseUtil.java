package lk.ijse.gdse.spring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ResponseUtil {
    private int code;
    private String massage;
    private Object data;
}
