package oop.lec010.javasample;

import oop.lec010.javasample.interfaces.JavaFlyable;
import oop.lec010.javasample.interfaces.JavaSwimable;

public class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimable {
    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄 뒤뚱뒤뚱 걸어가~");
    }

    @Override
    public int getLegCount() {
        return super.legCount + this.wingCount;
    }

    @Override
    public void act() {
        JavaSwimable.super.act();
        JavaFlyable.super.act();
    }
}
