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
@Table(name = "B2")
@DiscriminatorValue("B")
public class B2
        extends A1
        implements Serializable {

    public B2() {
    }

    public B2(MyId myId, String someText) {
        super(myId, someText);
    }
}
