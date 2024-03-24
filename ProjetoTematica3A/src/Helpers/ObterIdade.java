package Helpers;

import java.time.LocalDate;

public class ObterIdade {

    public int ObterIdade(String nascimento){

        String nascimentoArray[] = new String[3];
        nascimentoArray = nascimento.split("/");
        int diaNasc = Integer.parseInt(nascimentoArray[0]);
        int mesNasc = Integer.parseInt(nascimentoArray[1]);
        int anoNasc = Integer.parseInt(nascimentoArray[2]);

        LocalDate localDate = LocalDate.now();
        int diaHoje = localDate.getDayOfMonth();
        int mesHoje = localDate.getMonthValue();
        int anoHoje = localDate.getYear();

        int diferencaDeAnos = anoHoje - anoNasc;

        if (mesHoje < mesNasc){
            diferencaDeAnos = diferencaDeAnos - 1;
        }else if (mesHoje == mesNasc && diaHoje < diaNasc) {
            diferencaDeAnos = diferencaDeAnos - 1;
        }
        return diferencaDeAnos;
    }
}
