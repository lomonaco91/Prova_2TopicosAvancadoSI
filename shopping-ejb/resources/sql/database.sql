create table shopping_order (
  id integer not null,
  description varchar(50) not null,
  order_time timestamp not null,
  constraint pk_order primary key (id)
);

create sequence seq_shopping_order;