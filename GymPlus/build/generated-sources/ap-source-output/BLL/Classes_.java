package BLL;

import BLL.Equipments;
import BLL.Traineri;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-10T14:47:34")
@StaticMetamodel(Classes.class)
public class Classes_ { 

    public static volatile SingularAttribute<Classes, Traineri> traineriID;
    public static volatile SingularAttribute<Classes, Date> mbaron;
    public static volatile CollectionAttribute<Classes, Equipments> equipmentsCollection;
    public static volatile SingularAttribute<Classes, Date> fillon;
    public static volatile SingularAttribute<Classes, Integer> id;

}