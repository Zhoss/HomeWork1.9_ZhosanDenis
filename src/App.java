public class App {
    public static void main(String[] args) {
        Author robertSalvatore = new Author("Роберт", "Сальваторе");
        Book darkElf = new Book("Отступник", robertSalvatore, 1990);
        System.out.println("darkElf = " + darkElf.getBookName() + " " + robertSalvatore.getAuthorName() + " " + robertSalvatore.getAuthorLastName() + " " + darkElf.getPublicationYear());
        darkElf.setPublicationYear(1991);
        System.out.println("Другой год публикации - " + darkElf.getPublicationYear());
        System.out.println();
        Author andrzejSapkowski = new Author("Анджей", "Сапковский");
        Book witcher = new Book("Кровь эльфов", andrzejSapkowski, 1994);
        System.out.println("witcher = " + witcher.getBookName() + " " + andrzejSapkowski.getAuthorName() + " " + andrzejSapkowski.getAuthorLastName() + " " + witcher.getPublicationYear());
        witcher.setPublicationYear(1995);
        System.out.println("Другой год публикации - " + witcher.getPublicationYear());
    }
}
