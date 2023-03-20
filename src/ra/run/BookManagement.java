package ra.run;

import ra.bussinessImp.Author;
import ra.bussinessImp.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Author> authors = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập số tác giả và nhập thông tin các tác giả \n" +
                    "2. Nhập số sách và nhập thông tin các sách\n" +
                    "3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator) \n" +
                    "4. Tìm kiếm sách theo tên tác giả sách\n" +
                    "5. Thoát");
            System.out.println("Chọn: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số tác giả");
                    int numberOfAuthor = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập thông tin tác giả");
                    for (int i = 0; i < numberOfAuthor; i++) {
                        authors.add(new Author());
                        authors.get(i).inputData();
                    }
                    break;
                case 2:
                    System.out.println("Nhập số sách: ");
                    int numberBook = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập thông tin sách");
                    for (int i = 0; i < numberBook; i++) {
                        books.add(new Book());
                        books.get(i).inputData();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("chọn lại");
            }
        } while (true);
    }
}
