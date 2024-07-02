DROP TABLE IF EXISTS NOTICE;
CREATE TABLE `NOTICE`(
    `id` decimal(9,0) primary key auto_increment,
    `title` varchar(100) NOT NULL,
    `cnt` varchar(2000),
    `regi_id` char(7) NOT NULL,
    `regi_name` varchar(10) NOT NULL,
    `regi_time` char(14) NOT NULL,
    `amend_id` char(7),
    `amend_name` varchar(10),
    `amend_time` char(14),
    `post_start_time` char(14),
    `post_end_time` char(14),
    `del` boolean default false,
    `popup` boolean default false
);

