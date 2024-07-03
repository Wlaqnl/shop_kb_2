DROP TABLE IF EXISTS NOTICE;
CREATE TABLE `NOTICE`(
    /*
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
     */

     `공지사항일련번호` decimal(9,0) primary key auto_increment,
     `공지사항제목` varchar(100) NOT NULL,
     `공지사항내용` varchar(2000),
     `등록직원번호` char(7) NOT NULL,
     `등록직원명` varchar(10) NOT NULL,
     `등록일시` char(14) NOT NULL,
     `수정직원번호` char(7),
     `수정직원명` varchar(10),
     `수정일시` char(14),
     `게시시작일시` char(14),
     `게시종료일시` char(14),
     `삭제` boolean default false,
     `팝업` boolean default false
);

