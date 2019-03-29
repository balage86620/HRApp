package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Degree.class)
public abstract class Degree_ {

	public static volatile ListAttribute<Degree, Degree2hiring> degree2hiringList;
	public static volatile SingularAttribute<Degree, String> name;
	public static volatile SingularAttribute<Degree, Integer> id;
	public static volatile ListAttribute<Degree, Degree2person> degree2personList;

}

