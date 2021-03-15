package co.jp.jtm.pilot.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.jp.jtm.pilot.entity.Doc;
import co.jp.jtm.pilot.repository.IDocRepository;

@RestController
@RequestMapping("/doc")
public class DocController {

	@Autowired
	private IDocRepository rep ;

	@GetMapping("/getAll")
	public Collection<Doc> getAll(){
		return rep.getAll();
	}


	@GetMapping("/getById/{id}")
	public Doc getById(@PathVariable("id") String id){
		return rep.getById(id);

	}

	@PutMapping("/save")
	public void save(@RequestBody Doc doc){
		rep.save(doc);

	}

	@DeleteMapping("/delById/{id}")
	public void delById(@PathVariable("id") String id){
		rep.delById(id);

	}




}
