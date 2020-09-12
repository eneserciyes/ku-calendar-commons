package tr.com.merciyes.commons.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Event extends AbstractBo{

    private Long resourceId;

    private String club;

    private String eventTitle;

    private String description;

    private LocalDateTime date;

    private String duration;
}
