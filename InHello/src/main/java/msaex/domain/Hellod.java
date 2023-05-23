package msaex.domain;

import java.util.*;
import lombok.*;
import msaex.domain.*;
import msaex.infra.AbstractEvent;

@Data
@ToString
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;

    public Hellod(Hello aggregate) {
        super(aggregate);
    }

    public Hellod() {
        super();
    }
}
