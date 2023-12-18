// Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным.

public boolean evenOddNumber(int n) {
    if (n % 2 == 0) {
        return true;
    } else {
        return false;
    }
 }

 @Test 
 public void testEvenNumber() {
    assertTrue(evenOddNumber(2));
}

@Test 
public void testOddNumber() {
    assertFalse(evenOddNumber(3));
}

// Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100)

@Test
public void testNumberInInterval() {
    assertEquals(true, numberInInterval(50));
    assertEquals(false, numberInInterval(-50));
}
@Test 
public void testNotNumberInInterval(){
    assertEquals(false,numberInInterval(101));
}


public boolean numberInInterval(int num){
    if(num<25||num>=100){
        return false;
    }else{
        return true;
    } 
}