package com.linshu.design.state;

class BlacklistWarnVoteState implements VoteState {

    @Override
    public void vote(String uid, String businessType, VoteManager manager) {
        System.out.println("disabled login 3 days🤐");
    }

}
