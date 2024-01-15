package library;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    public static void displayBookDetails(ArrayList<Books> bookList) {
        for (Books books : bookList) {

        }
    }
    public static void main(String[] args) {
        ArrayList<Books> bookList = (ArrayList<Books>) List.of(
                new Books("The Caring Husband","Motiur Rahman","Islamic",150),
                new Books("The Caring Wife","Motiur Rahman","Islamic",150),
                new Books("The Alchemist","Paolo Coelho","Mistry",220),
                new Books("Software Engineer Alap","Ahmed Samim Hasan","Technical",180));

        displayBookDetails(bookList);
    }
}
