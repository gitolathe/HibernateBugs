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
@Table(name = "F")
@DiscriminatorValue("F")
public class F
        extends E
        implements Serializable {

    public F() {
    }

    public F(String id, String someText) {
        super(id, someText);
    }

    public F(String id, Type type, String someText) {
        super(id, type, someText);
    }
}
