package homework9;

public class Main {


    public static void main(String[] args) {
        Author antonPetryakov = new Author("Антон", "Петряков");
        Author alexPushkin = new Author("Александр", "Пушкин");
        Book book1 = new Book("Как начать новыю жизнь с понедельника и не бросить во вторник.", antonPetryakov, 2019);
        Book book2 = new Book("Евгений Онегин", alexPushkin, 1965);
        Book book3 = new Book("Руслан и Людмила", alexPushkin, 1849);
        System.out.println("book3.getPublishingYear() = " + book3.getPublishingYear());
        book3.setPublishingYear(1983);
        System.out.println("book3.getPublishingYear() = " + book3.getPublishingYear());


    }
}
