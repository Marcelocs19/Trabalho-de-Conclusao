INSERT INTO PROFESSOR(id,nome,sobrenome,email,senha) VALUES(1, 'Marcelo', 'Silva', 'marcelo@gmail.com', '123456') ON CONFLICT DO NOTHING;

--INSERT INTO ALUNO(id,nome,sobrenome,endereco,bairro,numero,cpf,email) VALUES(1, 'João', 'Da Silva', 'Rua Guilherme Alves', 'Petrópolis', 230, '58798549065', 'teste1@gmail.com') ON CONFLICT DO NOTHING;
--INSERT INTO ALUNO(id,nome,sobrenome,endereco,bairro,numero,cpf,email) VALUES(2, 'Guilherme', 'Oliveria', 'Av. Ipiranga', 'Jardim Botânico',7200, '75269096056', 'teste2@gmail.com') ON CONFLICT DO NOTHING;
--INSERT INTO ALUNO(id,nome,sobrenome,endereco,bairro,numero,cpf,email) VALUES(3, 'Eliane', 'Rocha', 'Rua Machado de Assis', 'Partenon', 313, '87521626052', 'teste3@gmail.com') ON CONFLICT DO NOTHING;