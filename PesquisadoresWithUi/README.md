<p>Faça um programa orientado a objetos para cadastrar pessoas que se inscreveram em um 
Projeto de Pesquisa que tem como pesquisador maior a Sra. Mara Andrade. Os 
pesquisadores que trabalham neste Projeto de Pesquisa podem ser Coordenadores de 
Pesquisa que têm pesquisadores e outros coordenadores de pesquisa sob sua supervisão ou 
então simples professores.</p>

<p>Uma classe Pesquisador deve ser criada para auxiliar a sua solução. Todo pesquisador deve 
ser capaz de informar quantos pesquisadores existem sobre sua supervisão. Todo 
pesquisador possui um coordenador de pesquisa, que também é do tipo pesquisador.</p>

<p>A classe Projeto de Pesquisa deve ser construída para armazenar os pesquisadores 
cadastrados (método inserirPesquisador), para retornar a quantidade de pesquisadores 
associados a um pesquisador (método getQtdPesquisadores) e para retornar o valor a ser 
pago pelo pesquisador para se inscrever no Projeto (método getValorPago). 
Para calcular o valor a ser pago pelo pesquisador é preciso levar em consideração que 
professores pagam R$ 220,00 mais 30% do que paga seu coordenador de pesquisa, 
enquanto que coordenadores de pesquisa pagam R$ 300,00 menos 2,5% por cada 
pesquisador que esteja vinculado a ele.</p>

<p>A classe de Interacao com os usuários deve seguir o modelo apresentado na figura e os 
nomes dos componentes apresentados no Anexo. Para cada pesquisador cadastrado no 
Projeto deve ser possível executar as consultas mostradas na figura (quantidade de 
pesquisadores associados e a valor pago para entrar no projeto). Lembre-se que os 
pesquisadores associados de um coordenador de pesquisa envolvem tanto seus 
pesquisadores (e coordenadores de pesquisa) como os pesquisadores de seus 
coordenadores.</p>