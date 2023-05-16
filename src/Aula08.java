public class Aula08 {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos em frente!");
        System.out.println("Adicionar GitHub");
        System.out.println("Adicionar newVersion");
        System.out.println("Adicionar novaMudanca");








        
    }
}

// NOVO PROJETO
//git init
//git add .
//git commit -m "projeto criado"
//git branch "nome_do_branch"  -> um branch é uma ramificação independente de desenvolvimento que permite que você trabalhe em diferentes versões do seu projeto simultaneamente.
//git push -u nome_do_branch

//UPDATE/ALTERAÇÃO/ATUALIZAÇÃO
// enviar alteração
// faz uma cópia/clone da versão anterior

// git add .
// git commit -m "nome da atualização" -> o uso do comando -m é apenas para criar uma mensagem. Sem o -m é marcado um novo registro da alteração dentro dagit ramificação.
// git push origin nome_do_branch  

//COMANDOS ÚTEIS
// git add src/Aula08.java  -> seleciona arquivos para salvar no repositório LOCAL a BRANCH atual
// git commit -m "Salvar alterações antes de alternar para a branch 'alteracao'" -> salva o os arquivos adicinados ao respositório LOCAL

// git checkout nome_do_branch -> seleciona a branch, ou seja, permite navegar entre as branch's (ramificações)



// Caso use o código abaixo não é necessário citar o nome_do_branch quando atualiza uma nova versão
// git push (caso tenha executado o comando -> git push --set-upstream origin newVersion)


// como mostrar todos os branch's
// git branch 
// git status -> O comando git statusé usado para exibir o estado atual do seu repositório Git. Ele fornece informações sobre os arquivos modificados, adicionados ou excluídos no seu diretório de trabalho, bem como informações sobre a filial atual e o estado do repositório em relação à filial remota.


// como remover os branch's
// git branch -d nome_do_branch
// git branch -d Aula.08new


