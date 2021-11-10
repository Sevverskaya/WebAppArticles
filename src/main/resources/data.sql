DROP TABLE IF EXISTS article;

CREATE TABLE article
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(100),
    headline VARCHAR(250) NOT NULL,
    body     VARCHAR(1000) NOT NULL
);

INSERT INTO article (id, category, headline, body)
VALUES (1, 'Animals, Mental Health', 'Breaking News! Cats can make your life better', 'Pets, especially cats, can reduce stress, anxiety, and depression, ease loneliness, encourage exercise and playfulness, and even improve your health. Caring for an animal can help children grow up more secure and active. Pets also provide valuable companionship for older adults.'),
       (2, 'categ2', 'head2', 'bla bla'),
       (3, 'categ3', 'head3', 'bla bla bla');
