package oop.lec011;

public abstract class StringUtils {

    private StringUtils() {

    }

    public boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}
