package optionalpractice;

public class Customer {
    String name = null;
    int idNum = 0;
    public Customer(String name, int idNum) {
        this.name = name;
        this.idNum = idNum;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return idNum;
    }

    // Part A
    public int compareCustomer(Customer other) {
        int compareName = this.name.compareTo(other.name);
        if(compareName != 0) {
            return compareName;
        } else {
            if (this.idNum != other.idNum) {
                return this.idNum - other.idNum;
            }
        }
        return 0;
    }

    // Part B
    public void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result) {
        int listpos = 0;
        int i = 0;
        while(i < result.length) {
            if(list1[listpos].compareCustomer(list2[listpos]) < 0) {
                result[i] = list1[listpos];
                i++;
                if(i == result.length) {
                    break;
                }
                result[i] = list2[listpos];
            } else {
                result[i] = list2[listpos];
                i++;
                if(i == result.length) {
                    break;
                }
                result[i] = list1[listpos];
            }
            i++;
            listpos++;
        }
    }
}
