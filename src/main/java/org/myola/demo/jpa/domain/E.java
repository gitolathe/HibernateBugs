package org.myola.demo.jpa.domain;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Ola Theander <ola.theander@nasdaqomx.com>
 */
@Entity
@Table(name = "E")
@DiscriminatorValue("E")
public class E
        extends D
        implements Serializable {

    private String descriminator = "E";
    
    public E() {
    }

    public E(String id, String someText) {
        super(id, someText);
    }
    
    public E(String id, Type type, String someText) {
        super(id, type, someText);
    }

    public String getDescriminator() {
        return descriminator;
    }

    public void setDescriminator(String descriminator) {
        this.descriminator = descriminator;
    }
}
