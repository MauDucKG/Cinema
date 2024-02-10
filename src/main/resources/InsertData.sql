-- Inserting sample data into Movie table
INSERT INTO Movie (name, status, price, description, createdDate, image, "Time")
VALUES
    ('Movie 1', TRUE, 10.99, 'Description for Movie 1', '2023-01-01', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg', '14:30'),
    ('Movie 2', TRUE, 9.99, 'Description for Movie 2', '2023-01-02', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg', '16:00'),
    ('Movie 3', TRUE, 12.99, 'Description for Movie 3', '2023-01-03', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg', '18:30'),
    ('Movie 4', TRUE, 8.99, 'Description for Movie 4', '2023-01-04', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg', '20:00'),
    ('Movie 5', TRUE, 11.99, 'Description for Movie 5', '2023-01-05', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg', '22:30');

-- Inserting sample data into "User" table
INSERT INTO "User" (name, username, email, status, phone, password, roleId)
VALUES
    ('User 1', 'user1', 'user1@example.com', TRUE, '123456789', 'password1', 1),
    ('User 2', 'user2', 'user2@example.com', TRUE, '123456780', 'password2', 2),
    ('User 3', 'user3', 'user3@example.com', TRUE, '123456781', 'password3', 1),
    ('User 4', 'user4', 'user4@example.com', TRUE, '123456782', 'password4', 2),
    ('User 5', 'user5', 'user5@example.com', TRUE, '123456783', 'password5', 1);

-- Inserting sample data into Category_Movie table
INSERT INTO Category_Movie (categoryId, artworkId)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5);

-- Inserting sample data into Category table
INSERT INTO Category (name, description, image)
VALUES
    ('Category 1', 'Description for Category 1', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg'),
    ('Category 2', 'Description for Category 2', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg'),
    ('Category 3', 'Description for Category 3', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg'),
    ('Category 4', 'Description for Category 4', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg'),
    ('Category 5', 'Description for Category 5', 'https://pic-bstarstatic.akamaized.net/ugc/6f2ff81ec090dc1095fae3571bd6c546.jpeg');

-- Inserting sample data into Slot table
INSERT INTO Slot ("Time_Start", "Time_End")
VALUES
    ('14:30', '16:00'),
    ('16:00', '18:30'),
    ('18:30', '20:00'),
    ('20:00', '22:30'),
    ('22:30', '23:59');

-- Inserting sample data into Movie_Slot table
INSERT INTO Movie_Slot (movieId, Slotid, AmountSlotMAX, AmountSlotAvaible, "Time")
VALUES
    (1, 1, 100, 50, '14:30'),
    (2, 2, 120, 60, '16:00'),
    (3, 3, 80, 40, '18:30'),
    (4, 4, 90, 45, '20:00'),
    (5, 5, 110, 55, '22:30');

-- Inserting sample data into LikeTable table
INSERT INTO LikeTable (userId, movieId)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5);

-- Inserting sample data into Comment table
INSERT INTO Comment (userId, content, movieId, date)
VALUES
    (1, 'Comment 1 for Movie 1', 1, '2023-01-01'),
    (2, 'Comment 2 for Movie 2', 2, '2023-01-02'),
    (3, 'Comment 3 for Movie 3', 3, '2023-01-03'),
    (4, 'Comment 4 for Movie 4', 4, '2023-01-04'),
    (5, 'Comment 5 for Movie 5', 5, '2023-01-05');

-- Inserting sample data into Transaction table
INSERT INTO Transaction (userId, totalPrice, date, tickAmount, type, status, movie_slotID)
VALUES
    (1, 50.00, '2023-01-01', 2, 'Online', 'Completed', 1),
    (2, 20.00, '2023-01-02', 1, 'Offline', 'Pending', 2),
    (3, 30.00, '2023-01-03', 3, 'Online', 'Completed', 3),
    (4, 25.00, '2023-01-04', 2, 'Offline', 'Pending', 4),
    (5, 40.00, '2023-01-05', 4, 'Online', 'Completed', 5);
