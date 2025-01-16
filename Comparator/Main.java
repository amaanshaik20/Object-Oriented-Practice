package Comparator;

import java.util.*;

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        Integer price1 = p1.productPrice;
        Integer price2 = p2.productPrice;
        return Integer.compare(price1, price2);
    }
}

class RatingComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        Float rating1 = p1.productRating;
        Float rating2 = p2.productRating;
        return Float.compare(rating2, rating1);
    }
}

class DiscountComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        Integer discount1 = p1.productDiscount;
        Integer discount2 = p2.productDiscount;
        return Float.compare(discount2, discount1);
    }
}

class BrandComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        String brand1 = p1.productBrand;
        String brand2 = p2.productBrand;
        return brand1.compareTo(brand2);
    }
}

class Product {
    int productId;
    String productName;
    int productPrice;
    float productRating;
    String productBrand;
    int productDiscount;

    Product(int productId, String productName, int productPrice, float productRating, String productBrand,
            int productDiscount) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.productBrand = productBrand;
        this.productDiscount = productDiscount;
    }

    @Override
    public String toString() {
        return productId + "," + productName + "," + productPrice + "," + productRating + "," + productBrand + ","
                + productDiscount;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        PriceComparator price = new PriceComparator();
        RatingComparator rating = new RatingComparator();
        BrandComparator brand = new BrandComparator();
        DiscountComparator discount = new DiscountComparator();
        TreeSet<Product> set1 = new TreeSet<Product>(price);
        TreeSet<Product> set2 = new TreeSet<Product>(rating);
        TreeSet<Product> set3 = new TreeSet<Product>(brand);
        TreeSet<Product> set4 = new TreeSet<Product>(discount);

        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(",");
            int productId = Integer.parseInt(s[0]);
            String productName = s[1];
            int productPrice = Integer.parseInt(s[2]);
            float productRating = Float.parseFloat(s[3]);
            String productBrand = s[4];
            int productDiscount = Integer.parseInt(s[5]);
            Product p = new Product(productId, productName, productPrice, productRating, productBrand, productDiscount);
            set1.add(p);
            set2.add(p);
            set3.add(p);
            set4.add(p);
        }

        int choice = sc.nextInt();
        if (choice == 1) {
            for (Product product : set1) {
                System.out.println(product);
            }
        } else if (choice == 2) {
            for (Product product : set2) {
                System.out.println(product);
            }
        } else if (choice == 3) {
            for (Product product : set3) {
                System.out.println(product);
            }

        } else if (choice == 4) {
            for (Product product : set4) {
                System.out.println(product);
            }

        }
    }
}
