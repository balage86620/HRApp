package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Application.class)
public abstract class Application_ {

	public static volatile SingularAttribute<Application, Hiring> hiringId;
	public static volatile SingularAttribute<Application, Date> modificationDate;
	public static volatile ListAttribute<Application, Interview> interviewList;
	public static volatile SingularAttribute<Application, Date> dateOfApplication;
	public static volatile SingularAttribute<Application, Person> personId;
	public static volatile SingularAttribute<Application, Integer> id;
	public static volatile SingularAttribute<Application, String> status;

}

