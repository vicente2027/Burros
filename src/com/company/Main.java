package com.company;


/*
Baizabal Vazquez Efrain Gustavo
Cuevas Cruz Vicente
Garcia Morales Erick Gerardo
Arellano Gomez Juan de Jesús
Pablo Hernan Luna Rosas
 */
class hilos extends Thread
{
    public static int b1, b2;
    public static int sum = 0;
    public static int i;
    public hilos(String str)
    {
        super(str);
    }
    public void run()
    {
        do{
            if (getName() == "Burro1"){
                sum = sum +1;
                System.out.println(sum);

            } else if (getName()=="Burro2"){
                sum = sum -1;

            }
            if (sum==10 && getName()=="Burro1"){
                b1 = 1;
                if (b2==1){
                    System.out.println("Perdio Burro1");
                }else{
                    System.out.println("Gano Burro1");

                }
            }else if(sum == -10 && getName()=="Burro2"){
                b2 = 1;
                if (b1==1){
                    System.out.println("Perdio Burro2");
                }else{
                    System.out.println("Gano Burro2");
                }
            }
            System.out.println(sum);
            i++;
        }
        while ((sum!=10) && (sum != -10));

        System.out.println("Termina thread " + getName());

    }
    public static void main (String [] args)
    {
        hilos Burro1 = new hilos("Burro1");
        hilos Burro2 = new hilos("Burro2");
        Burro1.start();
        Burro2.start();

        System.out.println("Termina thread main");
        System.out.println("Integrantes\n"+
                "Baizabal Vazquez Efrain Gustavo\n" +
                "Cuevas Cruz Vicente\n" +
                "Garcia Morales Erick Gerardo\n" +
                "Arellano Gomez Juan de Jesús\n" +
                "Pablo Hernan Luna Rosas");
    }
}

