insert into user_tb(username, password, email, created_at)
values ('ssar', '$2a$10$vECRahlw0/yU5wkGwhjNzetF0u8BfggE2mc9EgaD5eDfqZomDrGk6', 'ssar@nate.com', now());
insert into user_tb(username, password, email, created_at)
values ('cos', '$2a$10$vECRahlw0/yU5wkGwhjNzetF0u8BfggE2mc9EgaD5eDfqZomDrGk6', 'cos@nate.com', now());
insert into user_tb(username, password, email, created_at)
values ('love', '$2a$10$vECRahlw0/yU5wkGwhjNzetF0u8BfggE2mc9EgaD5eDfqZomDrGk6', 'love@nate.com', now());

insert into board_tb(title, content, user_id, is_public, created_at)
values ('제목1', '내용1', 1, true, now());
insert into board_tb(title, content, user_id, is_public, created_at)
values ('제목2', '내용2', 1, true, now());
insert into board_tb(title, content, user_id, is_public, created_at)
values ('제목3', '내용3', 2, true, now());
insert into board_tb(title, content, user_id, is_public, created_at)
values ('제목4', '내용4', 3, true, now());
insert into board_tb(title, content, user_id, is_public, created_at)
values ('제목5', '내용5', 1, false, now());