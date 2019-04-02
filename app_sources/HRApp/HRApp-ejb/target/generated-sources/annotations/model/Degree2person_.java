package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Degree2person.class)
public abstract class Degree2person_ {

	public static volatile SingularAttribute<Degree2person, Degree> degreeId;
	public static volatile SingularAttribute<Degree2person, Person> personId;
	public static volatile SingularAttribute<Degree2person, Integer> id;
	public static volatile SingularAttribute<Degree2person, Date> dateOfIssue;

}

