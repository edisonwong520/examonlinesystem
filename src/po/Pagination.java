package po;

public class Pagination {
	private Integer rows;
	private Integer page;
	private Integer startPage;
	public Integer getStartPage() {
		return startPage;
	}
	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
}
