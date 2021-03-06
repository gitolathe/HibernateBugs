package org.myola.demo.jpa.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author Ola Theander <ola.theander@myola.se>
 */
@Embeddable
public class MyId implements Serializable {

    @Column(nullable = false, length = 100)
    private String id;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private A.Type type;

    public MyId() {
    }

    public MyId(String id, A.Type type) {
        this.id = id;
        this.type = type;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public A.Type getType() {
        return type;
    }

    public void setType(A.Type type) {
        this.type = type;
    }

}
