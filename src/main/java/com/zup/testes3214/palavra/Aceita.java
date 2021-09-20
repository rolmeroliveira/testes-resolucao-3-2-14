package com.zup.testes3214.palavra;

public class Aceita {

    public boolean aceitaPalavra(String str){
        if(str == null || str.length() < 5){
            return false;
        }

        char primeiroCaractere = str.charAt(0);
        char ultimoCaractere = str.charAt(str.length() -1);
        int tamanho = str.length();

        if (Character.isLetter(primeiroCaractere)
                && (ultimoCaractere == 's' || tamanho >= 10)) {
            return true;
        } else {
            return false;
        }
    }

}
