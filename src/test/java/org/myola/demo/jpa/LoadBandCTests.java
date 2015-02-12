package org.myola.demo.jpa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.myola.demo.jpa.domain.A.Type.B;
import static org.myola.demo.jpa.domain.A.Type.C;
import org.myola.demo.jpa.domain.B;
import org.myola.demo.jpa.domain.C;
import org.myola.demo.jpa.domain.MyId;
import org.myola.demo.jpa.repository.ABCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaTestApplication.class)
public class LoadBandCTests {

    @Autowired
    private ABCRepository repository;
    
    @Test
    public void contextLoads() {
    }

    @Test
    public void testFindOneB() {
        final B b = (B)repository.findOne(
                new MyId("First", B));
        assertEquals("This is the first instance, type B.", b.getSomeText());
    }
    
    @Test
    public void testAddOneB() {
        repository.save(new B(new MyId("Second B", B),
                        "This is the second B instance."));
    }

    @Test
    public void testAddOneC() {
        repository.save(new C(new MyId("Second C", C),
                        "This is the second C instance."));
    }

    @Test
    public void testFindOneC() {
        final C c = (C)repository.findOne(
                new MyId("Second", C));
        assertEquals("This is the second instance, type C.", c.getSomeText());
    }
   
}
