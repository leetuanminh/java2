import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactList {
    private List<Contact> listContact = new ArrayList();

    public ContactList() {
    }

    public void addContact(Contact contact) {
        this.listContact.add(contact);
    }

    public void updateContact(Contact contactOld, Contact contactNew) {
        Iterator var3 = this.listContact.iterator();

        while(var3.hasNext()) {
            Contact contact = (Contact)var3.next();
            if (contact.equals(contactOld)) {
                this.listContact.set(this.listContact.indexOf(contactOld), contactNew);
            }
        }

    }

    public void removeContact(Contact contact) {
        this.listContact.remove(contact);
    }

    public void searchContact(String key) {
        Iterator var2 = this.listContact.iterator();

        while(var2.hasNext()) {
            Contact contact = (Contact)var2.next();
            if (contact.getName().contains(key)) {
                System.out.println(contact);
            }
        }

    }

    public void getListContact() {
        Iterator var1 = this.listContact.iterator();

        while(var1.hasNext()) {
            Contact contact = (Contact)var1.next();
            System.out.println(contact);
        }

    }
}

