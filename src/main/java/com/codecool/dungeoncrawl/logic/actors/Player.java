package com.codecool.dungeoncrawl.logic.actors;

import com.codecool.dungeoncrawl.logic.Cell;

public class Player extends Actor {
    public Player(Cell cell) {
        super(cell);
    }

    public String getTileName() {
        return "player";
    }

    @Override
    public void move(int dx, int dy) {
//        System.out.println("Player moves start");
        super.move(dx, dy);
//        System.out.println("Player moves end");
    }
}