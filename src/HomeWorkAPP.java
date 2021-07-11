public class HomeWorkAPP {

    public static void main (String[] args){
        Employers[] employer = {
                new Employers(
                    "Иванов Иван Иванович",
                    "Программист",
                    "one@mail.ru",
                    "+7911-111-11-11",
                    100000,
                    40),
                new Employers(
                        "Петров Петр Петрович",
                        "Инженер",
                        "two@mail.ru",
                        "+7922-222-22-22",
                        80000,
                        46),
                new Employers(
                        "Любимова Анна Георгиевна",
                        "Секретарь",
                        "three@mail.ru",
                        "+7933-333-33-33",
                        25000,
                        27),
                new Employers(
                        "Варашилов Василий Павлович",
                        "Начальник производства",
                        "four@mail.ru",
                        "+7911-123-45-57",
                        70000,
                        55),
                new Employers(
                        "Бесфамильный Александр Владимирович",
                        "Продукт-менеджер",
                        "five@mail.ru",
                        "+7999-000-99-99",
                        75000,
                        33)
        };

        int minAge = 40;
        for (Employers employers : employer){
            if (employers.age > minAge){
                employers.printInfo();
                System.out.println();
            }
        }
    }
}