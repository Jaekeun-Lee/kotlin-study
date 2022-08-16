# 코틀린에서 다양한 함수를 다루는 방법

### 1. 확장함수
### 2. infix 함수 (중위함수)
### 3. inline 함수
### 4. 지역함수

###
###
### 


## 1. 확장함수
> Kotlin은 Java와 100% 호환되는 것을 목표로 하고있어요!   
> -> 기존 Java 코드 위에 자연스럽게 코틀린 코드를 추가할 수 없을까?   
> Java로 만들어진 라이브러리를 유지보수, 확장할 때 Kotlin 코드를 덧붙히고 싶어.
>    
> -> 함수의 코드 자체는 클래스 밖에 있지만, 어떤 클래스안에 있는 함수처럼 가져다 쓸 수 있게 하자.

```kotlin
fun 확장하려는클래스(수신객체타입).함수이름(파라미터): 리턴타입 {
    //this(수신객체)를 이용해 실제 클래스 안의 값에 접근
} 
```
```kotlin
fun String.lastChar(): Char {
    return this[this.length - 1]
}
```

- 확장함수에서 수신객체 클래스의 private 함수를 가져오면 캡슐화가 깨질 수 있기 때문에클래스에 있는 private 또는 protected 맴버를 가져올 수 없다.
- 맴버함수와 확장함수의 시그니처가 같다면?   
-> 맴버함수가 우선적으로 호출된다.
- 확장함수가 오버라이드 된다면?   
-> 해당 변수의 현재 타입 즉, 정적인 타입에 의해 어떤 확장 함수가 호출될지를 결정한다.