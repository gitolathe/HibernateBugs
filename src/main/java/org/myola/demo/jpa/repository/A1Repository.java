package org.myola.demo.jpa.repository;

import org.myola.demo.jpa.domain.A1;
import org.myola.demo.jpa.domain.MyId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ola Theander <ola.theander@myola.se>
 */
public interface A1Repository extends CrudRepository<A1, MyId> {

	Page<A1> findAll(Pageable pageable);
}
