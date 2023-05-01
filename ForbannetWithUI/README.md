<p>Seu João gostaria de fazer um sistema para cadastrar seus descendentes e informar a 
linhagem de um descendente (selecionado) até ele. Uma classe Pessoa deve ser criada para 
isso. Esta classe deve ter um método abstrato chamado cadastrarFilho que será 
implementado nas suas subclasses Filho e Filha. O método “cadastrarFilho” cria uma 
pessoa, cadastra-o como filho e depois retorna para a classe do Formulário a nova pessoa 
da família. Cada pessoa criada pode ser: uma filha, um filho ou um filho natimorto. 
Por causa de uma doença de família, no caso dos descendentes de filhas existe 50% de 
chance da pessoa morrer antes de completar o 1º mês de vida se o filho for do sexo 
masculino. Isso deve ser determinado através o método Random do pacote java.util no ato 
do cadastramento do filho.
</p>
<p>No caso dos descendentes de filhos o segundo filho sempre nasce morto, independente do 
sexo. Nos dois casos citados, o descendente deve ser do tipo FilhoNatimorto. 
Perceba que a depender do tipo de pessoa a forma de retornar o método do nome é 
diferente. Aos homens é acrescentado o prefixo “Sr”, às mulheres “Sra” e aos natimortos 
um “Natimorto”. 
</p>
<p>No Formulário existe a pessoa João (que é o patriarca) e um Arraylist de todos os seus 
descendentes, independente do grau de parentesco. Os eventos tratados devem ser o de 
inserir um novo filho e mostrar a linhagem de um descendente cadastrado. Quando uma 
pessoa é cadastrada seu nome deve aparecer no JCombobox de Familiares. A interface 
gráfica segue o modelo dado a seguir</p>