package mapper;

import java.util.List;

import po.Pagination;
import po.QuestionsCustom;

public interface QuestionsMapperCustom {
	List<QuestionsCustom> getListByLimit(Pagination pagination);
	List<QuestionsCustom> getListByTaotiId(Integer taotiId);
}