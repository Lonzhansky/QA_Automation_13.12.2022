package com.hillel.lesssons.lesson11.task;

public class ObstaclePool extends Obstacle {
    @Override
    public void start(Participant participant) {
        participant.swim();
    }
}
