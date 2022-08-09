# Kotlin에서 배열과 컬렉션

### 코틀린에서 컬렉션을 만들 때도 불변/가변을 지정해야 한다. 
- 디폴트는 불변
- Java와 Kotlin 코드를 섞어 컬렉션을 사용할 때에는 주의해야함.

  - Java에서 Kotlin쪽의 컬렉션을 호출해서 컬렉션 내용을 변경 시킬 수 있음을 감안해야 한다.   
  - 코틀린에서의 불변컬렉션을 수정할 수도 있고, non-nullable 컬렉션에 null을 넣을 수도 있다.   
    -> 코틀린쪽에서 Collections.unmodifiableXXX() 를 활용하면 변경 자체는 막을 수 있다.


###   
###   

### Kotlin에서 Java의 컬렉션을 가져다 사용할 때 *플랫폼 타입*을 신경써야 한다.

###

예시. [Java] -> List<Integer>
### 1. List<Int?>
- 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님.

### 2. List<Int>?
- 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음.

### 3. List<Int?>?
- 리스트에 null이 들어갈 수 있고, 리스트도 null일 수 있음.
