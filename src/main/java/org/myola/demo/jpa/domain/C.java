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
@Table(name = "C")
@DiscriminatorValue("C")
public class C
        extends A
        implements Serializable {

    public C() {
    }

    public C(MyId myId, String someText) {
        super(myId, someText);
    }
}
