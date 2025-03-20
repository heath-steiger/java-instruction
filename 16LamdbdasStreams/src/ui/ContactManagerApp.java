package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Model.Contact;
import Model.TestContact;
import util.MyConsole;

public class ContactManagerApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to the Contact Manger - With Lamdbas!");

		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
 
		// show all contacts
		displayContacts(contacts, "All Contacts");
		
		// show contacts - missing phone #s
		//List<Contact> contactsNoPhone = filterContacts(contacts, c -> c.getPhone()==null);
		List<Contact> contactsNoPhone = filterContacts(contacts, (Contact c) -> {return c.getPhone()==null;});
		displayContacts(contactsNoPhone,"Contacts - no phone");
		
		// show contacts - missing Email
		List<Contact> contactsNoEmail = filterContacts(contacts, c -> c.getEmail()==null);
		displayContacts(contactsNoEmail,"Contacts - no email");
		
		// show contacts missing phone and email -
		List<Contact> contactsNoPhoneNoEmail = filterContacts(contacts, c -> c.getEmail()==null &&  c.getPhone()==null);
		displayContacts(contactsNoPhoneNoEmail,"Contacts - no email, no phone");
		
		// show contacts with last name murach 
		List<Contact> contactsMurach = filterContacts(contacts, (Contact c) -> {
			String[] names = c.getName().split(" ");			
			return names[1].equals("Murach");
			});
		displayContacts(contactsMurach,"Contacts - last name murach");

		// print the names of the contacts
		
		processContacts(contacts, c -> MyConsole.printLine(c.getName()));
		
		// change the names in the contact list to upper case
		processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
		MyConsole.printLine("Contact names");
		processContacts(contacts, c -> MyConsole.printLine(c.getName()));
		
		MyConsole.printHeader("Contact string (name + phone) w/ default values if phone is null");
		List<String> contactPhoneNumbers =  transformContacts(contacts, 
				c -> {
					String phone = (c.getPhone()== null) ? "n/a" : c.getPhone();
					return c.getName() + ": " + phone;
				});
		// for loop to print strings
		for (String s: contactPhoneNumbers) {
			MyConsole.printLine(s);
		}
		
		 // p. 551 use stream to do the same thing
		MyConsole.printHeader("Use stream to print phone ifno: ");
		contactPhoneNumbers.stream().forEach(s -> MyConsole.printLine(s));
		
		// Bonus : streams on arrays? - convert array to a list first
		String[] names = {"Jim", "Celina", "Heath", "Andy"};
		List<String> namesList = Arrays.asList(names);
		namesList.forEach(n ->MyConsole.printLine(n));
		
		// make names upper case
		//namesList.stream().forEach(s -> s= s.toUpperCase());
		//namesList.forEach(n ->MyConsole.printLine(n));
		
		// use a stream to filter a list and process each element
		contacts.stream()
				.filter(c -> c.getPhone()== null)
				.forEach(c -> MyConsole.printLine(c.getName()));
		
		//use a stream to filter a list and collect the items in a new list
		contactsNoPhone = contacts.stream()
				.filter(c -> c.getPhone()== null)
				.collect(Collectors.toList());
		
		contactsNoPhone.stream().forEach(c -> MyConsole.printLine(c.toString()));
		
		//p. 553 map
		//using a stream to transform a list of contact objects
		List<String> contactNames = contacts.stream()
					.map(c-> c.getName())
					.collect(Collectors.toList());
		
		MyConsole.printLine("Map to stream");
		contactNames.stream().forEach(str-> MyConsole.printLine(str));
		
		// same example w/double colon operator
		List<String> contactNames2 = contacts.stream()
				.map(Contact::getName)
				.collect(Collectors.toList());
	
		MyConsole.printLine("Map to stream 2");
		contactNames2.stream().forEach(MyConsole::printLine);
		
		// p. 555 map reduce contacts to a single string in csv format
		String csv = contacts.stream().map(c -> c.getName()).reduce("", (a,b) -> a + b + ", ");
		MyConsole.printLine(csv);
		
		List<Double> prices = new ArrayList<>(Arrays.asList(11059.32, 23456.0,31789.8, 1111.11, 40123.5)) ;
		// largest price
		double maxPrice = prices.stream().reduce(0.0, (a,b)-> Math.max(a, b));
		MyConsole.printLine("max price " +maxPrice);
		
		// method reference
		double minPrice = prices.stream().reduce(Double.MAX_VALUE, Math::min);
		MyConsole.printLine("min price " +minPrice);
		
		
		MyConsole.printLine("bye");
	}
	// p. 543- predicate 
	//private static List<Contact> filterContacts(List<Contact> contacts, TestContact condition) {
	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c:contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		
 		return filteredContacts;
	}
	
	//p. 545 - consumer
	//
	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		 for (Contact c: contacts) {
			 consumer.accept(c);
		 }
	}
	
	// p.547 - function
	private static List<String> transformContacts(List<Contact> contacts, Function<Contact, String> function) {
		List<String> strings = new ArrayList<>();
		for (Contact c: contacts) {
			strings.add(function.apply(c));
		}
		return strings;
	}
	
	private static void displayContacts(List<Contact> contacts, String header) {
		MyConsole.printHeader(header, "-");
		for (Contact c: contacts) {
			MyConsole.printLine(c.toString());
			
		}
			
	}
}
