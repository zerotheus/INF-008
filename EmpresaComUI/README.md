<p>Em anexo temos um programa orientado a objetos para cadastrar pessoas que trabalham 
em uma empresa onde o chefe maior é seu Antonio Carlos Pereira. As pessoas que 
trabalham nesta empresa podem ser chefes que têm empregados e outros chefes sob sua 
supervisão ou então empregados. As classes Pessoa, Empregado, Chefe e Empresa devem 
ser implementadas.</p> 

<p>O método getListaEmpregadosAssociados (), da classe Pessoa é abstrato e precisa ser 
implementado por você nas subclasses. Com este método é possível mostrar a lista dos 
empregados subordinados (diretos e indiretos) desta Pessoa, conforme pode ser visto no 
exemplo dado abaixo.</p> 

<p>Toda pessoa deve ser capaz de informar a lista dos empregados sobre sua supervisão, bem 
como a lista de seus superiores. Os empregados subordinados são aqueles que são 
empregados diretos de subordinados da Pessoa. Toda Pessoa possui um superior, que 
também é do tipo pessoa.</p> 

<p>A classe de Interacao com os usuários deve seguir o modelo apresentado na figura. Para 
cada nova pessoa cadastrada na Empresa já deve ser possível executar a consulta de quais 
os empregados que estão sob sua supervisão, bem como a lista dos chefes.</p>