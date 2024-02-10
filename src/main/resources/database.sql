-- Create Database
CREATE DATABASE CinemaDatabase;

-- Connect to CinemaDatabase
\c CinemaDatabase

-- Create Table: Movie
CREATE TABLE Movie (
    movieId SERIAL PRIMARY KEY,
    name VARCHAR(255),
    status BOOL,
    price DECIMAL(10,2),
    description TEXT,
    createdDate DATE,
    image VARCHAR(255),
    "Time" TIME
);
-- Create Table: User
CREATE TABLE "User" (
    userId SERIAL PRIMARY KEY,
    name VARCHAR(255),
    username VARCHAR(255),
    email VARCHAR(255),
    status BOOL,
    phone VARCHAR(20),
    password VARCHAR(255),
    roleId INT
);
-- Create Table: Category_Movie
CREATE TABLE Category_Movie (
    categoryId SERIAL,
    artworkId SERIAL,
    PRIMARY KEY (categoryId, artworkId)
);

-- Create Table: Category
CREATE TABLE Category (
    categoryId SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    image VARCHAR(255)
);
-- Create Table: Slot
CREATE TABLE Slot (
    Slotid SERIAL PRIMARY KEY,
    "Time_Start" TIME,
    "Time_End" TIME
);
-- Create Table: Movie_Slot
CREATE TABLE Movie_Slot (
    movieId INT REFERENCES Movie(movieId),
    Slotid INT REFERENCES Slot(Slotid),
    Movie_Slotid SERIAL PRIMARY KEY,
    AmountSlotMAX INT,
    AmountSlotAvaible INT,
    "Time" TIME
);

CREATE TABLE LikeTable (
    userId INT REFERENCES "User"(userId),
    movieId INT REFERENCES Movie(movieId),
    PRIMARY KEY (userId, movieId)
);

-- Create Table: Comment
CREATE TABLE Comment (
    commentId SERIAL PRIMARY KEY,
    userId INT REFERENCES "User"(userId),
    content TEXT,
    movieId INT REFERENCES Movie(movieId),
    date DATE
);





-- Create Table: Transaction
CREATE TABLE Transaction (
    transactionId SERIAL PRIMARY KEY,
    userId INT REFERENCES "User"(userId),
    totalPrice DECIMAL(10,2),
    date DATE,
    tickAmount INT,
    type VARCHAR(255),
    status VARCHAR(255),
    movie_slotID INT REFERENCES Movie_Slot(Movie_Slotid)
);
