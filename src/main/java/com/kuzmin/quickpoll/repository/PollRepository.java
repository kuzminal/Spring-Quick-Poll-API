package com.kuzmin.quickpoll.repository;

import com.kuzmin.quickpoll.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
}
