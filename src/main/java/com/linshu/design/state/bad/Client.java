package com.linshu.design.state.bad;

class Client {
    public static void main(String[] args) {
        VoteManager manager = new VoteManager();

        for (int i = 0; i < 8; i++) {
            manager.vote("linshu", "IRC");
        }
    }
}
