package tr.com.merciyes.commons.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.merciyes.commons.annotation.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class Event extends AbstractBo{

    private Long resourceId;

    @NotNull
    private String club;
    @NotNull
    private String eventTitle;

    private String description;
    @NotNull
    private String start;
    @NotNull
    private String end;
}
