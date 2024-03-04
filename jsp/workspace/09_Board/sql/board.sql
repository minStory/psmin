create table board(
	board_no INT(7) primary key,		-- �۹�ȣ
	board_writer varchar(50) not null,	-- �ۼ���
	board_title varchar(200) not null,	-- ������
	board_cont varchar(2000),			-- �۳���
	board_pwd varchar(50) not null,		-- �ۼ��� ��й�ȣ
	board_hit INT(5) default 0,			-- Ŭ����
	board_date DATE,					-- �ۼ���
	board_update DATE					-- ������
);

-- board ���̺� �Խñ��� �߰��� ����.
insert into board values(1, 'ȫ�浿','����1', '�浿�� �Դϴ�.', '1111', default, current_date(), null);
INSERT INTO board VALUES(2, '�̼���', '���屺', '�屺�� ���Դϴ�.', '2222', DEFAULT, CURRENT_DATE(), NULL);
INSERT INTO board VALUES(3, '������', '���ѵ�������', '������ ���� ���Դϴ�.', '3333', DEFAULT, CURRENT_DATE(), NULL);
INSERT INTO board VALUES(4, '������', '����4', 'ȭ�� �������Դϴ�.', '4444', DEFAULT, CURRENT_DATE(), NULL);
INSERT INTO board VALUES(5, '�迬��', '����', '�迬�� ���Դϴ�.', '5555', DEFAULT, CURRENT_DATE(), NULL);

commit;