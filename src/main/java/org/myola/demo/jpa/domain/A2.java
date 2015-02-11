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
@Table(name = "A2")
@DiscriminatorValue("A")
public class A2
        extends A1
        implements Serializable {

    public A2() {
    }

    public A2(MyId myId, String someText) {
        super(myId, someText);
    }

}
