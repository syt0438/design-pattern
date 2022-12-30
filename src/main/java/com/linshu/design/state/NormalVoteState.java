package com.linshu.design.state;

class NormalVoteState implements VoteState {

    @Override
    public void vote(String uid, String businessType, VoteManager manager) {
        manager.getVoteMap().put(uid, businessType);

        System.out.println("success👏");
    }

}
