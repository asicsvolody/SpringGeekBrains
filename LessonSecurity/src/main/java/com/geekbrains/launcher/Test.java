package com.geekbrains.launcher;

public class Test {
    public static void main(String[] args) {

    }
}

//1 Какой будет результат выполнения следующего кода
//
//class Test1 {
//    public static void main(String[] args) {
//        System.out.println(new Test1());
//    }
//}
//
//        а) ссылка в памяти
//        b) Ошибка компиляции
//        c) Nan
//        d) NullPointerException
//
//





//        2 Какой будет результат выполнения следующего кода
//
//class Test2{
//    public static void main(String[] args) {
//        int i = 9;
//        System.out.println(i++);
//        System.out.println(i+1);
//        System.out.println(i);
//    }
//}
//
//        а)  9 11 11
//        b)  10 11 11
//        c)  9  11  10
//        d)  9 10 11
//
//




//        3 Перечислите все валидные сигнатуры конструкторов класса Clazz:
//
//        Clazz(String name)
//        Clazz Clazz(String name)
//        int Clazz(String name)
//        void Clazz(String name)
//        Clazz(name)
//        Clazz()
//
//        а)  1
//        b)  1,6
//        c) 6
//        d) 1,5,6
//




//
//
//
//
//
//        4 Какой будет результат выполнения следующего кода
//
//class Test4{
//    public static void main(String[] args) {
//        int[] mass = {1, 2};
//        List<String> list = new ArrayList(10);
//        list.add("03");
//        list.add("04");
//        System.out.println(mass.length + list.size() + ".");
//    }
//}
//
//        а)  4.
//        b)  12.
//        c) 11.
//        d) Ошибка компиляции
//




//        5 Какой будет результат выполнения следующего кода
//
//   class Test5 {
//    public static void main(String[] args) {
//        double d = Math.sqrt(-1);
//        System.out.println(Double.NaN == d);
//        d = d / 0;
//        System.out.println(Double.isNaN(d));
//    }
//}
//
//        а)  true true
//        b)  false true
//        c)  false false
//        d) true false
//





//
//        6 Какой будет результат выполнения следующего кода
//
//class Test6 {
//    public static void main(String[] args) {
//        System.out.println("Hello");
//        http://www.java.ru
//        return;
//    }
//}
//
//        а)  Ошибка при выполнении
//        b)  http://www.java.ru
//        c)  Hello
//        d)  Ошибка компиляции
//
//
//




//
//        7 Какие интерфейсы предоставляют возможность хранить объекты в виде пары "ключ-значение"?
//
//        java.util.Map
//        java.util.List
//        java.util.Set
//        java.util.SortedSet
//        java.util.SortedMap
//        java.util.Collection
//
//        а)  1,5
//        b)  1,4,5
//        c)  6
//






//        8 Какой будет результат выполнения следующего кода
//
//class equalsLong {
//    public static void main(String[] args) {
//        Long a = 111L;
//        Long b = 111L;
//        Long c = 222L;
//        Long d = 222L;
//
//        System.out.println(a == b);
//        System.out.println(c == d);
//    }
//}
//
//       а)  true true
//        b)  false true
//        c)  false false
//        d) true false
//




//        9 Как можно уничтожить объект в Java?
//
//        1. присвоить null всем ссылкам на объект
//        2. вызвать Runtime.getRuntime().gc()
//        3. вызвать метод finalize() у объекта
//        4. этого нельзя сделать вручную
//        5. вызвать деструктор у объекта
//
//        а)  1
//        b)  3
//        c)  4
//        d)  5
//
//
//
//
//
//
//
// 10  Скомпилируется ли следующий код, если оба класса будут объявлены в файле Test.java?
//
////Test.java
//public class Car{
//    public String myCar = "Ferrari" ;
//}
//public class Test{
//    public static void main(String ... args){
//        Car myCar = new Car();
//        System.out.println(myCar.myCar);
//    }
//}
//        а)  Да
//        b)  Нет
//        c)  Ошибка компиляции








//      11 В основе ArrayList лежит массив.
//
//        а) верно
//        b) не верно
//















//        12 Какое назначение интерфейса Externalizable?
//
//        а)  Позволяет превратить массив байт в объект
//        b)  Превращает объект в массив байт
//        c)  Реализация процессов сеарилизации и десерелизации в ручную
//
//









//        13 В каком порядке должны размещаться следующие опертаторы
//
//        a)
//        Package statement
//        Imports
//        Class or interface definitions
//
//б)
//        Imports
//        Package statement
//        Class or interface definitions
//
//в)
//        в любом порядке
//
//











//        14 Какой будет результат выполнения следующего кода
//
//class B {
//    public static void main(String[] args) {
//        big_loop:
//        for (int i = 0; i < 3 ; i++) {
//            try {
//                for (int j = 0; j < 3 ; j++) {
//                    if (i == j) continue;
//                    else if (i > j) continue big_loop;
//                    System.out.print("A");
//                }
//            } finally {
//                System.out.print("B");
//            }
//            System.out.print("C");
//        }
//    }
//}
//
//
//
//а). AABCAABCBC
//        b). AAABCAAABCAAABC
//        с). AABCBB
//        d). ABCABCABC
//        e). AABBCACA
//















//        15 Какой будет результат выполнения следующего кода
//
//class Test {
//    public static void main(String[] args) {
//        Integer i1 = 10;
//        Integer i2 = 10;
//        Double d1 = 10d;
//        Double d2 = 10d;
//
//        System.out.println(i1 == i2);
//        System.out.println(d1 == d2);
//
//    }
//}
//
//a) true false
//        b) false false
//        d) true true
//        e) false true
//












//        16 Какой будет результат выполнения следующего кода
//
//class Test6 {
//    static void method(int... a) {
//        System.out.println("inside int...");
//    }
//    static void method(long a, long b) {
//        System.out.println("inside long");
//    }
//    static void method(Integer a, Integer b) {
//        System.out.println("inside INTEGER");
//    }
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        method(a,b);
//    }
//}
//
//a) inside int
//        b) inside INTEGER
//        d) inside long
//
//
//
//










//        17 Какой будет результат выполнения следующего кода
//
//public static void main(String[] args) {
//        int a = 2;
//        int b = 10;
//        int c = 1 >> a++ + ++b - --a - b << 1;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        }
//
//        a) 2 11 2
//        b) 2 10 2
//        d) 10 11 12
//














//        18 Какой будет результат выполнения следующего кода
//
//class Test8 {
//    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Hello";
//        System.out.println(str1 == str2);
//
//
//        String str3 = "Hell";
//        String str4 = str3 + "o";
//        String str5 = "Hello";
//
//        System.out.println(str4 == str5);
//    }
//}
//
//a) true false
//        b) false false
//        d) true true
//        e) false true
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//














//        19 Какой будет результат выполнения следующего кода
//
//class Test9{
//    public static void main(String[] args) {
//        String str = null;
//        int x = 10;
//        if(x < 0 & str.equals("hello")) {
//            System.out.println("java");
//        }
//
//    }
//}
//
//a) java
//        b) nullpointerexception
//        d) 0















//20 Какой будет результат выполнения следующего кода
//
//class Test10 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i+=2) {
//            System.out.println(i++);
//        }
//    }
//}
//
//a) 0 3
//        b) 1 3 5
//        d) 0 2 4
//        e) 0 2