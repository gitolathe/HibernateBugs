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
@Table(name = "B")
@DiscriminatorValue("B")
public class B
        extends A
        implements Serializable {

    public B() {
    }

    public B(MyId myId, String someText) {
        super(myId, someText);
    }

}
