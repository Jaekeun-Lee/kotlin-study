package oop.lec010.javasample;

public class JavaCat extends JavaAnimal {

    public JavaCat(String species, int legCount) {
        super(species, 4);
    }

    @Override
    public void move() {
        System.out.println("자바 고양이 걸어가~");
    }
}
