package pres;

import dao.DaoImpl;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        IMetierImpl metier=new IMetierImpl(dao);

        System.out.println(metier.calcul());

    }
}
