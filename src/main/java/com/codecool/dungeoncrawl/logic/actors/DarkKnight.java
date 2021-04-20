package com.codecool.dungeoncrawl.logic.actors;

import com.codecool.dungeoncrawl.logic.Cell;

public class DarkKnight extends Actor{

    public DarkKnight(Cell cell) {
        super(cell);
    }

    @Override
    public String getTileName() {
        return "darkKnight";
    }
}
