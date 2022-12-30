package com.linshu.design.state;

class BlacklistVoteState implements VoteState {

    @Override
    public void vote(String uid, String businessType, VoteManager manager) {
        System.out.println("blacklist👺");
    }

}
