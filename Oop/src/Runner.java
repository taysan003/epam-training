import Model.*;

import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        IPlace[] listPlace={
                new People("Mike",100),
                new People("John",20),
                new ContainerCargo(0.0002),
                new People("Jerry",70),
                new TankCargo(0.00003),
                new PlatformaCargo(500),
                new People("Linda",50),
                new TankCargo(0.00005),
                new PlatformaCargo(10),
                new ContainerCargo(0.0005)
        };

        Steem  steem=new Steem(listPlace);
        System.out.println(steem);
        System.out.println(steem.isExceededCapacity());

        Arrays.sort(steem.getListPlace());
        System.out.println(steem);


    }
}
