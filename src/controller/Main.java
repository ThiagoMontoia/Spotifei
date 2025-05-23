package controller;

import dao.UsuarioDAO;
import dao.MusicaDAO;
import model.Usuario;
import model.Musica;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            MusicaDAO mdao = new MusicaDAO();

            List<Musica> musicas = mdao.buscar("yes", "nome");
            for (Musica m : musicas) {
                System.out.println("Música encontrada: " + m);
            }
            
            Usuario usuario = new Usuario("Caio", "caio@email.com", "123");
            UsuarioDAO udao = new UsuarioDAO();
            udao.cadastrar(usuario);
            
            Usuario logado = udao.validarLogin("caio@email.com", "123");
            System.out.println("Logado como: " + logado.getNome());
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}