package org.myola.demo.jpa.repository;

import org.myola.demo.jpa.domain.A;
import org.myola.demo.jpa.domain.MyId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ola Theander <ola.theander@myola.se>
 */
public interface ABCRepository extends CrudRepository<A, MyId> {

	Page<A> findAll(Pageable pageable);
}
