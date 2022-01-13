package com.kuzmin.quickpoll.controller;

import com.kuzmin.quickpoll.domain.dto.OptionCount;
import com.kuzmin.quickpoll.domain.dto.VoteResult;
import com.kuzmin.quickpoll.domain.entity.Vote;
import com.kuzmin.quickpoll.repository.VoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ComputeResultController {
    private final VoteRepository voteRepository;

    public ComputeResultController(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @GetMapping("/computeresult")
    public ResponseEntity<VoteResult> computeResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.
                findByPoll(pollId);
        int totalVotes = 0;
        Map<Long, OptionCount> tempMap = new HashMap<>();
        for (Vote v : allVotes) {
            totalVotes++;
            OptionCount optionCount = tempMap.get(v.getOption().getId());
            if (optionCount == null) {
                optionCount = new OptionCount();
                optionCount.setOptionId(v.getOption().getId());
                tempMap.put(v.getOption().getId(), optionCount);
            }
            optionCount.setCount(optionCount.getCount() + 1);
        }
        voteResult.setTotalVotes(totalVotes);
        voteResult.setResults(tempMap.values());
        return new ResponseEntity<>(voteResult,
                HttpStatus.OK);
    }
}
