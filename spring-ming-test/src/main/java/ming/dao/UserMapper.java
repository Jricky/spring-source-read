package ming.dao;

import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {

	@Select("select * from pmt_user")
	List<HashMap> query();
}
