import java.util.Scanner;

public class Hora {
    private int _iminutos;
    private int _ihora;

    public Hora(int p_ihora, int p_iminutos){
        setHora(p_ihora);
        setMinutos(p_iminutos);
    }

    @Override
    public String toString(){
        return ""+_ihora+" : "+_iminutos;
    }

    private void setMinutos(int p_iminutos){
        if(p_iminutos < 60 && p_iminutos >= 0){
            _iminutos = p_iminutos;
        }else{
            System.out.println("Introduce otros minutos");
            Scanner teclado = new Scanner(System.in);
            int minutos = teclado.nextInt();
            setMinutos(minutos);
        }
    }

    public int getMinutos(){
        return _iminutos;
    }

    private void setHora(int p_ihora){
        if(p_ihora < 24 && p_ihora >= 0){
            _ihora = p_ihora;
        }else{
            System.out.println("Introduce otra hora");
            Scanner teclado = new Scanner(System.in);
            int hora = teclado.nextInt();
            setHora(hora);
        }
    }

    public int getHora(){
        return _ihora;
    }

    public void sumarMinutos(int p_iminutos){
        if((p_iminutos + _iminutos) > 60){
            sumarHoras(1);;
            int minutos = _iminutos;
            _iminutos = 0;
            sumarMinutos((p_iminutos+minutos)-60);
        //en el else if miramos si introducen numeros negativos y asi retrocedes en el tiempo
        }else if((_iminutos + p_iminutos) < 0){
            sumarHoras(-1);
            int minutos = (_iminutos + p_iminutos);
            _iminutos = 60;
            sumarMinutos(minutos);
        }else{
            _iminutos += p_iminutos;
        }
    }

    public void sumarHoras(int p_ihoras){
        if((p_ihoras + _ihora) > 23){
            int horas = (_ihora+p_ihoras)-24;
            _ihora = 0;
            sumarHoras(horas);
        //el siguiente else if es por si meten horas negativas que podamos retroceder en el tiempo
        }else if(_ihora + p_ihoras < 0){
            int hora = (_ihora + p_ihoras);
            _ihora = 24;
            sumarHoras(hora);
        }else{
            _ihora += p_ihoras;
        }
    }
}
