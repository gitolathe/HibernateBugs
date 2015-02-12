package org.myola.demo.jpa.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Ola Theander <ola.theander@myola.se>
 */
@Entity
@Table(name = "D")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Descriminator")
//@DiscriminatorColumn(name = "type", columnDefinition = "Type", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorColumn(name = "Descriminator", columnDefinition = "Descriminator", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("D")
public class D implements Serializable {

    public enum Type {

        D,
        E,
        F
    }

    @Id
    @Column(nullable = false, length = 100)
    private String id;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Type type;
    
    @Column(nullable = false, length = 255)
    private String someText;

    public D() {
    }

    public D(String id, String someText) {
        this.id = id;
        this.someText = someText;
    }

    public D(String id, Type type, String someText) {
        this.id = id;
        this.type = type;
        this.someText = someText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public Type getType() {
//        return type;
//    }
//
//    public void setType(Type type) {
//        this.type = type;
//    }

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

}
