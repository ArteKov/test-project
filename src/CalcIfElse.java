public class CalcIfElse {
}
// example comment

/**

 * another comment example

 * */

/**

 * package - папка, для структури

 * Java class - файл, для описання об'экта. class - поняття, яке можно iнтпретувати як шаблон.

 * */

/**

 * variable - для опису якоiсть властивостi

 * data type + variable name + variable value;

 * example: String name = "Sergii"; int age = 32; boolean isStudent = false;

 * */

/**

 * TYPES:

 * 1. int - 32 USED !!

 * 2. double - 32.50 USED !!

 * 3. short - 12345

 * 4. long - 1234567890

 * 5. float - 25.55

 * 6. boolean: true / false USED !!

 * 7. char: "A", "1", "@"

 * 8. byte: 123

 *

 * ===

 * String, Object, Array

 * example: String name = "Sergii", Object cours = {"id": "123", "name": "QA"}, Array courses = [{"id": "123", "name": "QA"}, {"id": "123", "name": "QA"}]

 * */

/**

 * name of packeges starts with lowercase - examples

 * name of packeges starts with Uppercase - CalcProg

 * name of clasees starts with Uppercase  - CalcProg

 * name of methodes starts with lowercase - checkSum

 * _____

 * snake_case used for contsnts, for example: String CITY_OF_THE_BIRTH = "Dnipro";

 * camelCase

 * */

/**

 * METHOD'S

 * 1. void exampleMethod(){} - метод не повиртаэ значень пiсля виконання

 * 2. type + method name() {return result} - метод повертаэ вказанний тип данних для результату

 * */

/**

 * LOGIC CONSTRUCTIONS:

 * 1. if else

 * 2. switch case

 * */

//TODO: книга по JAVA: https://vukladach.pp.ua/MyWeb/manual/ingenerija_programnogo_zabezpegennia/ob'yektno%20oriyentovane%20prohramuvannya/OB'YEKTNO%20ORIYENTOVANE%20PROHRAMUVANNYA/Dodatku/JavaKid_ua/JavaKid_ua.pdf

class FirstProg {

    int numberA = 1;

    String CITY_OF_THE_BIRTH = "Dnipro";

    static void sayHello(){

        System.out.println("Hello World");

    }

    public static double checkSum(int a, int b){

        return a + b;

    }

    /**

     * public - iдентифiкатор який показуэ доступнiсть до цього метода в iнших класах

     * static - результат роботи метода буде доступний лише в цьому класi

     * void - виконання метода без повернення конкретного результату

     * main - назва метода

     * (String[] args) - cигнатура метода приймаэ параметри для подальшоi обробки в тiлi метода.

     * {} - тiло метода, де йде обробка данних чи реалiзацiя логiки

     * System.out.println(); - вивод данних в консоль

     * */

    public static void main(String[] args) {

        calc(5, 2, '+');

        calc(5, 2, '-');

        calc(5, 2, '/');

        calc(5, 2, '*');

        calc(5, 2, '?');

    }

    /**

     * = додаэмо значення

     * == порiвнюэмо значення

     * != не дорiвнюэ

     * */

    static double calc(double paramA, double paramB, char operation){

        double result = 0;

        if(operation == '+'){

            result = paramA + paramB;

        } else if(operation == '-') {

            result = paramA - paramB;

        } else if(operation == '/') {

            result = paramA / paramB;

        } else if(operation == '*') {

            result = paramA * paramB;

        } else {

            System.out.println("INCORRECT OPERATION!");

        }

        System.out.println("Calc result: " + result);

        return result;

    }

}