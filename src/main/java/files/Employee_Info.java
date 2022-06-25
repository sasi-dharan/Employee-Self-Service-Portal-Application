package files;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee_Info {
@Id
@GeneratedValue
int Employee_ID;
@Column	(length = 50)
String Employee_Name;
String Employee_Type;
@Column(length = 100)
String Email;
@Column(length = 50)
String Password;
//@OneToMany
//List <Employee_Leave> employee_leave;

}
