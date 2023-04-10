package BLL;

import BLL.Classes;
import BLL.Personi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-10T14:47:34")
@StaticMetamodel(Traineri.class)
public class Traineri_ { 

    public static volatile SingularAttribute<Traineri, String> emri;
    public static volatile CollectionAttribute<Traineri, Classes> classesCollection;
    public static volatile SingularAttribute<Traineri, String> mbiemri;
    public static volatile SingularAttribute<Traineri, Integer> id;
    public static volatile CollectionAttribute<Traineri, Personi> personiCollection;

}