package homework9;

public class Main {


    public static void main(String[] args) {
        Author antonPetryakov = new Author("Антон", "Петряков");
        Author alexPushkin = new Author("Александр", "Пушкин");
        Book bookFreshlife = new Book("Как начать новыю жизнь с понедельника и не бросить во вторник.", antonPetryakov, 2019);
        Book bookEvgeniyOnegin = new Book("Евгений Онегин", alexPushkin, 1965);
        Book bookRuslanILyudmila = new Book("Руслан и Людмила", alexPushkin, 1849);
        System.out.println("book3.getPublishingYear() = " + bookRuslanILyudmila.getPublishingYear());
        bookRuslanILyudmila.setPublishingYear(1983);
        System.out.println("book3.getPublishingYear() = " + bookRuslanILyudmila.getPublishingYear());
//        ДЗ 10, проверки переопределенных методов
        Author alexPushkinTest = new Author("Александр", "Пушкин");
        System.out.println(alexPushkin.equals(alexPushkinTest));
        System.out.println(alexPushkin.equals(antonPetryakov));
        System.out.println(bookEvgeniyOnegin);
        System.out.println(bookRuslanILyudmila);
        System.out.println(antonPetryakov);
        Book bookFreshlifeTest = new Book("Как начать новыю жизнь с понедельника и не бросить во вторник.", antonPetryakov, 2019);
        System.out.println(bookFreshlife.equals(bookFreshlifeTest));
        System.out.println(bookFreshlife.equals(bookEvgeniyOnegin));

    }
}
