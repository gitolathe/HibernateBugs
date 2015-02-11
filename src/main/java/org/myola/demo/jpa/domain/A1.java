package org.myola.demo.jpa.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Ola Theander <ola.theander@myola.se>
 */
@Entity
@Table(name = "A1")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Type")
public abstract class A1 implements Serializable {

    public enum Type {

        A,
        B
    }

    @EmbeddedId
    private MyId myId;
    @Column(nullable = false, length = 255)
    private String someText;

    public A1() {
    }

    public A1(MyId myId, String someText) {
        this.myId = myId;
        this.someText = someText;
    }

    public MyId getMyId() {
        return myId;
    }

    public void setMyId(MyId myId) {
        this.myId = myId;
    }

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

}
