package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Interview.class)
public abstract class Interview_ {

	public static volatile SingularAttribute<Interview, Date> date;
	public static volatile SingularAttribute<Interview, String> description;
	public static volatile SingularAttribute<Interview, Integer> id;
	public static volatile SingularAttribute<Interview, Application> applicationId;

}

