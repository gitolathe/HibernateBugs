package org.myola.demo.jpa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.myola.demo.jpa.domain.A1.Type.A;
import static org.myola.demo.jpa.domain.A1.Type.B;
import org.myola.demo.jpa.domain.A2;
import org.myola.demo.jpa.domain.B2;
import org.myola.demo.jpa.domain.MyId;
import org.myola.demo.jpa.repository.A1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaTestApplication.class)
public class LoadA2andB2Tests {

    @Autowired
    private A1Repository a1Repository;
    
    @Test
    public void contextLoads() {
    }

    @Test
    public void testA2FindOne() {
        final A2 a2 = (A2)a1Repository.findOne(
                new MyId("First", A));
        assertEquals("This is the first instance, type A2.", a2.getSomeText());
    }
    
    @Test
    public void testAddOneA2() {
        a1Repository.save(
                new A2(new MyId("Second A2", A),
                        "This is the second A2 instance."));
    }

    @Test
    public void testAddOneB2() {
        a1Repository.save(
                new B2(new MyId("Second B2", B),
                        "This is the second B2 instance."));
    }

    @Test
    public void testB2FindOne() {
        final B2 b2 = (B2)a1Repository.findOne(
                new MyId("Second", B));
        assertEquals("This is the second instance, type B2.", b2.getSomeText());
    }
   
}
