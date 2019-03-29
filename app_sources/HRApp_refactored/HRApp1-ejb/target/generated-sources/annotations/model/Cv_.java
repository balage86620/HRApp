package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cv.class)
public abstract class Cv_ {

	public static volatile SingularAttribute<Cv, Date> uploadDate;
	public static volatile SingularAttribute<Cv, String> pathToFile;
	public static volatile SingularAttribute<Cv, String> language;
	public static volatile SingularAttribute<Cv, Person> personId;
	public static volatile SingularAttribute<Cv, Integer> id;

}

