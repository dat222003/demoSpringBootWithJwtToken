INSERT INTO `tbl_category` (`description`, `name`)
VALUES ('Electronics', 'Electronics'),
       ('Clothing', 'Clothing'),
       ('Home and Kitchen', 'Home and Kitchen');

INSERT INTO `tbl_product` (`price`, `stock`, `weight`, `category_id`, `id`, `image`, `name`)
VALUES (99.99, 10, 1.5, 1, 1, 'product1.jpg', 'Smartphone'),
       (49.99, 20, 2.0, 1, 2, 'product2.jpg', 'Headphones'),
       (19.99, 5, 0.5, 2, 3, 'product3.jpg', 'T-Shirt'),
       (29.99, 3, 0.8, 2, 4, 'product4.jpg', 'Jeans'),
       (39.99, 8, 1.2, 3, 5, 'product5.jpg', 'Cookware Set');