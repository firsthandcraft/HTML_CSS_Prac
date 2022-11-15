package board;

import java.util.ArrayList;

public class BoardServiceImpl implements BoardService {
	private BoardDao dao;

	public BoardServiceImpl() {
		dao = new BoardDaoImpl();
	}

	@Override
	public void addArticle(Article a) {
		// TODO Auto-generated method stub
		dao.insert(a);
	}

	@Override
	public Article getArticle(int num) {
		// TODO Auto-generated method stub
		return dao.select(num);
	}

	@Override
	public ArrayList<Article> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void editArticle(Article a) {
		// TODO Auto-generated method stub
		dao.update(a);
	}

	@Override
	public void delArticle(int num) {
		// TODO Auto-generated method stub
		dao.delete(num);
	}

}
