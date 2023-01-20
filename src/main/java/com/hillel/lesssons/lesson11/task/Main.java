package com.hillel.lesssons.lesson11.task;

public class Main {
    public static void main(String[] args) {

//        Cat cat = new Cat("cat1");
//        Dog dog = new Dog("dog1");
//        Parrot parrot = new Parrot("parrot1");
//        Rabbit rabbit = new Rabbit("Rabbit");
//
//        ObstaclePool obstaclePool = new ObstaclePool();
//        ObstacleWall obstacleWall = new ObstacleWall();
//
//
//        obstaclePool.start(cat);
//        obstaclePool.start(dog);
//        obstaclePool.start(parrot);
//        obstaclePool.start(rabbit);
//
//        obstacleWall.start(cat);
//        obstacleWall.start(dog);
//        obstacleWall.start(parrot);
//        obstacleWall.start(rabbit);

        Participant participantCat = new Cat("sdfsdf");

//        if (participantCat instanceof Rabbit) {
//            ((Rabbit) participantCat).demo();
//        }

        if (participantCat instanceof Cat) {
            ((Cat) participantCat).demo();
        }


        Participant[] participants = {
                new Cat("cat1"),
//                new Dog("dog1"),
                new Parrot("parrot1"),
                new Rabbit("Rabbit")
        };

        Obstacle[] obstacles = {
                new ObstaclePool(),
                new ObstacleWall()
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }
    }
}
