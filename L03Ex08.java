/*Faça um algoritmo para ler um número que é um código de usuário. Caso este
código seja diferente de um código armazenado internamente no algoritmo (igual a
1234) deve ser apresentada a mensagem Usuário inválido!. Caso o Código seja
correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a
certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha
esteja correta, deve ser mostrada a mensagem Acesso permitido.
 */
import java.util.Scanner;

 public class L03Ex08 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        String codigo, senha;

        System.out.println("Informe o codigo de usuario: ");
        codigo = in.next();

        if(codigo.equals("1234")){
            System.out.println("Informe a senha: ");
            senha = in.next();

            if(senha.equals("9999")){
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Senha invalida!");
            }
        } else {
            System.out.println("Usuartio invalido!");
        }


    }

 }