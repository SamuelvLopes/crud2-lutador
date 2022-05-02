package com.devcaotics.model.repositorios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.devcaotics.model.negocios.Lutador;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author samu
 */
public class Rlutador {
    
    private static int ultimoCodigo = 1;

    private static List<Lutador> lutadores = new ArrayList<>();

    private static Rlutador myself = null;
    
    public static Rlutador getCurrentInstance(){
        
        if(myself == null)
            myself = new Rlutador();
        
        return myself;
        
    }
    
    public static void inserir(Lutador l){
        l.SetId(ultimoCodigo++);
        lutadores.add(l);
    }

    public static void alterar(Lutador l){
    
                
        for(Lutador lAux: lutadores){
          if(lAux.GetId() == l.GetId()){
                lAux.setApelido(l.getApelido());
                lAux.setNome(l.getNome());
                lAux.setSenha(l.getSenha());
                lAux.setPeso(l.getPeso());
                lAux.setAltura(l.getAltura());
                lAux.setDestro(l.isDestro());
                lAux.setCurso(l.getCurso());
                lAux.setArtMarcial(l.getArtMarcial());
                lAux.setNascimento(l.getNascimento());
                lAux.setContatoEmergencia(l.getContatoEmergencia());
              
              
                return;
            }
    }
    }
    public static Lutador ler(int id){
        for(Lutador l: lutadores){
            if(l.GetId()==id){
                return l;
            }
        }
        return null;
    }
    public static void delete(Lutador l){
        Lutador lAux=null;
        for(Lutador livr: lutadores){
            if(livr.GetId()==l.GetId()){
                lAux=livr;
                break;
            }
        }
        lutadores.remove(lAux);
    }
    public static List<Lutador> lerTudo(){
        return lutadores;
    }
}