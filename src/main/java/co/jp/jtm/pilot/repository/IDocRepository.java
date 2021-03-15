package co.jp.jtm.pilot.repository;

import java.util.Collection;

import co.jp.jtm.pilot.entity.Doc;


public interface IDocRepository {
	public Collection<Doc> getAll();
	public Doc getById(String id);
	public int save(Doc doc);
	public int delById(String id);


}
