package com.linshu.design.state;

class Client {
    public static void main(String[] args) {
        VoteManager manager = new VoteManager();

        for (int i = 0; i < 10; i++) {
            manager.vote("linshu", "IRC");
        }
    }
}
