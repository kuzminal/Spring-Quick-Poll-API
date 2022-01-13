package com.kuzmin.quickpoll.repository;

import com.kuzmin.quickpoll.domain.entity.Option;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends CrudRepository<Option, Long> {
}
