public class Reloj
{
   private int horas;
   private int minutos;
   
   //constructor
   public Reloj(int horaInicial, int minInicial)
   {
       horas=horaInicial;
       minutos=minInicial;
   }
   //metodos
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