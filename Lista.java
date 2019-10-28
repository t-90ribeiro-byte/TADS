/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.faec.tad;

/**
 *
 * @author alunolike
 */
public class Lista {
    
    Celula primeiro, ultimo;

    /**
     * * Cria uma lista vazia
     */
    public Lista() {
        primeiro = new Celula();
        ultimo = primeiro;
    }
    public Object pesquisa(Object info) {
        return null;
         }
    public boolean vazia() {
    
    return primeiro == null;
    }
       Celula aux = primeiro;
       white (aux != null) {
             if (aux.item.equals(info)) {
                 return info;
             }
            aux = aux.proximo;
        }
        return null;
    }

    public void inserir(Object info) {
        
    }