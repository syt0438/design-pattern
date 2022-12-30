package com.linshu.design.state;

interface VoteState {
    void vote(String uid, String businessType, VoteManager manager);
}
