--liquibase formatted sql

--changeset kupriyanov:1
create TABLE users (
  pk BIGINT PRIMARY KEY NOT NULL,
  user_name VARCHAR,
  email VARCHAR NOT NULL UNIQUE,
  first_name VARCHAR(200),
  last_name VARCHAR(200),
  phone VARCHAR(20),
  role VARCHAR,
  image VARCHAR,
  password VARCHAR(100) NOT NULL
);


--changeset kupriyanov:2
create TABLE ads (
  pk BIGINT PRIMARY KEY NOT NULL,
  author_id BIGINT NOT NULL,
  image VARCHAR,
  price INTEGER,
  title VARCHAR,
  description VARCHAR,
  FOREIGN KEY (author_id) REFERENCES users(pk)
);


--changeset kupriyanov:3
create TABLE comments (
  pk BIGINT PRIMARY KEY NOT NULL,
  author_id BIGINT NOT NULL,
  author_image VARCHAR,
  author_first_name VARCHAR,
  created_at BIGINT,
  text VARCHAR,
  ad_id BIGINT NOT NULL,
  FOREIGN KEY (author_id) REFERENCES users(pk),
  FOREIGN KEY (ad_id) REFERENCES ads(pk)
);

--FOREIGN KEY (author_id) REFERENCES authors(id)