/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.parg.viacep;

/**
 *s
 * @author ITALO
 */
public class Principal {
    public static void main(String argcs[]) throws ViaCEPException{
        
        ViaCEP cep = new ViaCEP();
    
        
        cep.buscar("35570-280");
        
        System.out.print("Rua"+cep.getLogradouro());
        System.out.print("Cidade"+cep.getLocalidade());
        System.out.print("Bairro"+cep.getBairro());
        
    }
}
