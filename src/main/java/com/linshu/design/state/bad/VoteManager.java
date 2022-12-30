package com.linshu.design.state.bad;

import java.util.HashMap;
import java.util.Map;

class VoteManager {
    private Map<String, String> voteMap = new HashMap<>();

    private Map<String, Integer> voteCountMap = new HashMap<>();

    public void vote(String uid, String businessType) {
        Integer target = voteCountMap.getOrDefault(uid, 0) + 1;

        voteCountMap.put(uid, target);

        if (target == 1) {
            voteMap.put(uid, businessType);

            System.out.println("success👏");
        } else if (target > 1 && target < 5) {
            System.out.println("warn🫵");
        } else if (target >= 5 && target < 8) {
            voteMap.remove(uid);

            System.out.println("punish🤜");
        } else {
            System.out.println("blacklist👺");
        }
    }

}
