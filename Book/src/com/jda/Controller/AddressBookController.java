package com.jda.Controller;

import com.jda.service.AdressbookImplementation;
import com.jda.service.NewAdressBookImplementation;

import Utility.utility;

public class AddressBookController {
	public static void main(String args[]) throws Exception {
		utility util=new utility();
		int choice;
		int ch;
	    NewAdressBookImplementation book=new NewAdressBookImplementation();
		String existingfilename = " ";
		do {
			AdressbookImplementation addressbookimpl = new AdressbookImplementation();
			System.out.println("ADDRESS BOOK");
			System.out.println("1.create 2.edit 3.save 4.save as ");
			choice = util.inputInteger();
			switch (choice) {
			case 1:
				book.add();
				
				break;
			case 2:
			
				System.out.println("Enter the name of the address book");
				existingfilename = util.inputString();
				
					
					do {
						System.out.println("1.ADD  2.EDIT 3.DELETE 4.SORT BY NAME 5. SORT BY PIN 6.PRINT ");
						ch = util.inputInteger();
						switch (ch) {
						case 1:
							addressbookimpl.add();
							break;
						case 2:
							
							addressbookimpl.edit();
							break;
						case 3:
							addressbookimpl.delete();
							break;
						case 4:
							addressbookimpl.sortByName();
							break;
						case 5:
							addressbookimpl.sortByZip();
							break;
						case 6:
							addressbookimpl.print();
							break;
						

						}
						System.out.println("Enter 0 to stop");
						ch=util.inputInteger();

					} while (ch != 0);

				//}
				break;
			case 3:
				book.save(existingfilename);
				break;
			case 4:
				book.rename();
				break;
			
			}
			System.out.println("Enter 0 to stop");
			choice=util.inputInteger();

		} while (choice != 0);

	}


}
