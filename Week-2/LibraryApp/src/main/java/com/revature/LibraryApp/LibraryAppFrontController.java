package com.revature.LibraryApp;

import com.revature.LibraryApp.models.Author;
import com.revature.LibraryApp.models.Book;
import com.revature.LibraryApp.models.Member;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryAppFrontController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Author> authors = new ArrayList<>();
        List<Member> members = new ArrayList<>();
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create Author");
            System.out.println("2. Create Member");
            System.out.println("3. Create Book");
            System.out.println("4. Read All");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    authors.add(createAuthor(scanner));
                    break;
                case 2:
                    members.add(createMember(scanner));
                    break;
                case 3:
                    if (authors.isEmpty() || members.isEmpty()) {
                        System.out.println("You need to create at least one Author and one Member first.");
                    } else {
                        books.add(createBook(scanner, authors.get(0), members.get(0)));
                    }
                    break;
                case 4:
                    readAll(authors, members, books);
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Author createAuthor(Scanner scanner) {
        System.out.println("Enter Author ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Author Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Author Biography: ");
        String biography = scanner.nextLine();

        System.out.println("Enter Author Birth Date (yyyy-mm-dd): ");
        Date birthDate = Date.valueOf(scanner.nextLine());

        return new Author(id, name, biography, birthDate);
    }

    private static Member createMember(Scanner scanner) {
        System.out.println("Enter Member ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Member Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Member Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Member Password: ");
        String password = scanner.nextLine();

        return new Member(id, name, email, password);
    }

    private static Book createBook(Scanner scanner, Author author, Member member) {
        System.out.println("Enter Book ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.println("Enter Book Genre: ");
        String genre = scanner.nextLine();

        System.out.println("Enter Book Publication Date (yyyy-mm-dd): ");
        Date publicationDate = Date.valueOf(scanner.nextLine());

        return new Book(id, title, genre, publicationDate, author, member);
    }

    private static void readAll(List<Author> authors, List<Member> members, List<Book> books) {
        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.println(author);
        }

        System.out.println("Members:");
        for (Member member : members) {
            System.out.println(member);
        }

        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}