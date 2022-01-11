import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> kitap = new TreeSet<>(new OrderByName());

        kitap.add(new Book("A Tale of Two Cities",350,"Charles Dickens",1859));
        kitap.add(new Book("The Lord of The Rings",450,"J.R.R. Tolkien",1954));
        kitap.add(new Book("Le Petit Prince",150,"Antoine de Saint-Exupéry",1943));
        kitap.add(new Book("The Hobbit",300,"J.R.R. Tolkien",1937));
        kitap.add(new Book("And Then There Were None",300,"Agatha Christie",1939));

        for (Book ktp:kitap
             ) {
            System.out.println(ktp.getName());
        }

        TreeSet<Book> treeKitap = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount()-o2.getPageCount();
            }
        });

        treeKitap.addAll(kitap);

        for (Book ktp:treeKitap
             ) {
            System.out.println(ktp.getName()+ " "+ktp.getPageCount());
        }
    }
}
