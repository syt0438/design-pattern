package com.linshu.design.state;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
class VoteManager {

    private VoteState state;

    private Map<String, String> voteMap = new HashMap<>();

    private Map<String, Integer> voteCountMap = new HashMap<>();

    public void vote(String uid, String businessType) {
        Integer target = voteCountMap.getOrDefault(uid, 0) + 1;

        voteCountMap.put(uid, target);

        if (target == 1) {
            state = new NormalVoteState();
        } else if (target > 1 && target < 5) {
            state = new RepeatVoteState();
        } else if (target >= 5 && target < 8) {
            state = new SpiteVoteState();
        } else if (target >= 8 && target < 10) {
            state = new BlacklistWarnVoteState();
        } else if (target >= 10) {
            state = new BlacklistVoteState();
        }

        state.vote(uid, businessType, this);
    }

}
