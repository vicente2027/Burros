package com.company;

class hilos extends Thread
{
    public String var;
    public static int b1, b2;
    public static int sum1 = 0;
    public static int i;
    public hilos(String str)
    {
        super(str);
    }
    public void run()
    {
        do{
            var = i + " " + getName();
            System.out.println(var);
            if (getName() == "Burro1"){
                sum1 = sum1 +1;
                System.out.println(sum1);

            } else if (getName()=="Burro2"){
                sum1 = sum1 -1;
                System.out.println(sum1);

            }

            System.out.println(sum1);
            i++;
        }
        while ((sum1==10) || (sum1 == -10));
/*
        for (int i = 0; i < 10 ; i++) {
            var = i + " " + getName();
            System.out.println(var);
            if (getName() == "Burro1"){
                sum1 = sum1 +1;
            } else if (getName()=="Burro2"){
                sum1 = sum1 -1;
            }

            System.out.println(sum1);

            if (i==9 && getName()=="Burro1"){
                b1 = 1;
                if (b2==1){
                    System.out.println("Perdio Burro1");
                }else{
                    System.out.println("Gano Burro1");

                }
            }else if(i == 9 && getName()=="Burro2"){
                b2 = 1;
                if (b1==1){
                    System.out.println("Perdio Burro2");
                }else{
                    System.out.println("Gano Burro2");

                }
            }*/


        System.out.println("Termina thread " + getName());
    }
    public static void main (String [] args)
    {
        hilos Burro1 = new hilos("Burro1");
        hilos Burro2 = new hilos("Burro2");
        Burro1.start();
        Burro2.start();

        System.out.println("Termina thread main");

    }
}

