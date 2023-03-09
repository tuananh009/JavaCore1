package AbstractClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBook extends Phone {
	private ArrayList<String> phoneList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	private int findIndexByName(String name) {
		for (int i = 0; i < phoneList.size(); i++) {
			String[] elements = phoneList.get(i).split(" : ");
			String phoneName = elements[0];
			if (phoneName.equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void insertPhone(String name, String phone) {
		int index = findIndexByName(name);
		if (index == -1) {
			phoneList.add(name + " : " + phone);
		} else {
			String[] elements = phoneList.get(index).split(" : ");
			String oldPhone = elements[1];
			if (!oldPhone.contains(phone)) {
				phoneList.set(index, name + " : " + oldPhone + " : " + phone);
			}
		}
	}

	@Override
	public void removePhone(String name) {
		 int index = findIndexByName(name);
	        if (index != -1) {
	            phoneList.remove(index);
	        }
	}

	@Override
	public void updatePhone(String name, String newPhone) {
        int index = findIndexByName(name);
        if (index != -1) {
            String[] elements = phoneList.get(index).split(" : ");
            String newName = elements[0];
            phoneList.set(index, newName + " : " + newPhone);
        }
    }


	@Override
	public void searchPhone(String name) {
		 int index = findIndexByName(name);
	        if (index != -1) {
	            String[] elements = phoneList.get(index).split(" : ");
	            String phone = elements[1];
	            System.out.println("Phone number of " + name + " is " + phone);
	        } else {
	            System.out.println(name + " does not exist in the phone book");
	        }

	}

	@Override
	public void sortPhone() {
		Collections.sort(phoneList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String[] elements1 = o1.split(" : ");
                String name1 = elements1[0];
                String[] elements2 = o2.split(" : ");
                String name2 = elements2[0];
                return name1.compareToIgnoreCase(name2);
            }
        });
		for (String phone : phoneList) {
			System.out.println(phone);
		}

	}


}
