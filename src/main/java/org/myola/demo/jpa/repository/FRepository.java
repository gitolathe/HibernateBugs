package org.myola.demo.jpa.repository;

import org.myola.demo.jpa.domain.F;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ola Theander <ola.theander@myola.se>
 */
public interface FRepository extends CrudRepository<F, String> {

	Page<F> findAll(Pageable pageable);
}
