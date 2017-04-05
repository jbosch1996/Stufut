create database stufut

create table card
(CARD_id int not null primary key AUTO_INCREMENT,
CARD_name varchar (20),
CARD_average int,
CARD_position varchar (20),
CARD_team varchar (20),
CARD_nation varchar (20),
CARD_pace int,
CARD_shoot int,
CARD_passing int,
CARD_dribbling int,
CARD_defending int,
CARD_physical int,
CARD_type varchar (20),
CARD_like int,
CARD_dislike int);


create table comments_card_user
(COMMENT_id int not null primary key AUTO_INCREMENT,
COMMENT_description text,
COMMENT_date datetime,
USER_username varchar(20) not null,
CARD_id int not null,
FOREIGN KEY (USER_username) REFERENCES stufut_user (USER_username) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (CARD_id) REFERENCES card (CARD_id) ON DELETE CASCADE ON UPDATE CASCADE);


create table comments_deck
(id_comment int not null primary key AUTO_INCREMENT,
COMMENT_description text,
COMMENT_date datetime,
USER_username varchar(20) not null,
DECK_id int not null,
FOREIGN KEY (USER_username) REFERENCES stufut_user (USER_username) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (DECK_id) REFERENCES deck_card (DECK_id) ON DELETE CASCADE ON UPDATE CASCADE);



create table deck_card
(DC_id int not null primary key AUTO_INCREMENT,
CARD_ID int not null,
DECK_ID int not null,
DC_date datetime,
FOREIGN KEY (CARD_ID) REFERENCES card (CARD_ID) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (DECK_ID) REFERENCES deck (DECK_ID) ON DELETE CASCADE ON UPDATE CASCADE);

create table deck
(DECK_id int not null primary key AUTO_INCREMENT,
DECK_name varchar(20),
DECK_like int,
DECK_date datetime,
FORM_id int not null,
USER_username varchar(20) not null,
FOREIGN KEY (FORM_id) REFERENCES formation (FORM_id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (USER_username) REFERENCES stufut_user (USER_username) ON DELETE CASCADE ON UPDATE CASCADE);

create table formation
(FORM_id int not null primary key,
FORM_name varchar(20));



create table stufut_user
(USER_username varchar(20) primary key not null,
USER_email varchar(20),
USER_name varchar(20),
USER_firstname varchar(20),
USER_password varchar(20));


