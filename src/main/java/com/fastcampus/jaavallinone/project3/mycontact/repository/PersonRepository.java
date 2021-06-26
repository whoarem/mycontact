package com.fastcampus.jaavallinone.project3.mycontact.repository;

import com.fastcampus.jaavallinone.project3.mycontact.domain.Person;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person, Long> {

  List<Person> findByName(String name);

  List<Person> findByBlockIsNull();

  List<Person> findByBloodType(String bloodType);

  @Query(value = "select person from Person person where person.birthday.monthOfBirthday= :monthOfBirthday")
  List<Person> findByMonthOfBirthday(@Param("monthOfBirthday") int monthOfBirthday);

  @Query(value = "select * from Person person where person.deleted = true", nativeQuery = true)
  List<Person> findPerpleDelete();
}
