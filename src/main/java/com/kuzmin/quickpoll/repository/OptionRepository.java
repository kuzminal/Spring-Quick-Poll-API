package com.kuzmin.quickpoll.repository;

import com.kuzmin.quickpoll.domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
