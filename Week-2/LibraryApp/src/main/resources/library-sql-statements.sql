drop table members;
drop table authors;
drop table books;

CREATE TABLE members (
    memberId INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL,
    password TEXT NOT NULL
);

CREATE TABLE authors (
    authorId INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    biography TEXT,
    birthDate DATE
);

CREATE TABLE books (
    bookId INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    genre TEXT,
    publicationDate DATE,
    authorId INTEGER,
    checkedOutBy INTEGER,
    FOREIGN KEY (authorId) REFERENCES authors(authorId),
    FOREIGN KEY (checkedOutBy) REFERENCES members(memberId)
);

INSERT INTO members (name, email, password) VALUES
    ('John Doe', 'johndoe@example.com', 'password123'),
    ('Jane Smith', 'janesmith@example.com', 'password456');
    
INSERT INTO authors (name, biography, birthDate) VALUES
    ('Stephen King', 'A horror novelist', '1947-09-21'),
    ('J.K. Rowling', 'Author of the Harry Potter series', '1965-07-31');
    
INSERT INTO books (title, genre, publicationDate, authorId) VALUES
    ('The Shining', 'Horror', '1977-01-01', 1),
    ('Harry Potter and the Sorcerers Stone', 'Fantasy', '1997-06-26', 2);

   
select * from members;
select * from authors;
select * from books;

