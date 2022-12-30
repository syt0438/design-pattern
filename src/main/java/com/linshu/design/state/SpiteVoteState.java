package com.linshu.design.state;

/**
 * SpiteVoteState
 */
class SpiteVoteState implements VoteState {

    @Override
    public void vote(String uid, String businessType, VoteManager manager) {
        manager.getVoteMap().remove(uid);

        System.out.println("punish🤜");
    }

}