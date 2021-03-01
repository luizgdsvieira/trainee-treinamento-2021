package br.com.infox.treinamento.trainee.pessoajuridica;

public class CnpjUtil {

	private CnpjUtil() {
	}

	public static boolean isValid(String cnpj) {
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma = soma + parseInt(cnpj.charAt(i)) * (10 - i);
        }
        int dv1 = 11 - (soma % 11);
        if (dv1 == 10 || dv1 == 11) {
            dv1 = 0;
        }
        if (dv1 != parseInt(cnpj.charAt(14))) {
            return false;
        }
        soma = 0;
        for (int i = 0; i < 14; i++) {
            soma = soma + parseInt(cnpj.charAt(i)) * (11 - i);
        }
        soma = soma + dv1 * 2;
        int dv2 = 11 - (soma % 11);
        if (dv2 == 10 || dv2 == 11) {
            dv2 = 0;
        }
        if (dv2 != parseInt(cnpj.charAt(15))) {
            return false;
        }
        return true;
    }

    private static int parseInt(Character c) {
        return Integer.parseInt(c.toString());
    }
}