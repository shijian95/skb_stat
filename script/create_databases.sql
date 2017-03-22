CREATE SCHEMA `skb_stat` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;

GRANT ALL PRIVILEGES ON skb_stat.* TO 'chuqing'@'localhost' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON skb_stat.* TO 'chuqing'@'%' IDENTIFIED BY 'chuqing' WITH GRANT OPTION;