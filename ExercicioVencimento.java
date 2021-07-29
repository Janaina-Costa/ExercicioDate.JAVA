package digitalinnovattionon.classes.datas;
import  java.util.Calendar;



public class ExercicioVencimento {
    public static void main(String[] args) {
        /*Define a data do vencimento com o metodo set(ano, mes, dia)*/
        Calendar vencimento = Calendar.getInstance();
        vencimento.set(2021, Calendar.JULY, 27);
        System.out.println("Dia do vencimento: "+vencimento.getTime()+"\n");

        /*Adiciona 10 dias na data do vencimento*/
        vencimento.add(Calendar.DATE, 10);

        /*Verifica qual o dia da semana em numero corresponde a este vencimento acrescido de 10 dias*/
        int semanaDay = vencimento.get(Calendar.DAY_OF_WEEK);

        /*condiciona o ultimo dia de pagamento sem juros*/
        if(semanaDay == 1){
            /*se cair no dia não util domingo(==1) soma mais um para pagar ate segunda*/
            vencimento.add(Calendar.DATE, 1);

        }else if (semanaDay == 7) {
            /*se cair no dia não util sabado(==7) soma mais 2 para pagar ate segunda*/
            vencimento.add(Calendar.DATE, 2);
        }

        System.out.printf("Ultimo dia para pagamento sem juros: %tc",vencimento,"\n");

    }
}
