INSERT INTO PROFESSOR(id,nome,sobrenome,email,senha) VALUES(1, 'Marcelo', 'Silva', 'marcelo@gmail.com', '123456') ON CONFLICT DO NOTHING;

INSERT INTO ALUNO(id,nome,sobrenome,endereco,enderecocompleto,bairro,numero,cpf,email) VALUES(1, 'João', 'Oliveira', 'Av. Bento Gonçalves', 'Avenida Bento Gonçalves, 4289 - Partenon, Porto Alegre - RS', 'Partenon', 4289, '02886463043', 'joao@gmail.com') ON CONFLICT DO NOTHING;
INSERT INTO ALUNO(id,nome,sobrenome,endereco,enderecocompleto,bairro,numero,cpf,email) VALUES(2, 'Maria', 'Da Silva', 'Av. Ipiranga', 'Av. Ipiranga, 7721 - Partenon, Porto Alegre - RS', 'Partenon', 7721, '59822468083', 'maria@gmail.com') ON CONFLICT DO NOTHING;
INSERT INTO ALUNO(id,nome,sobrenome,endereco,enderecocompleto,bairro,numero,cpf,email) VALUES(3, 'Thiago', 'Rocha', 'Rua Afonso Rodrigues', 'Rua Afonso Rodrigues, 272 - Jardim Botânico, Porto Alegre - RS', 'Jardim Botânico', 272, '82580979034', 'thiago@gmail.com') ON CONFLICT DO NOTHING;
INSERT INTO ALUNO(id,nome,sobrenome,endereco,enderecocompleto,bairro,numero,cpf,email) VALUES(4, 'Ana', 'Lucia', 'Rua Cel Aparício Borges', 'Rua Coronel Aparício Borges, 1640 - Glória, Porto Alegre - RS', 'Glória', 1640, '34039680065', 'ana@gmail.com') ON CONFLICT DO NOTHING;
INSERT INTO ALUNO(id,nome,sobrenome,endereco,enderecocompleto,bairro,numero,cpf,email) VALUES(5, 'Pedro', 'Pinheiro', 'Rua Felizardo', 'Rua Felizardo, 438 - Jardim Botânico, Porto Alegre - RS', 'Jardim Botânico', 438, '75073524047', 'pedro@gmail.com') ON CONFLICT DO NOTHING;
INSERT INTO ALUNO(id,nome,sobrenome,endereco,enderecocompleto,bairro,numero,cpf,email) VALUES(6, 'Eliseu', 'Souza', 'Rua Eça de Queiroz', 'Rua Eça de Queiroz, 809 - Petrópolis, Porto Alegre - Rio Grande do Sul', 'Petrópolis', 809, '21141375036', 'eliseu@gmail.com') ON CONFLICT DO NOTHING;