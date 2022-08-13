package homework9;

public class Author {
    private String authorFirstName;
    private String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public String toString() {
        return "автор: " + authorFirstName + " " + authorLastName;
    }

    @Override
    public boolean equals(Object obj) {
//        проверяем, что объекты из одного класса
        if (this.getClass() != obj.getClass()) {
            return false;
        }
//        проверяем, что совпадает имя и фамилия
        return authorFirstName == ((Author) obj).getAuthorFirstName() && authorLastName == ((Author) obj).getAuthorLastName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }
}
