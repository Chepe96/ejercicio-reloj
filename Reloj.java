public class Reloj
{
   private int horas;
   private int minutos;
   
   //constructor
   /**
    * Se inicializan las horas y minutos.
    * @param horaInicial Recibe un entero y lo asigna a horas.
    * @param minInicial Recibe un entero y lo asigna a minutos.
    */
   public Reloj(int horaInicial, int minInicial)
   {
       horas=horaInicial;
       minutos=minInicial;
   }
   //metodos
   /**
    * Este metodo va sumandole 1 a los minutos, al llegar a 60 los minutos cambian
    * a 00 y las horas aumentan 1.
    */
   public void ticTac()
   {
       if(minutos<59)
       {
           minutos+=1;
       }
       else
       {
           minutos=00;
       }
       if(minutos==00)
       {
           horas+=1;
       }
       if(horas==24)
       {
           horas=0;
       }
   }
   
   /**
    * Este metodo regresa los minutos y horas.
    */
   public String dimeTuTiempo()
   {
       String cadResultado="";
       if(horas<10)
       {
           cadResultado+="0";
       }
       cadResultado=cadResultado+horas;
       cadResultado=cadResultado+":";
       if(minutos<10)
       {
           cadResultado+="0";
       }
       cadResultado+=minutos;
       return cadResultado;
   }
}