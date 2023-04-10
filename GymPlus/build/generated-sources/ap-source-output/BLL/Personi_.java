package BLL;

import BLL.Fees;
import BLL.Traineri;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-10T14:47:34")
@StaticMetamodel(Personi.class)
public class Personi_ { 

    public static volatile SingularAttribute<Personi, String> emri;
    public static volatile CollectionAttribute<Personi, Fees> feesCollection;
    public static volatile SingularAttribute<Personi, Date> dataERegjistrimit;
    public static volatile SingularAttribute<Personi, Traineri> traineriID;
    public static volatile SingularAttribute<Personi, String> mbiemri;
    public static volatile SingularAttribute<Personi, Integer> id;

}