package oop.lec010.javasample;

import lombok.Getter;

@Getter
public abstract class JavaAnimal {

    protected final String species;
    protected final int legCount;

    public JavaAnimal(String species, int legCount) {
        this.species = species;
        this.legCount = legCount;
    }

    abstract public void move();

}
