package org.myola.demo.jpa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.myola.demo.jpa.domain.D.Type.E;
import static org.myola.demo.jpa.domain.D.Type.F;
import org.myola.demo.jpa.domain.F;
import org.myola.demo.jpa.domain.E;
import org.myola.demo.jpa.repository.DEFRepository;
import org.myola.demo.jpa.repository.ERepository;
import org.myola.demo.jpa.repository.FRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test for bug report HHH-9303
 * (https://hibernate.atlassian.net/browse/HHH-9303).
 *
 * @author olth
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaTestApplication.class)
public class TestHHH9303 {

    @Autowired
    private DEFRepository repository;

    @Autowired
    private ERepository repE;

    @Autowired
    private FRepository repF;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFindOneF() {
        final F f = (F) repository.findOne("First");
        assertEquals("This is the first instance, type F.", f.getSomeText());
    }

    @Test
    public void testFindOneFWithRepF() {
        final F f = (F) repF.findOne("First");
        assertEquals("This is the first instance, type F.", f.getSomeText());
    }

    @Test
    public void testFindOneE() {
        final E e = (E) repository.findOne("Third");
        assertEquals("This is the third instance, type E.", e.getSomeText());
    }

    @Test
    public void testFindOneE2() {
        E e = repE.findOne("Third");
        assertEquals("This is the third instance, type E.", e.getSomeText());
    }

    @Test
    public void testAddOneE() {
        repository.save(new E("Fourth E", E,
                        "This is the fourth E instance."));

    }

    @Test
    public void testAddOneF() {
        repository.save(new F("Second F", F,
                        "This is the second B instance."));

    }

}
