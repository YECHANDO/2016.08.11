/**
 * licecse.. etc
 */

package kr.co.kosta.contact.service;

import java.awt.List;

import kr.co.kosta.contact.model.Contact;

/**
 * 클래스 설명
 * @author User
 * @version
 */
public class ContactService {
	/**
	 * 
	 * @param contact
	 */
	void registContact(Contact contact);
	/**
	 * 
	 * @return
	 */
	List<Contact> listContact();
	/**
	 * 
	 * @param name
	 * @return
	 */
	Contact detailContact(Strig name);
	/**
	 * 
	 * @param name
	 */
	void removeContact(String name);
	/**
	 * 
	 */
}
