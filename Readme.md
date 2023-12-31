# Unit-тесты (семинары)

### Урок 1. Цели и смысл тестирования

__Задание__

В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

### Урок 2. Знакомство с тестовыми фреймворками

__Задание__

Проект Vehicle. Написать следующие тесты с использованием JUnit5:

- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).

- Проверить, что объект Car создается с 4-мя колесами.

- Проверить, что объект Motorcycle создается с 2-мя колесами.

- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов, включающую абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".

Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".

Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.

Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.


### Урок 3. Качество тестов.

__Задание 1__

Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным. 
```Java
public boolean evenOddNumber(int n) {
    if (n % 2 == 0) {
        return true;
    } else {
        return false;
    }
 }
 ```

 __Задание 2__

 Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100)

 ```Java
 public boolean numberInInterval(int n) { … }
```
### Урок 4. Зависимости в тестах

__Задание 1. Ответьте письменно на вопросы:__

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?

__Задание 2.__

У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.

Формат сдачи: воспользуйтесь одним из вариантов: Ссылка на репозиторий Git или Прикрепленный архив

Письменное задание 1 можно также разместить в репозитории или разместить текстом в окне сдачи практического задания.

---
__Задание 1 (ответ)__
1. Использование тестовых заглушек является полезным при написании модульных тестов, поскольку они помогают изолировать код и обеспечивают более точное тестирование. Заглушки могут заменить сложные части системы или внешние зависимости, позволяя вам тестировать только определенный модуль или компонент. Это также помогает уменьшить время выполнения тестов и упрощает отладку.

2. Если нам нужно проверить, что метод был вызван с определенными аргументами, мы можем использовать “argument matcher” или “verifier” тестовую заглушку. Эти заглушки позволяют нам установить ожидаемые аргументы для метода и затем проверить, были ли они действительно переданы в метод при его вызове.

3. Если нам просто нужно вернуть определенное значение или исключение в ответ на вызов метода, мы можеv использовать “return value” или “stub” тестовую заглушку. Такие заглушки заменяют реальный метод или компонент и возвращают заранее определенное значение или выбрасывают указанное исключение.

4. Для имитации взаимодействия с внешним API или базой данных мы можем использовать “dummy” или “fake” тестовые заглушки. Эти заглушки представляют собой упрощенные версии внешних систем и предназначены для имитации их поведения во время тестирования. Они могут содержать фиктивные данные или выполнять простые операции, имитируя взаимодействие с внешними системами.


### Урок 6. Юнит тестирование в других языках
__Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:__
a. Рассчитывает среднее значение каждого списка.
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.

__Важно:__
Приложение должно быть написано в соответствии с принципами объектно-ориентированного программирования.
Используйте Pytest (для Python) или JUnit (для Java) для написания тестов, которые проверяют правильность работы программы. Тесты должны учитывать различные сценарии использования вашего приложения.
Используйте pylint (для Python) или Checkstyle (для Java) для проверки качества кода.
Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.

_*Формат и требования к сдаче: *_
Отчет о выполнении этого задания должен включать в себя следующие элементы:
- Код программы
- Код тестов
- Отчет pylint/Checkstyle
- Отчет о покрытии тестами
- Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии.

#### Решение:

![1](sem6/pylint_1.JPG)

Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.

#### Решение:

![1](sem6/pytest.jpg)

Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии.

#### Решение:

К каждой функции прикреплена документация. Данные сценарии выбраны так как в них наиболее вероятна ошибка.
