CREATE TABLE IF NOT EXISTS users (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    age INT NOT NULL
    );

-- INSERT INTO users (first_name, last_name, age)
-- VALUES
--     ('nikita', 'obergan', 33),
--     ('john', 'smith', 25);