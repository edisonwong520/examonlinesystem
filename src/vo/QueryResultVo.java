package vo;

import po.Pagination;
import po.QueryResult;
import po.StudentresultCustom;

public class QueryResultVo {
	private Pagination pagination;
	private QueryResult queryResult;
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	public QueryResult getQueryResult() {
		return queryResult;
	}
	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}
	
}
