#!/bin/bash

psql_check () {
$psql_cmd "Create table PRODUCT_INVENTY(item_id varchar(55) not null,quantity integer not null,unit_price numeric(10,2) )"
}

psql_cmd="psql -h $1 -d $POSTGRESQL_DATABASE -U $POSTGRESQL_USER -c"
echo "Starting post hook to initialize database ..."

until psql_check $1
do
  echo "Waiting for PostgreSQL to be ready ..."
  sleep 10
done

$psql_cmd "insert into product_inventy (item_Id, quantity, unit_price) values ('eLnc5A4YT', 100, 104.5 )"
$psql_cmd "insert into product_inventy (item_Id, quantity, unit_price) values ('7Zlrc8sPB', 80, 515.5 )"
$psql_cmd "insert into product_inventy (item_Id, quantity, unit_price) values ('cJexJO8ju', 60, 20.50 )"
$psql_cmd "insert into product_inventy (item_Id, quantity, unit_price) values ('1pDPW_jeR', 50, 150.50 )"
$psql_cmd "insert into product_inventy (item_Id, quantity, unit_price) values ('EcPOG1aGp', 50, 655.50 )"
$psql_cmd "insert into product_inventy (item_Id, quantity, unit_price) values ('FesNH6sCy-Test', 20, 995.50 )"

$psql_cmd "create table cart (cart_id varchar(55) not null,customerid varchar(55) not null,itemid varchar(55) not null,quantity integer not null)"

$psql_cmd "create table products (productId  varchar(100) not null, productName  varchar(200) not null, partNo integer not null,  imageLink varchar(500) not null, productShortDesc varchar(500) not null)"
$psql_cmd "insert into products values ('eLnc5A4YT','Real-2', 111,'https://assets.gadgets360cdn.com/shop/assets/products/realme-2-pro_1546511706.jpeg','2 GB RAM | 16 GB ROM | Expandable Upto 256 GB 15.49 cm (6.1 inch) HD+ Display 13MP + 2MP | 5MP Front Camera')"
$psql_cmd "insert into products values ('7Zlrc8sPB','Travel Small Gadgets', 222,'https://m.media-amazon.com/images/I/61FwkI1xD2L._AC_UY218_.jpg','Safe protection - built-in strap and buffer layer offers protection against minor bumps, scratches, dust, drops and shocks')"
$psql_cmd "insert into products values ('EcPOG1aGp','In-Ear Headphone', 333,'https://images-na.ssl-images-amazon.com/images/I/51j4zZ9eQSL._SX679_.jpg','Item is a Wired in-the-ear headphone without microphone/ button to control volume.Powerful, bass-driven stereo sound')"
$psql_cmd "insert into products values ('1pDPW_jeR','Washing Machine', 444,'https://images-na.ssl-images-amazon.com/images/I/61TOEtZQ36L._SY879_.jpg','Fully-automatic top-loading washing machine.6.5 kg capacity.Keep clothes magically lint-free')"
$psql_cmd "insert into products values ('cJexJO8ju','Digital SLR Camera', 555,'https://images-na.ssl-images-amazon.com/images/I/914hFeTU2-L._SX679_.jpg','Sensor: APS-C CMOS Sensor with 24.1 MP (high resolution for large prints and image cropping) ISO: 100-6400 sensitivity range')"
$psql_cmd "insert into products values ('FesNH6sCy-Test','Spiral Cable Protector', 666,'https://images-na.ssl-images-amazon.com/images/I/51Bs28VFEjL.jpg','Mobile Phone Cable Protector: Protect mobile data/earphone cable from Pulling & Breaking. It maintains cable flexibility.')"
