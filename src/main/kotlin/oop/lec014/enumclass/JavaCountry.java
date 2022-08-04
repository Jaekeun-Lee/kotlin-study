package oop.lec014.enumclass;

public enum JavaCountry {
    KOREA("ko"),
    AMERICA("us");

    private final String code;

    JavaCountry(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
