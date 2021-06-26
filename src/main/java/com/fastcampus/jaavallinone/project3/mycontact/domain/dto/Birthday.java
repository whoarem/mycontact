package com.fastcampus.jaavallinone.project3.mycontact.domain.dto;

import java.time.LocalDate;
import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Data
public class Birthday {
  private Integer yearOfBirthday;

  @Min(1)
  @Max(12)
  private Integer monthOfBirthday;

  @Min(1)
  @Max(31)
  private Integer dayOfBirthday;

  public Birthday(LocalDate birthday){
    this.yearOfBirthday = birthday.getYear();
    this.monthOfBirthday = birthday.getMonthValue();
    this.dayOfBirthday = birthday.getDayOfMonth();
  }
}
