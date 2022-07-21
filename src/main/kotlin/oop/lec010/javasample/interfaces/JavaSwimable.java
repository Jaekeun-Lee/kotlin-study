package oop.lec010.javasample.interfaces;

public interface JavaSwimable {
    default void act() {
        System.out.println("어푸 어푸");
    }
}
