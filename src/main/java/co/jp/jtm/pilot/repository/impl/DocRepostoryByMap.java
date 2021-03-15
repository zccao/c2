package co.jp.jtm.pilot.repository.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import co.jp.jtm.pilot.entity.Doc;
import co.jp.jtm.pilot.repository.IDocRepository;

@Repository
public class DocRepostoryByMap implements IDocRepository {

	private static Map<String, Doc> docMap;

	static {
		docMap = new HashMap<String, Doc>();
		docMap.put("001001001", new Doc("001001", "001", "data1"));
		docMap.put("001001002", new Doc("001002", "002", "data2"));
		docMap.put("001001003", new Doc("001003", "003", "data3"));
	}

	@Override
	public Collection<Doc> getAll() {

		return docMap.values();
	}

	@Override
	public Doc getById(String id) {

		return docMap.get(id);
	}

	@Override
	public int save(Doc doc) {
		docMap.put(doc.getId(), doc);
		return 0;
	}

	@Override
	public int delById(String id) {
		docMap.remove(id);
		return 0;
	}

}
