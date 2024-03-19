/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud_java;
import DAO.ConexaoDAO;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.util.Scanner;
import static sun.security.jgss.GSSUtil.login;
/**
 *
 * @author ra2057005
 */
public class Crud_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        UsuarioDTO u =new  UsuarioDTO();
        u.setNome("Rogerio");
        u.setEmail("a@gmail.com");
        u.setSenha("1234");
        u.setLogin("rogerio");
        
        UsuarioDTO a =new  UsuarioDTO();
        a.setNome("aa");
        a.setEmail("tr@gmail.com");
        a.setSenha("1234677");
        a.setLogin("rogeriu");
        
        UsuarioDTO b =new  UsuarioDTO();
        b.setNome("lkjhg");
        b.setEmail("tsdsdasdr@gmail.com");
        b.setSenha("987532");
        b.setLogin("fgasdg");
        
        new UsuarioDAO().cadastrarUsuario(u);
        new UsuarioDAO().cadastrarUsuario(b);
        new UsuarioDAO().deletarUsuario(u);
        new UsuarioDAO().alterarUsuario(b,a);
        new UsuarioDAO().selecionarUsuario();
        
        
        System.out.println("\tCadastro de clientes");
        System.out.println("0. Fim");
        System.out.println("1. Inclui");
        System.out.println("2. Altera");
        System.out.println("3. Exclui");
        System.out.println("4. Consulta");
        System.out.println("Opcao:");
        
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            case 4:
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
    
}
