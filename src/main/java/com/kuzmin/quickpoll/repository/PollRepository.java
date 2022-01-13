package com.kuzmin.quickpoll.repository;

import com.kuzmin.quickpoll.domain.entity.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends CrudRepository<Poll, Long> {
}
