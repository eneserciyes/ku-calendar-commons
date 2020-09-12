package tr.com.merciyes.commons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Metadata {

    /**
     * The created date of the instance
     */
    private LocalDateTime createdAt;
    /**
     * The last updated date of the instance
     */
    private LocalDateTime updatedAt;
    /**
     * The creator of the instance
     */
    private String createdBy;
    /**
     * The last updater of the intance
     */
    private String updatedBy;
}
