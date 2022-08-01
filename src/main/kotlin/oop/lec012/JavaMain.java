package oop.lec012;

public class JavaMain {
    public static void main(String[] args) {
        KtFactory helloBaby = KtFactory.Companion.newBaby("HelloBaby");
        System.out.println(helloBaby.getName());


        KtFactory annotation_baby = KtFactory.newBaby2("Annotation Baby");
        System.out.println(annotation_baby.getName());
    }
}
