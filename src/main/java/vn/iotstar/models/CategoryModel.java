package vn.iotstar.models;

import java.io.Serializable;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
//Model trung gian để dùng chung edit và add
public class CategoryModel implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private long id;
	@NotEmpty(message = "không được bỏ trống")
	private String name;
	private String images;
	private int status;
	
	private Boolean isEdit=false;
}
