INSERT INTO UF (ID,CODE,NAME) VALUES (12,'AC','Acre');
INSERT INTO UF (ID,CODE,NAME) VALUES (27,'AL','Alagoas');
INSERT INTO UF (ID,CODE,NAME) VALUES (13,'AM','Amazonas');
INSERT INTO UF (ID,CODE,NAME) VALUES (16,'AP','Amap�');
INSERT INTO UF (ID,CODE,NAME) VALUES (29,'BA','Bahia');
INSERT INTO UF (ID,CODE,NAME) VALUES (23,'CE','Cear�');
INSERT INTO UF (ID,CODE,NAME) VALUES (53,'DF','Distrito Federal');
INSERT INTO UF (ID,CODE,NAME) VALUES (32,'ES','Esp�rito Santo');
INSERT INTO UF (ID,CODE,NAME) VALUES (52,'GO','Goi�s');
INSERT INTO UF (ID,CODE,NAME) VALUES (21,'MA','Maranh�o');
INSERT INTO UF (ID,CODE,NAME) VALUES (31,'MG','Minas Gerais');
INSERT INTO UF (ID,CODE,NAME) VALUES (50,'MS','Mato Grosso do Sul');
INSERT INTO UF (ID,CODE,NAME) VALUES (51,'MT','Mato Grosso');
INSERT INTO UF (ID,CODE,NAME) VALUES (15,'PA','Par�');
INSERT INTO UF (ID,CODE,NAME) VALUES (25,'PB','Para�ba');
INSERT INTO UF (ID,CODE,NAME) VALUES (26,'PE','Pernambuco');
INSERT INTO UF (ID,CODE,NAME) VALUES (22,'PI','Piau�');
INSERT INTO UF (ID,CODE,NAME) VALUES (41,'PR','Paran�');
INSERT INTO UF (ID,CODE,NAME) VALUES (33,'RJ','Rio de Janeiro');
INSERT INTO UF (ID,CODE,NAME) VALUES (24,'RN','Rio Grande do Norte');
INSERT INTO UF (ID,CODE,NAME) VALUES (11,'RO','Rond�nia');
INSERT INTO UF (ID,CODE,NAME) VALUES (14,'RR','Roraima');
INSERT INTO UF (ID,CODE,NAME) VALUES (43,'RS','Rio Grande do Sul');
INSERT INTO UF (ID,CODE,NAME) VALUES (42,'SC','Santa Catarina');
INSERT INTO UF (ID,CODE,NAME) VALUES (28,'SE','Sergipe');
INSERT INTO UF (ID,CODE,NAME) VALUES (35,'SP','S�o Paulo');
INSERT INTO UF (ID,CODE,NAME) VALUES (17,'TO','Tocantins');

INSERT INTO FIELD (ID, NAME) VALUES (1, 'Administra��o');
INSERT INTO FIELD (ID, NAME) VALUES (2, 'Agricultura, Pecu�ria, Veterin�ria');
INSERT INTO FIELD (ID, NAME) VALUES (3, 'Alimenta��o  Gastronomia');
INSERT INTO FIELD (ID, NAME) VALUES (4, 'Arquitetura, Decora�o, Design');
INSERT INTO FIELD (ID, NAME) VALUES (5, 'Artes');
INSERT INTO FIELD (ID, NAME) VALUES (6, 'Auditoria');
INSERT INTO FIELD (ID, NAME) VALUES (7, 'Ci�ncias, Pesquisa ');
INSERT INTO FIELD (ID, NAME) VALUES (8, 'Comercial, Vendas');
INSERT INTO FIELD (ID, NAME) VALUES (9, 'Com�rcio Exterior, Importa��o, Exporta��o');
INSERT INTO FIELD (ID, NAME) VALUES (10, 'Compras');
INSERT INTO FIELD (ID, NAME) VALUES (11, 'Comunica��o, TV, Cinema');
INSERT INTO FIELD (ID, NAME) VALUES (12, 'Constru��o, Manuten��o');
INSERT INTO FIELD (ID, NAME) VALUES (13, 'Cont�bil, Finan�as, Economia');
INSERT INTO FIELD (ID, NAME) VALUES (14, 'Cultura, Lazer, Entretenimento');
INSERT INTO FIELD (ID, NAME) VALUES (15, 'Educa��o, Ensino, Idiomas');
INSERT INTO FIELD (ID, NAME) VALUES (16, 'Engenharia');
INSERT INTO FIELD (ID, NAME) VALUES (17, 'Est�tica');
INSERT INTO FIELD (ID, NAME) VALUES (18, 'Hotelaria, Turismo');
INSERT INTO FIELD (ID, NAME) VALUES (19, 'Industrial, Produ��o, F�brica');
INSERT INTO FIELD (ID, NAME) VALUES (20, 'Inform�tica, TI, Telecomunica��es');
INSERT INTO FIELD (ID, NAME) VALUES (21, 'Jur�dica');
INSERT INTO FIELD (ID, NAME) VALUES (22, 'Log�stica');
INSERT INTO FIELD (ID, NAME) VALUES (23, 'Marketing');
INSERT INTO FIELD (ID, NAME) VALUES (24, 'Meio Ambiente, Ecologia');
INSERT INTO FIELD (ID, NAME) VALUES (25, 'Moda');
INSERT INTO FIELD (ID, NAME) VALUES (26, 'Qualidade ');
INSERT INTO FIELD (ID, NAME) VALUES (27, 'Qu�mica, Petroqu�mica');
INSERT INTO FIELD (ID, NAME) VALUES (28, 'Recursos Humanos');
INSERT INTO FIELD (ID, NAME) VALUES (29, 'Sa�de');
INSERT INTO FIELD (ID, NAME) VALUES (30, 'Segurana');
INSERT INTO FIELD (ID, NAME) VALUES (31, 'Servi�os Gerais');
INSERT INTO FIELD (ID, NAME) VALUES (32, 'Servi�os Sociais e Comunit�rios');
INSERT INTO FIELD (ID, NAME) VALUES (33, 'Telemarketing');
INSERT INTO FIELD (ID, NAME) VALUES (34, 'Transportes');

INSERT INTO UNIVERSITY (ID, NAME, ADDRESS, UF_ID) VALUES (1, 'Universidade de S�o Paulo', 'Cidade Universit�ria', 35);
INSERT INTO UNIVERSITY (ID, NAME, ADDRESS, UF_ID) VALUES (2, 'Universidade Presbiteriana Mackenzie', 'Rua da Consola��o 930', 35);
INSERT INTO UNIVERSITY (ID, NAME, ADDRESS, UF_ID) VALUES (3, 'Pontif�cia Universidade Cat�lica de S�o Paulo', 'Rua Marqu�s de S�o Vicente 225', 35);

INSERT INTO COMPANY (ID, NAME, CNPJ, PASSWORD) VALUES (3, 'Carrefour', '52.422.498/0001-84', '1234');

INSERT INTO JOBVACANCY (ID, NAME, COMPANY_ID, FIELD_ID, SALARY, DESCRIPTION) VALUES (1, 'Auxiliar de administra��o', 3, 1, 56034, 'Primeira descri��o');
INSERT INTO JOBVACANCY (ID, NAME, COMPANY_ID, FIELD_ID, SALARY, DESCRIPTION) VALUES (2, 'Subauxiliar de administra��o', 3, 1, 32020, 'Segunda descri��o');
INSERT INTO JOBVACANCY (ID, NAME, COMPANY_ID, FIELD_ID, SALARY, DESCRIPTION) VALUES (3, 'Gerente do departamento de administra��o', 3, 1, 12150, 'Terceira descri��o');