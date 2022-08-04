# 코틀린에서 다양한 클래스를 다루는 방법

## 1. Data Class

계층 간의 데이터 전달을 위한 DTO( Data Transfer Object )

--> **Java**   
[JavaPersonDto](./dataclass/JavaPersonDto.java)
```java
public class JavaPersonDto {

    private final String name;
    private final int age;

    public JavaPersonDto(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // getter, equals, hashcode, toString ...
    
}
```
   

> **Java 구성** 
> - *데이터(필드)*
> - *생성자*
> - *Getter*
> - *equals, hashcode*
> - *toString*

#

--> **Kotlin**  
[PersonDto](./dataclass/PersonDto.kt)

```kotlin
data class PersonDto(
    val name: String,
    val age: Int
)
```

class 앞에 `data` 키워드 추가

#
#

## 2. Enum Class

추가적인 클래스를 상속 받을 수 없다.
인터페이스는 구현할 수 있으며, 각 코드가 싱글톤이다.

--> **Java**  
[JavaCountry](./enumclass/JavaCountry.java)
```java
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
```


--> **Kotlin**  
[Country](./enumclass/Country.kt)
```kotlin
enum class Country(
        private val code: String
) {
    KOREA("ko"),
    AMERICA("us");
}
```


> Kotlin의 enum class 는 when 과 Sealed class 와 함께 사용했을 때 진가를 발휘한다. =>  
> [Java : Example class](./enumclass/Main.java)
> [Kotlin : Example function](./enumclass/Country.kt)


## 3. Sealed Class, Sealed Interface

[Sealed Class](./sealed/HyundaiCar.kt)

컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.  
즉, 런타임때 클래스 타입이 추가될 수 없다.  
- 하위 클래스는 Sealed class와 같은 패키지에 있어야 한다.  
- enum 클래스와 다르게 클래스를 상속 받을 수 있고, 싱글톤이 아닌 멀티 인스턴스가 가능.

상속이 가능하도록 추상클래스를 만들까 하는데.. 외부에서는 이 클래스를 상속 받지 않았으면 좋겠다.