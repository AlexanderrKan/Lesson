package Lesson8;

import javax.naming.Name;
import java.util.function.Supplier;

public class Interface {
    public static void main(String[] args) {
    Reader Ivan = new Reader("Ivan");
    Lib Masha = new Lib("Masha");
    Sup Dima = new Sup("Dima");
    Ad Tanya = new Ad("Tanya");
    Ivan.print();
    User1.use();
    Masha.print();
    Librarian.order();
    Dima.print();
    Supplierbooks.supllier();
    Tanya.print();
    Administrator.admin();


    }
}

    interface User1 {
        static void use() { // "Take and return book"
            System.out.println("Take and return book");

        }
    }
    interface Librarian {
        static void order(){
            System.out.println("Order books");
        }
    }
    interface Supplierbooks {
        static void supllier() {
            System.out.println("Supply books");
        }
    }
    interface Administrator {
        static void admin(){
            System.out.println("finds and lends books and notifies you of late returns");
        }
    }

    class Reader implements User1 {
        String reader;

        Reader(String reader) {
            this.reader = reader;
            }

        public void print() {
            System.out.println(reader);
        }
    }
    class Lib implements Librarian {
        String librarian;

        Lib(String librarian) {
            this.librarian = librarian;
        }

        public void print() {
            System.out.println(librarian);
        }
    }
    class Sup implements Supplierbooks {
        String sup;

        Sup(String sup) {
            this.sup = sup;
        }

        public void print() {
            System.out.println(sup);
        }
    }
    class Ad implements Administrator {
        String ad;

        Ad(String ad) {
            this.ad = ad;
        }

        public void print() {
            System.out.println(ad);
        }
    }