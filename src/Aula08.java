public class Aula08 {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos em frente!");
        System.out.println("Adicionar GitHub");
        System.out.println("Adicionar newVersion");
        System.out.println("Adicionar novaMudanca");
       
    }
}

// NOVO PROJETO
//git init -> inicia o projeto git
//git add . -> adiciona todos os arqivos para serem armazenados no registro (é possível selecionar, exemplo: git add arquivo1.txt arquivo2.js ou git add caminho/do/diretorio/ ou até mesmo: arquivo1.txt arquivo2.js)
//git commit -m "projeto criado" -> é um registro de uma alteração realizada, no caso, a criação do projeto, SALVA A ALTERAÇÃO NO RESPOSITÓRIO LOCAL
//git branch "nome_do_branch"  -> um branch é uma ramificação(filial) independente de desenvolvimento que permite que você trabalhe em diferentes versões do seu projeto simultaneamente.
//git push -u nome_do_branch -> O comando "git push -u nome_do_branch" é usado para enviar (push) o branch local para um repositório remoto e configurar uma relação de acompanhamento (tracking) entre o branch local e o branch remoto. A opção "-u" ou "--set-upstream" é utilizada para configurar a relação de acompanhamento entre as filiais local e remota. Ao utilizar essa opção, você estará estabelecendo uma associação entre o ramal local e o ramal remoto correspondente, permitindo que você utilize o comando "git push" posteriormente sem a necessidade de especificar o ramal remoto e local hoje.

//UPDATE/ALTERAÇÃO/ATUALIZAÇÃO
// Antes de enviar alteração podemos também fazer uma cópia/clone da versão anterior (git clone link_do_git)

// git add .
// git commit -m "nome da atualização" -> o uso do comando -m é apenas para criar uma mensagem/nome do registro. Sem o -m é aberta uma janela para inserir o texto.
// git push origin nome_do_branch -> envia o commit ao branch situado no REPOSITÓRIO REMOTO 

//COMANDOS ÚTEIS
// git add src/Aula08.java  -> seleciona arquivos para salvar no repositório LOCAL a BRANCH atual
// git commit -m "Salvar alterações antes de alternar para a branch 'alteracao'" -> salva o os arquivos adicinados ao respositório LOCAL

// git checkout nome_do_branch -> seleciona a branch, ou seja, permite navegar entre as branch's (ramificações)


// Caso use o código abaixo não é necessário citar o nome_do_branch quando atualiza uma nova versão
// git push (caso tenha executado o comando -> git push --set-upstream origin newVersion)


// como mostrar todos os branch's
// git branch -> lista todas as ramificações/branchs existentes no respositório
// git status -> O comando git statusé usado para exibir o estado atual do seu repositório Git. Ele fornece informações sobre os arquivos modificados, adicionados ou excluídos no seu diretório de trabalho, bem como informações sobre a filial atual e o estado do repositório em relação à filial remota.


// como remover os branch's
// git branch -d nome_do_branch
// git branch -d Aula.08new



//ENTENDENDO UM POUCO MAIS 
/* 
Quando você realiza um commit, o Git cria um registro permanente das alterações realizadas nos arquivos do seu repositório. Esses registros são armazenados em um banco de dados interno do Git, juntamente com metadados, como informações do autor, data e hora do commit, e uma referência ao commit anterior.

Essas informações são armazenadas no diretório ".git" do seu projeto, que contém todo o histórico do repositório Git, incluindo todos os commits realizados. Portanto, mesmo após desligar e ligar a máquina, as informações sobre os commits permanecerão no repositório local do Git e poderão ser acessadas quando você iniciar o trabalho no projeto.

No entanto, é importante ressaltar que os commits não são sincronizados automaticamente com um repositório remoto. Se você deseja compartilhar seus commits com outras pessoas ou sincronizá-los com um servidor remoto, você precisará usar o comando "git push" para enviar os commits para o repositório remoto correspondente. */


//comando útil para abrir o terminal control+shift+'