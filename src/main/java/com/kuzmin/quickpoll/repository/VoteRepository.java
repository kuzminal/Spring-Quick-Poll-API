package com.kuzmin.quickpoll.repository;

import com.kuzmin.quickpoll.domain.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
}
