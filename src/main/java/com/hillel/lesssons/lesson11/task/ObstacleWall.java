package com.hillel.lesssons.lesson11.task;

public class ObstacleWall extends Obstacle {

    @Override
    public void start(Participant participant) {
        participant.jump();
    }
}
