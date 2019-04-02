package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Skill2person.class)
public abstract class Skill2person_ {

	public static volatile SingularAttribute<Skill2person, Skill> skillId;
	public static volatile SingularAttribute<Skill2person, Person> personId;
	public static volatile SingularAttribute<Skill2person, Integer> id;
	public static volatile SingularAttribute<Skill2person, Integer> skillLevel;

}

