package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId(long l) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
