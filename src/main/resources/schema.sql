/*
create table if not exists Ingredient (
  id varchar(10) not null,
  name varchar(25) not null,
  type varchar(10) not null,
  primary key (id)
) engine=InnoDB default charset=utf8;

create table if not exists Wand (
  id int(11) not null auto_increment,
  name varchar(50) not null,
  createdAt timestamp not null,
  primary key (id)
)engine=InnoDB default charset=utf8;

create table if not exists Wand_Ingredients (
  wand int(11) not null,
  ingredient varchar(10) not null
)engine=InnoDB default charset=utf8;

alter table Wand_Ingredients
  add foreign key (wand) references Wand(id);
alter table Wand_Ingredients
  add foreign key (Ingredient) references Ingredient(id);

create table if not exists Wand_Order(
    id int(11) not null auto_increment,
    deliveryName varchar(50) not null,
    deliveryStreet varchar(50) not null,
    deliveryCity varchar(50) not null,
    deliveryState varchar (2) not null,
    deliveryZip varchar(10) not null,
    ccNumber varchar(16) not null,
    ccExpiration varchar(5) not null,
    ccCVV varchar(3) not null,
    placedAt timestamp not null,
    primary key (id)
)engine=InnoDB default charset=utf8;

create table if not exists Wand_Order_Wands(
  wandOrder int(11) not null,
  wand int(11) not null
)engine=InnoDB default charset=utf8;

alter table Wand_Order_Wands
  add foreign key (wandOrder) references Wand_Order(id);
alter table Wand_Order_Wands
  add foreign key (wand) references Wand(id);

 */

