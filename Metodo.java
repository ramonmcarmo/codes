/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2it;

/**
 *
 * @author ramonmachado
 */
public class Metodo {

    public Integer calculaNum(Integer a, Integer b) {
        String c;

        char[] aArray = String.valueOf(a).toCharArray();
        char[] bArray = String.valueOf(b).toCharArray();

        if (aArray.length + bArray.length > 7) {
            c = "-1";
        } else {
            c = transforma(aArray, bArray);
        }
        return Integer.parseInt(c);
    }

    public String transforma(char[] maior, char[] menor) {
        String retorno = "";
        for (int i = 0; i < maior.length + menor.length; i++) {
            if (i < maior.length) {
                retorno += String.valueOf(maior[i]);
            }
            if (i < menor.length) {
                retorno += String.valueOf(menor[i]);
            }
        }

        return retorno;
    }

    public Boolean eNumero(String caracter) {
        Boolean ok = true;
        char[] eNumero = caracter.toCharArray();
        for (int i = 0; i < eNumero.length; i++) {
            if (!Character.isDigit(eNumero[i])) {
                ok = false;
                break;
            }
        }
        return ok;
    }
}
