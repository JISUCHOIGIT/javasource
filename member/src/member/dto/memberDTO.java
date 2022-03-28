package member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// member 테이블과 똑같이 작성

@ToString
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class memberDTO {
	private int id;
	private String name;
	private String addr;
	private String email;
	private int age;
	
	public memberDTO(String name, String addr, String email, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.email = email;
		this.age = age;
	}

}
