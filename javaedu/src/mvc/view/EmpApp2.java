package mvc.view;

import mvc.model.domain.EmpDTO;
import mvc.model.service.EmpDAO;

import java.util.List;

public class EmpApp2 {

	public static void main(String[] args)  {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> page_list = dao.page1(1, 4);
		for(EmpDTO dto : page_list)
			System.out.println(dto);
		System.out.println("*".repeat(50));
		page_list = dao.page2(1, 14);
		for(EmpDTO dto : page_list)
			System.out.println(dto);
	}
}
//게시판 할때 꼭 알아야 함.