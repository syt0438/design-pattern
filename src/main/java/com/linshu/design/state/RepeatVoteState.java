package com.linshu.design.state;

class RepeatVoteState implements VoteState {

    @Override
    public void vote(String uid, String businessType, VoteManager manager) {
        System.out.println("warn🫵");
    }

}
