public class Main {
    public static void main(String[] args) {
        System.out.println("Книга 1");
        Author mishaBulgakov = new Author("Михаил", "Булгаков");
        Book masterAndMargarita = new Book("Мастер и Маргарита", mishaBulgakov, 1968);
        System.out.println("Книга " + masterAndMargarita.getTitleBook());
        System.out.println("Автор " + mishaBulgakov.getFirsName() + " " + mishaBulgakov.getLastName());
        masterAndMargarita.setDatePublication(1967);
        System.out.println("Год публикации " + masterAndMargarita.getDatePublication());

        System.out.println();
        System.out.println("Книга 2");
        Author fedyaDostoevky = new Author("Федор", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", fedyaDostoevky, 1890);
        System.out.println("Книга "+ crimeAndPunishment.getTitleBook());
        System.out.println("Автор "+ fedyaDostoevky.getFirsName() + " "+ fedyaDostoevky.getLastName());
        crimeAndPunishment.setDatePublication(1866);
        System.out.println("Год публикации "+ crimeAndPunishment.getDatePublication());
    }
}