package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyRESTController {

	@Autowired
	ContactRepository repository;

	@Autowired
	PlaceRepository placeRepository;

	@GetMapping("/contacts")
	public Iterable<Contact> getContacts() {
		return repository.findAll();
	}

	@PostMapping("/contacts")
	public Contact saveContact(@RequestBody Contact contact) {
		return repository.save(contact);

	}

	@DeleteMapping("contacts/{email}")
	public String deleteContact(@PathVariable String email) {
		repository.deleteByEmail(email);
		return "Contact deleted";
	}

	public ModelAndView getContactsByPlaceName(@PathVariable String name) {
		List<Contact> contacts = placeRepository.findAllContactByPlaceName(name);
		return new ModelAndView("view_contatcts", "contacts", contacts);
	}

}
