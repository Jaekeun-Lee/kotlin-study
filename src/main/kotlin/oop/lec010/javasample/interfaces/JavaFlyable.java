package oop.lec010.javasample.interfaces;

public interface JavaFlyable {
    default void act() {
        System.out.println("파닥 파닥");
    }
}
