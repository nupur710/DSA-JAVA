package hashing;

public class DirectAddressTable {

    boolean[] table;
    public DirectAddressTable() {
        table = new boolean[26];
    }

    public static void main(String[] args) {
        DirectAddressTable dat= new DirectAddressTable();
        dat.insert('o');
        dat.insert('p');
        dat.insert('e');
        dat.insert('n');
        dat.insert('t');
        dat.insert('x');
        dat.insert('t');

        System.out.println(dat.search('e'));
        System.out.println(dat.search('k'));
        dat.delete('e');
        System.out.println(dat.search('e'));

    }

    void insert(char c) {
        table[c-97]= true;
    }

    void delete(char c) {
        table[c-97]= false;
    }

    boolean search(char c) {
        return table[c-97];
    }
}
