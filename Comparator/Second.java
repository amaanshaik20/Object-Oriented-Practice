package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Books1 implements Comparable<Books1> {
    private String title;
    private String author;
    private int publication_year;

    public Books1() {

    }

    public Books1(String title, String author, int publication_year) {
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

    public int compareTo(Books1 o2) {
        Books1 o1 = this;
        String author1 = o1.author;
        String author2 = o2.author;

        String title1 = o1.title;
        String title2 = o2.title;

        Integer year1 = o1.publication_year;
        Integer year2 = o2.publication_year;

        if (author1.equals(author2) && year1.equals(year2)) {
            return title1.compareTo(title2);
        } else if (author1.equals(author2)) {
            return year1.compareTo(year2);
        } else {
            return author1.compareTo(author2);
        }

    }
}

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF BOOKS: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Books1> a = new ArrayList<Books1>();
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER DETAILS OF BOOKS: ");
            String details[] = sc.nextLine().split(",");
            Books1 b = new Books1(details[0], details[1], Integer.parseInt(details[2]));
            a.add(b);
        }
        Collections.sort(a);
        System.out.println(a);
        for (Object x : a) {
            System.out.println(x);
        }
    }
}
