package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static volatile SingularAttribute<Person, String> password;
	public static volatile ListAttribute<Person, Cv> cvList;
	public static volatile ListAttribute<Person, Skill2person> skill2personList;
	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, Integer> id;
	public static volatile ListAttribute<Person, Application> applicationList;
	public static volatile SingularAttribute<Person, String> userName;
	public static volatile ListAttribute<Person, Degree2person> degree2personList;
	public static volatile SingularAttribute<Person, String> email;

}

