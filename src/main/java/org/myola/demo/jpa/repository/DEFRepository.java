package org.myola.demo.jpa.repository;

import org.myola.demo.jpa.domain.D;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ola Theander <ola.theander@myola.se>
 */
public interface DEFRepository extends CrudRepository<D, String> {

	Page<D> findAll(Pageable pageable);
}
