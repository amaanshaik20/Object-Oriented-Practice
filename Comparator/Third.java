package Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class App implements Comparator<Books> {
    @Override
    public int compare(Books o1, Books o2) {
        // TODO Auto-generated method stub
        String author1 = o1.getAuthor();
        String author2 = o2.getAuthor();

        String title1 = o1.getTitle();
        String title2 = o2.getTitle();

        Integer year1 = o1.getPublication_year();
        Integer year2 = o2.getPublication_year();

        if (author1.equals(author2) && year1.equals(year2)) {
            return title1.compareTo(title2);
        } else if (author1.equals(author2)) {
            return year1.compareTo(year2);
        } else {
            return author1.compareTo(author2);
        }
    }

}

class Books {
    private String title;
    private String author;
    private int publication_year;

    public Books() {
    }

    public Books(String title, String author, int publication_year) {
        super();
        this.title = title;
        this.author = author;
        this.publication_year = publication_year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublication_year() {
        return publication_year;
    }

    @Override
    public String toString() {

        return title + " " + author + " " + publication_year;
    }

}

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        System.out.println("ENTER NO OF BOOKS: ");
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<Books> a = new TreeSet<Books>(app);
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER DETAILS OF BOOKS: ");
            String details[] = sc.nextLine().split(",");
            Books b = new Books(details[0], details[1], Integer.parseInt(details[2]));
            a.add(b);
        }
        // System.out.println(a);
        for (Object x : a) {
            System.out.println(x);
        }
    }
}
