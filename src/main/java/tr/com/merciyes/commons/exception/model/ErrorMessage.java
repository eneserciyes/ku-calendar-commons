package tr.com.merciyes.commons.exception.model;

import lombok.*;
import tr.com.merciyes.commons.model.AbstractBo;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErrorMessage implements Serializable {
    private Integer status;
    private String title;
    private String detail;
    private String pointer;
    private String parameter;
}
