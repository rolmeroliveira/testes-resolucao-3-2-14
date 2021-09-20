package com.zup.testes3214.palavra;

import com.zup.testes3214.palavra.Aceita;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AceitaTest {
    Aceita aceita = new Aceita();

    @Test
    @DisplayName("deve retornar false se parametro for nulo")
    void deveRetornarFalseSeParametroForNulo(){
        String palavra = null;
        boolean resultado = false;
        resultado = aceita.aceitaPalavra(palavra);
        assertFalse(resultado, "Erro - Aceitou seguência nula");
    }


    @Test
    @DisplayName("deve retornar false para uma sequancia com menos de 5 char")
    void deveRetornarFalseParaUmaSequanciaComMenosDe5Char(){
        String palavra = "abcd";
        boolean resultado = false;
        resultado = aceita.aceitaPalavra(palavra);
        assertFalse(resultado, "Erro - aceitou sequência menor do que 4 char");
    }

    @Test
    @DisplayName("metodo de obtencao do primeiro caracter deve isolar inequivocamente a primeira posicao")
    void deveRetornarOsPrimeiroEOUltimoCaracterDaSequencia(){
        String palavra = "qbcde";
        char primeiroCaractere = palavra.charAt(0);
        assertTrue(primeiroCaractere == 'q', "o primeiro caracter não corresponde ao que foi passado");
    }

    @Test
    @DisplayName("metodo de obtencao do primeiro caracter deve isolar inequivocamente a primeira posicao")
    void metodoDeObtencaoDoPrimeiroCaracterDeveIsolarInequivocamenteAPrimeiraPosicao(){
        String palavra = "qbcde";
        char  ultimoCaractere = palavra.charAt(palavra.length() -1);
        assertTrue(ultimoCaractere == 'e', "o ultimo caracter não corresponde ao que foi passado");
    }


    @Test
    @DisplayName("deve retornar falso quando o primeiro char da sequencia nao for letra")
    void deveRetornarFalsoQuandoOPrimeiroCharDaSequenciaNaoForLetra(){
        String palavra = "2aaaaaaaaa";
        boolean resultado = aceita.aceitaPalavra(palavra);
        assertFalse(resultado, "Erro - aceitou número no primeiro caracter");
    }

    @Test
    @DisplayName("dever retornar falso quando não terminar com s e tamanho menor que 10")
    void deverRetornarFalsoQuandoNãoTerminarComSETamanhoMenorQue10(){
        String palavra = "aaaaaa";
        boolean resultado = aceita.aceitaPalavra(palavra);
        assertFalse(resultado, "Erro - aceitou sequancia menor que 10 e sem s no final");
    }

    @Test
    @DisplayName("deve retornar true quando inica com letra e tem mais que 9 caracteres")
    void deveRetornarTrueQuandoInicaComLetraETemMaisQue9Caracteres(){
        String palavra = "aaaaaaaaaa";
        boolean resultado = aceita.aceitaPalavra(palavra);
        assertTrue(resultado, "Erro - retornou falso, mesmo com as condições atendidas");
    }

    @Test
    @DisplayName("deve retornar true quando inicia com letra e termina com s mesmo tendo menos de 10 char")
    void deveRetornarTrueQuandoIniciaComLetraETerminaComSMesmoTendoMenosDe10Char(){
        String palavra = "aaaas";
        boolean resultado = aceita.aceitaPalavra(palavra);
        assertTrue(resultado, "Erro - retornou falso, mesmo iniciando com letra e terminado com s e tendo mais de  5 char");

    }

}