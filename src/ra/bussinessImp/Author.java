package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Author implements IShop {
    Scanner input = new Scanner(System.in);
    private int authorId;
    private String authorName;
    private Boolean sex;
    private int year;

    public Author() {
    }

    public Author(int authorId, String authorName, Boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    ArrayList author =  new ArrayList();
    @Override
    public void inputData() {
        System.out.println("Nhập mã tác giả: ");
        authorId = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên tác giả: ");
        authorName = input.nextLine();
        System.out.println("Nhập giới tính: ");
        sex = input.nextLine().isEmpty();
        System.out.println("Nhập năm sinh: ");
        year = Integer.parseInt(input.nextLine());
        System.out.println("-----");
    }

    @Override
    public void displayData() {
        System.out.println("Author{" +
                "authorId=" + this.authorId +
                ", authorName='" + this.authorName + '\'' +
                '}');
    }
}
