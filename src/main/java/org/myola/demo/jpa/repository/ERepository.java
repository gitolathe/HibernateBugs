package org.myola.demo.jpa.repository;

import org.myola.demo.jpa.domain.E;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ola Theander <ola.theander@myola.se>
 */
public interface ERepository extends CrudRepository<E, String> {

	Page<E> findAll(Pageable pageable);
}
