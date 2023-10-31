package ru.sberhealth.rgs;

public class Main {

    public static void main(String[] args) {
        Human brad = new Human("Brad", "Pitt", 52);
        // Выведем имя
        System.out.println("Имя: " + brad.name);

        // Выведем null, потому что профессия не была определена
        System.out.println("Профессия: " + brad.profession);

        // Теперь Брэда зовут Джоном
        brad.name = "John";
        System.out.println("Имя: " + brad.name);

        // Теперь у него вообще нет имени
        brad.name = null;
        System.out.println("Имя: " + brad.name);

        // Новый человек - Алисса, при создании не задаем никаких параметров, поэтому все параметры ставятся по умолчанию null
        Human alissa = new Human();
        System.out.println("Имя: " + alissa.name);

        // Примитивные типы не могут быть равны null, поэтому когда они не заданы, у них проставляется 0 по умолчанию, если это числовые значения
        System.out.println("Возраст: " + alissa.age);

        // Метод equals() сравнивает два объекта по равенству полей. Если все поля имеют одинаковые значения, то считается, что два объекта равны между собой
        // и в консоли мы увидим true
        Human jack = new Human("Jack", "Sheppard", 44);
        Human jack2 = new Human("Jack", "Sheppard", 44);
        System.out.println("Джек равен Джеку? - " + jack.equals(jack2));
        // При печати объекта мы видим, что выводятся все его поля, потому что мы таким образом переопределили метод toString()
        System.out.println(jack);

        // В классе Human2 мы не переопределяли equals(), поэтому он сравнивает так называемые ссылки на объекты, которые хранятся в памяти
        // по сути это два разных объекта, и информация о них хранится в разных местах в памяти, следовательно, и при сравнении
        // это будет считаться как два разных объекта, и в консоли мы увидим false
        Human2 scott = new Human2("Scott", "Black", 23);
        Human2 scott2 = new Human2("Scott", "Black", 23);
        System.out.println("Скотт равен Скотту? - " + scott.equals(scott2));

        // В классе Human2 мы не переопределяли метод toString(), поэтому он работает по умолчанию и выводит какое-то непонятное значение.
        // Задача на для самостоятельного изучения - узнать, что он выводит по умолчанию, и для чего так сделано
        System.out.println(scott);

        // Выведет на экран профессию созданного человека
        Human human = new Human("Brad", "Pitt", 52);
        human.setProfession("Actor");
        System.out.println(human.getProfession());

        // Мы создали два объекта класса Good - товар. При этом статическая переменная класса Good не пересоздается с каждым новым объектом,
        // а остается одинаковой для всех экземпляров данного класса. При этом с каждым созданным объектом она увеличивается на единицу
        Good juice = new Good("Яблочный сок", 10);
        Good chocolate = new Good("Шоколад", 8);
        System.out.println(Good.amountOfGoods);

        // Вызов статического метода
        Good.printHello();
    }
}
