DROP TABLE IF EXISTS `spring_db`.`user` CASCADE;
DROP TABLE IF EXISTS `spring_db`.`product` CASCADE;
DROP TABLE IF EXISTS `spring_db`.`user_product` CASCADE;


CREATE TABLE `spring_db`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `spring_db`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `cost` INT NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `spring_db`.`user_product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `product_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `spring_db`.`user` (`id`),
  CONSTRAINT `product_id`
    FOREIGN KEY (`product_id`)
    REFERENCES `spring_db`.`product` (`id`));
    
    INSERT INTO spring_db.user (name) values ('Anton');
    INSERT INTO spring_db.user (name) values ('Ivan');
    INSERT INTO spring_db.user (name) values ('Mariya');
    
    INSERT INTO spring_db.product (name, cost) values ('Milk', 15);
    INSERT INTO spring_db.product (name, cost) values ('Pen', 112);
    INSERT INTO spring_db.product (name, cost) values ('Apple', 150);
    INSERT INTO spring_db.product (name, cost) values ('Tea', 180);

    INSERT INTO spring_db.user_product(user_id, product_id) values (
                                                            (select id from spring_db.user where name = 'Anton'),
                                                            (select id from spring_db.product where name = 'Pen')
                                                            );